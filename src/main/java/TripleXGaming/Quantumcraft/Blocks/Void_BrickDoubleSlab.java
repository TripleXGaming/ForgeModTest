package TripleXGaming.Quantumcraft.Blocks;

import TripleXGaming.Quantumcraft.QCCore.QCCoreBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Void_BrickDoubleSlab extends BlockSlab {

	public Void_BrickDoubleSlab(boolean fullblock, Material material) {
		super(fullblock, material);
		this.setBlockName("Void_BrickDoubleSlab");
		this.setHardness(2F);
		this.setBlockTextureName("Quantumcraft:void_brick");
		}

	@Override
	public String func_150002_b(int p_150002_1_) {
		return "Quantumcraft:void_brick";
	}
	
	protected ItemStack createStackedBlock(int p_149644_1_){
		return new ItemStack(Item.getItemFromBlock(QCCoreBlocks.Void_BrickSlab), 2, p_149644_1_ & 7);
	}
}
