package TripleXGaming.Quantumcraft.QCCore;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.oredict.OreDictionary;
import TripleXGaming.Quantumcraft.EventManager;
import TripleXGaming.Quantumcraft.Quantumcraft;
import TripleXGaming.Quantumcraft.Blocks.MyCustomItemSlab;
import TripleXGaming.Quantumcraft.QCVillager.QCVilagerTrade1;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.world.gen.structure.MapGenStructureIO;


public class QCCoreRegistry {
	public static void Initregistery(){
		
		//blocks
		GameRegistry.registerBlock(QCCoreBlocks.Void_Grass, QCCoreBlocks.Void_Grass.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Quantumcraft.Void_Stone, Quantumcraft.Void_Stone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(QCCoreBlocks.Void_Ore, QCCoreBlocks.Void_Ore.getUnlocalizedName().substring(5));		
		GameRegistry.registerBlock(QCCoreBlocks.Void_Cobblestone, QCCoreBlocks.Void_Cobblestone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(QCCoreBlocks.Ruby_Ore, QCCoreBlocks.Ruby_Ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(QCCoreBlocks.Saphire_Ore, QCCoreBlocks.Saphire_Ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(QCCoreBlocks.DarkMatter, QCCoreBlocks.DarkMatter.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(QCCoreBlocks.Void_Brick, QCCoreBlocks.Void_Brick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(QCCoreBlocks.Ruby_block, QCCoreBlocks.Ruby_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(QCCoreBlocks.Iridium, QCCoreBlocks.Iridium.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(QCCoreBlocks.Saphire_block, QCCoreBlocks.Saphire_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(QCCoreBlocks.dimportal, QCCoreBlocks.dimportal.getUnlocalizedName().substring(5));		
		GameRegistry.registerBlock(QCCoreBlocks.Void_BrickSlab, MyCustomItemSlab.class, QCCoreBlocks.Void_BrickSlab.getUnlocalizedName().substring(5));		
		GameRegistry.registerBlock(QCCoreBlocks.Void_BrickDoubleSlab, MyCustomItemSlab.class, QCCoreBlocks.Void_BrickDoubleSlab.getUnlocalizedName().substring(5));		

		
		//items
		GameRegistry.registerItem(QCCoreItem.newItemRuby, QCCoreItem.newItemRuby.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(QCCoreItem.newItemSaphire, QCCoreItem.newItemSaphire.getUnlocalizedName().substring(5));		
		GameRegistry.registerItem(QCCoreItem.VoidIngot, QCCoreItem.VoidIngot.getUnlocalizedName().substring(5));		
		GameRegistry.registerItem(QCCoreItem.newItemVoidShard, QCCoreItem.newItemVoidShard.getUnlocalizedName().substring(5));			
		//GameRegistry.registerItem(QCCoreItem.ItemPickaxeSaphire, QCCoreItem.ItemPickaxeSaphire.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(QCCoreItem.ItemPickaxeRuby, QCCoreItem.ItemPickaxeRuby.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(QCCoreItem.Copper, QCCoreItem.Copper.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(QCCoreItem.Silver, QCCoreItem.Silver.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(QCCoreItem.Titanium, QCCoreItem.Titanium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(QCCoreItem.MatterManipulator, QCCoreItem.MatterManipulator.getUnlocalizedName().substring(5));

		//ore generation
		EventManager eventmanager = new EventManager();
		GameRegistry.registerWorldGenerator(eventmanager, 0);

		VillagerRegistry.instance().registerVillagerId(1119);
		QCVilagerTrade1 QCVillager1 = new QCVilagerTrade1();
		VillagerRegistry.instance().registerVillageTradeHandler(1119, QCVillager1);
		
		OreDictionary.registerOre("CopperIngot", QCCoreItem.Copper);
		OreDictionary.registerOre("TitaniumIngot", QCCoreItem.Titanium);
		OreDictionary.registerOre("SilverIngot", QCCoreItem.Silver);
		OreDictionary.registerOre("gemSaphire", QCCoreItem.newItemSaphire);
		OreDictionary.registerOre("gemRuby", QCCoreItem.newItemRuby);
		}
}
