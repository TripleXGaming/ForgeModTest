package TripleXGaming.Quantumcraft.QCCore;

import TripleXGaming.Quantumcraft.Quantumcraft;
import TripleXGaming.Quantumcraft.Blocks.DarkMatter;
import TripleXGaming.Quantumcraft.Blocks.Furture_Ore;
import TripleXGaming.Quantumcraft.Blocks.Iridium;
import TripleXGaming.Quantumcraft.Blocks.MyCustomSlabs;
import TripleXGaming.Quantumcraft.Blocks.RubyOre;
import TripleXGaming.Quantumcraft.Blocks.Ruby_Block;
import TripleXGaming.Quantumcraft.Blocks.SaphireOre;
import TripleXGaming.Quantumcraft.Blocks.Saphire_Block;
import TripleXGaming.Quantumcraft.Blocks.VoidOre;
import TripleXGaming.Quantumcraft.Blocks.Void_Brick;
import TripleXGaming.Quantumcraft.Blocks.Void_BrickDoubleSlab;
import TripleXGaming.Quantumcraft.Blocks.Void_BrickSlab;
import TripleXGaming.Quantumcraft.Blocks.Void_Cobblestone;
import TripleXGaming.Quantumcraft.Blocks.Void_Grass;
import TripleXGaming.Quantumcraft.Blocks.Void_Stone;
import TripleXGaming.Quantumcraft.Blocks.dimportal;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class QCCoreBlocks {

	public static Block Void_Grass;
	public static Block Void_Cobblestone;
	public static VoidOre Void_Ore;
	public static Block Future_Ore;
	public static Block Future_Ore5;
	public static Block Void_Brick;
	public static Block Ruby_block;
	public static Block Saphire_block;
	public static Block Saphire_Ore;
	public static Block Ruby_Ore;
	public static Block Iridium;
	public static Block Future_Ore2;
	public static Block Future_Ore3;
	public static Block Future_Ore4;
	public static BlockFlower GlowFlower;
    public static Block DarkMatter;
    public static Block dimportal;
    public static Block Void_BrickSlab;
    public static Block Void_BrickDoubleSlab;
    public static Block QCSlab;
    public static Block QCDoubleSlab;
    
	public static void InitBlock(){
		dimportal = new dimportal();
		Void_Grass = new Void_Grass(Material.grass);
		Void_Cobblestone = new Void_Cobblestone(Material.rock);
		Void_Ore = new VoidOre(Material.rock);
		Future_Ore = new Furture_Ore(Material.rock);	
		Void_Brick = new Void_Brick(Material.rock);
		Ruby_block = new Ruby_Block(Material.iron);
		Saphire_block = new Saphire_Block(Material.iron);
		Saphire_Ore = new SaphireOre(Material.rock);	
		Ruby_Ore = new RubyOre(Material.rock);	
		Iridium = new Iridium(Material.rock);
		DarkMatter = new DarkMatter(Material.rock);
		Void_BrickSlab = new MyCustomSlabs(false, QCCoreBlocks.Void_Brick.getMaterial(), 0, Void_BrickSlab, QCCoreBlocks.Void_Brick, 0).setBlockName("Void_BrickSlab");
		Void_BrickDoubleSlab = new MyCustomSlabs(true, Blocks.wool.getMaterial(), 0, Void_BrickSlab, QCCoreBlocks.Void_Brick, 0).setBlockName("Void_BrickDoubleSlab");
	}
}
