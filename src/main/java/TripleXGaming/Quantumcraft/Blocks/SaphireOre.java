package TripleXGaming.Quantumcraft.Blocks;

import java.util.Random;

import TripleXGaming.Quantumcraft.Quantumcraft;
import TripleXGaming.Quantumcraft.QCCore.QCCoreItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SaphireOre extends Block {
	public SaphireOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(3F);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockName("quantumcraft:Saphire_ore");
		this.setCreativeTab(Quantumcraft.tabQuantumcraft);
		this.setBlockTextureName("Quantumcraft:saphire_ore");
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_){
		return QCCoreItem.newItemSaphire;
	}
	
	
}