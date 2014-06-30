package TripleXGaming.Quantumcraft.Blocks;

import java.util.Random;

import TripleXGaming.Quantumcraft.Quantumcraft;
import TripleXGaming.Quantumcraft.QCCore.QCCoreBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Void_Stone extends Block{

	public Void_Stone(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(2F);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockName("Void_Stone");
		this.setCreativeTab(Quantumcraft.tabQuantumcraft);
		this.setBlockTextureName("Quantumcraft:void_stone");
	}
	
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_){
        return Item.getItemFromBlock(QCCoreBlocks.Void_Cobblestone);
    }
}
