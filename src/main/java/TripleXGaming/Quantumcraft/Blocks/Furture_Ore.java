package TripleXGaming.Quantumcraft.Blocks;

import TripleXGaming.Quantumcraft.Quantumcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Furture_Ore extends Block{

	public Furture_Ore(Material p_i45394_1_) {
		super( Material.rock);
		this.setHardness(20F);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockName("Future_Ore");
		this.setCreativeTab(Quantumcraft.tabQuantumcraft);
		this.setBlockTextureName("Quantumcraft:future_ore");
	}

}
