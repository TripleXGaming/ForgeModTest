package TripleXGaming.Quantumcraft.Blocks;

import TripleXGaming.Quantumcraft.Quantumcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Void_Cobblestone extends Block{

	public Void_Cobblestone(Material p_i45394_1_) {
		super(Material.rock);
		this.setHardness(2F);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockName("Void_Cobblestone");
		this.setCreativeTab(Quantumcraft.tabQuantumcraft);
		this.setBlockTextureName("Quantumcraft:void_cobblestone");
	}



}
