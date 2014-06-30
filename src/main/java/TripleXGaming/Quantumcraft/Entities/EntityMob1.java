package TripleXGaming.Quantumcraft.Entities;

import TripleXGaming.Quantumcraft.QCCore.QCCoreBlocks;
import TripleXGaming.Quantumcraft.QCCore.QCCoreItem;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;
 
public class EntityMob1 extends EntityMob
{
    public EntityMob1(World par1World)
    {
        super(par1World);
        this.setSize(1.5F, 2.5F);

        this.tasks.addTask(0, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(1, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(2, new EntityAILookIdle(this));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(4, new EntityAISwimming(this));

        this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
    }
    
    public int getAttackStrength(Entity par1Entity){
     return 4;
    }
    
    public boolean isAIEnabled(){
		return true;
    	
    }
    protected void applyEntityAttributes(){
    	super.applyEntityAttributes();
    	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D);
    	this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
    	
    	
    }
    
    //set item that mob drops 0 - 2
    /*
    protected Item getDropItem(){
    	return QCCoreItem.newItemVoidShard;
    }
     */
    protected void dropFewItems(boolean par1, int par2){
    	int random = this.rand.nextInt(8) + 1 + this.rand.nextInt(1 + par2);
    		if(random == 2){
    			this.dropItem(QCCoreItem.newItemVoidShard, 1) ;

    	}
    }
    
    
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
}