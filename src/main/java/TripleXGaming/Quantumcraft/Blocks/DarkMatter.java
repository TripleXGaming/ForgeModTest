package TripleXGaming.Quantumcraft.Blocks;

import TripleXGaming.Quantumcraft.Quantumcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DarkMatter extends Block{
	public DarkMatter(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(18F);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockName("Quantumcraft:DarkMatter");
		this.setCreativeTab(Quantumcraft.tabQuantumcraft);
		this.setBlockTextureName("Quantumcraft:darkmatter_ore");
	}
}
