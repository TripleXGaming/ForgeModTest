package TripleXGaming.Quantumcraft.Tools;

import java.awt.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSwordVoid extends ItemSword{



	public ItemSwordVoid(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register){
		this.itemIcon = register.registerIcon("Quantumcraft:void_Sword");
	}
	
    @SideOnly(Side.CLIENT)

    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean i) {
    	list.add("hello");
    }
    
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase){
        par1ItemStack.damageItem(1, par3EntityLivingBase);
		((EntityLivingBase)par2EntityLivingBase).addPotionEffect(new PotionEffect(Potion.wither.id, 200, 1));
        return true;
    }

	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean i){
	if(itemstack.isItemEnchanted() == false){
	itemstack.addEnchantment(Enchantment.sharpness, 2);
	}
}
}
