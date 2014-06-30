package TripleXGaming.Quantumcraft.Blocks;

import TripleXGaming.Quantumcraft.Quantumcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Void_Brick extends Block{

	public Void_Brick(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(2F);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockName("Void_Brick");
		this.setCreativeTab(Quantumcraft.tabQuantumcraft);
		this.setBlockTextureName("Quantumcraft:void_brick");
		}
}
