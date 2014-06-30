package TripleXGaming.Quantumcraft.Blocks;

import TripleXGaming.Quantumcraft.Quantumcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Ruby_Block extends Block{

	public Ruby_Block(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(5F);
		this.setStepSound(Block.soundTypeMetal);
		this.setBlockName("Quantumcraft:Ruby_block");
		this.setCreativeTab(Quantumcraft.tabQuantumcraft);
		this.setBlockTextureName("Quantumcraft:ruby_block");
	}


}
