package TripleXGaming.Quantumcraft.Blocks;

import TripleXGaming.Quantumcraft.Quantumcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Iridium extends Block{

	public Iridium(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(6F);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockName("Quantumcraft:Iridium");
		this.setCreativeTab(Quantumcraft.tabQuantumcraft);
		this.setBlockTextureName("Quantumcraft:iridium");
	}


}
