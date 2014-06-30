package TripleXGaming.Quantumcraft.QCCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import TripleXGaming.Quantumcraft.Quantumcraft;
import TripleXGaming.Quantumcraft.Items.Copper;
import TripleXGaming.Quantumcraft.Items.MatterManipulator;
import TripleXGaming.Quantumcraft.Tools.ItemAxeVoid;
import TripleXGaming.Quantumcraft.Tools.ItemPickaxeRuby;
import TripleXGaming.Quantumcraft.Tools.ItemPickaxeSaphire;
import TripleXGaming.Quantumcraft.Tools.ItemPickaxeVoid;
import TripleXGaming.Quantumcraft.Tools.ItemSpadeVoid;
import TripleXGaming.Quantumcraft.Tools.ItemSwordVoid;

public class QCCoreItem {
	
	public static Item ItemAxeVoid;
	public static Item ItemPickaxeVoid;
	public static Item ItemSpadeVoid;
	public static Item ItemPickaxeSaphire;
	public static Item ItemPickaxeRuby;
	public static Item ItemSwordVoid;
	public static Item newItemVoidShard;
	public static Item newItemRuby;
	public static Item newItemSaphire;
	public static Item VoidIngot;
	public static Item Titanium;
	public static Item Copper;
	public static Item Silver;
	public static Item MatterManipulator;
	
	public static void InitItems() {

		MatterManipulator = new MatterManipulator().setUnlocalizedName("Quantumcraft:MatterManipulator").setTextureName("diamond");
		newItemVoidShard = new Item().setUnlocalizedName("Quantumcraft:VoidShard").setTextureName("Quantumcraft:void_shard").setCreativeTab(Quantumcraft.tabQuantumcraft);
		newItemRuby = new Item().setUnlocalizedName("quantumcraft:ruby").setTextureName("Quantumcraft:ruby").setCreativeTab(Quantumcraft.tabQuantumcraft);
		newItemSaphire = new Item().setUnlocalizedName("quantumcraft:Saphire").setTextureName("Quantumcraft:saphire").setCreativeTab(Quantumcraft.tabQuantumcraft);
		VoidIngot = new Item().setUnlocalizedName("VoidIngot").setTextureName("quantumcraft:void_ingot").setCreativeTab(Quantumcraft.tabQuantumcraft);
		Copper = new Copper().setUnlocalizedName("Copper").setTextureName("quantumcraft:Copper").setCreativeTab(Quantumcraft.tabQuantumcraft);
		Titanium = new Item().setUnlocalizedName("Titanium").setTextureName("quantumcraft:Titanium").setCreativeTab(Quantumcraft.tabQuantumcraft);
		Silver = new Item().setUnlocalizedName("Silver").setTextureName("quantumcraft:Silver").setCreativeTab(Quantumcraft.tabQuantumcraft);
			
	}
}
