package TripleXGaming.Quantumcraft.Blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import TripleXGaming.Quantumcraft.Quantumcraft;
import TripleXGaming.Quantumcraft.QCCore.QCCoreBlocks;
import TripleXGaming.Quantumcraft.QCCore.QCCoreItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class VoidOre extends Block{

	public VoidOre(Material p_i45394_1_) {
		super( Material.rock);
		this.setBlockTextureName("Quantumcraft:void_ore");
		this.setCreativeTab(Quantumcraft.tabQuantumcraft);
		this.setBlockName("Void_Ore");
		this.setHardness(2F);
	}



	public int quantityDropped(Random par1Random)
    {
        return 4 + par1Random.nextInt(2);
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

    }
   
    
    public VoidOre blockPicked(World par1World, int par2, int par3, int par4)
    {
        return QCCoreBlocks.Void_Ore;
    }
    
    
}




























/*
public class VoidOre extends BlockOre {

	public String blockName = "Void_Ore";
	
	public VoidOre(int id) {
		super(id);
		this.setUnlocalizedName("Void_Ore");
		this.setHardness(4.0F);
		this.setLightValue(0.2F);
		this.setResistance(5.0F);
	
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon("Quantumcraft:void_ore");
	}
	
	public int idDropped(int par1, Random random, int Three) {
		 return QCCoreItem.newItemVoidShard.itemID;
	}
	
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta){
		if(EnchantmentHelper.getEnchantmentLevel(Enchantment.silkTouch.effectId, Minecraft.getMinecraft().thePlayer.getHeldItem()) == 0){
			this.dropXpOnBlockBreak(world, x, y , z, 10);}
	}
}	*/