package TripleXGaming.Quantumcraft.Tools;

import java.awt.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPickaxeVoid extends ItemPickaxe{

	


	protected ItemPickaxeVoid(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register){
		this.itemIcon = register.registerIcon("Quantumcraft:void_pickaxe");
	}
	
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean i) {
    	System.out.println("hello");
    	list.add("hello");
    }



	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5){
	if(itemstack.isItemEnchanted() == false){
	itemstack.addEnchantment(Enchantment.fortune, 3);
	}
	
	
	}


}
