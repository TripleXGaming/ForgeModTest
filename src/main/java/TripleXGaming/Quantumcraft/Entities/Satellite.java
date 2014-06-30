package TripleXGaming.Quantumcraft.Entities;

import java.util.Calendar;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import TripleXGaming.Quantumcraft.QCCore.QCCoreItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Satellite extends EntityAmbientCreature{
    public double fuelLevel = 270;
    public boolean LaunchEnable = true;
    private double gravity = 0.5D;
    private ChunkCoordinates spawnPosition;
    private static final String __OBFID = "CL_00001637";

    public Satellite(World par1World)
    {
        super(par1World);
        this.setSize(0.5F, 0.9F);
        this.isImmuneToFire();
        this.renderDistanceWeight = 100D;
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    public void onDeath(DamageSource par1DamageSource){
        super.onDeath(par1DamageSource);
        worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 14, true);
    }
    
    
    protected float getSoundVolume(){
        return 1F;
    }

    protected float getSoundPitch(){
        return super.getSoundPitch() * 0.95F;
    }

    protected String getLivingSound(){
        return  this.rand.nextInt(4) != 0 ? null : "random.fizz";
    }

    protected String getHurtSound(){
        return "random.anvil_land";
    }

    @Override
    protected boolean canDespawn(){
    	return false;
    }
    protected String getDeathSound(){
        return "random.anvil_break";
    }

    public boolean canBePushed(){
        return false;
    }


    protected void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0D);
    }

    protected boolean isAIEnabled(){
        return true;
    }
    protected boolean isAtAltitude(){
    	if(this.posY >= 135){
    		return true;	
    	}
		return false;
    }

    public void onUpdate(){
        super.onUpdate();
        this.motionY *= 0.1000000238418579D;
    }

    protected void updateAITasks()
    {
        super.updateAITasks();
        if(LaunchEnable){
            if (this.spawnPosition != null && (!this.worldObj.isAirBlock(this.spawnPosition.posX, this.spawnPosition.posY, this.spawnPosition.posZ) || this.spawnPosition.posY < 1))
            {
                this.spawnPosition = null;
            }

            if (this.spawnPosition == null || this.rand.nextInt(30) == 0 || this.spawnPosition.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 4.0F)
            {
                this.spawnPosition = new ChunkCoordinates((int)this.posX + this.rand.nextInt(7) - this.rand.nextInt(7), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(7) - this.rand.nextInt(7));
            }
            this.motionY += 0.0D;
           // double d0 = (double)this.spawnPosition.posX + 0.5D - this.posX;
           // double d1 = (double)this.spawnPosition.posY + 0.1D - this.posY;
           // double d2 = (double)this.spawnPosition.posZ + 0.5D - this.posZ;
            //this.motionX += (Math.signum(d0) * 0.5D - this.motionX) * 0.10000000149011612D;
            if(this.posY <= 135 && fuelLevel != 0){
            	this.setVelocity(0, 0.5D, 0);
                this.worldObj.playSoundAtEntity(this, "random.fizz", 1F, 0.2F);
                fuelLevel -= 1;
            }else if(fuelLevel == 0 && !isAtAltitude()){
                this.motionY -= gravity;
                this.gravity += 0.1D;
                if(this.onGround && fuelLevel == 0){
                	worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 14, true);
                	this.setDead();
                }
            }else{
                this.motionY += 0.0D;
            	this.setVelocity(0, 0.00000000149011612D, 0);
            }

            //this.motionZ += (Math.signum(d2) * 0.5D - this.motionZ) * 0.10000000149011612D;
          //  float f = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
            //float f1 = MathHelper.wrapAngleTo180_float(f - this.rotationYaw);
          //  this.moveForward = 0.5F;
          //  this.rotationYaw += f1;

        }
    }

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    protected boolean canTriggerWalking()
    {
        return false;
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float par1) {}

    /**
     * Takes in the distance the entity has fallen this tick and whether its on the ground to update the fall distance
     * and deal fall damage if landing on the ground.  Args: distanceFallenThisTick, onGround
     */
    protected void updateFallState(double par1, boolean par3) {}

    /**
     * Return whether this entity should NOT trigger a pressure plate or a tripwire.
     */
    public boolean doesEntityNotTriggerPressurePlate()
    {
        return true;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
    {
        if (this.isEntityInvulnerable())
        {
            return false;
        }
        else
        {

            return super.attackEntityFrom(par1DamageSource, par2);
        }
    }

    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.dataWatcher.updateObject(16, Byte.valueOf(par1NBTTagCompound.getByte("BatFlags")));
    }


    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setByte("BatFlags", this.dataWatcher.getWatchableObjectByte(16));
    }

}