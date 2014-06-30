package TripleXGaming.Quantumcraft.Blocks;

import TripleXGaming.Quantumcraft.Quantumcraft;
import TripleXGaming.Quantumcraft.QCCore.QCCoreBlocks;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Void_BrickSlab extends BlockSlab {

	public Void_BrickSlab(boolean p_i45410_1_, Material p_i45410_2_) {
        super(p_i45410_1_, p_i45410_2_);
        this.setCreativeTab(Quantumcraft.tabQuantumcraft);
		this.setBlockName("Void_BrickSlab");
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
