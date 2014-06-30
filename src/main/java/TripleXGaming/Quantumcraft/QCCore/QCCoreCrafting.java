package TripleXGaming.Quantumcraft.QCCore;

import TripleXGaming.Quantumcraft.Quantumcraft;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class QCCoreCrafting {
	public static void InitCraftingRecipes(){
		// Register Smelting recipes
		GameRegistry.addSmelting(QCCoreBlocks.Void_Cobblestone, new ItemStack(Quantumcraft.Void_Stone, 1), 0.1F);
		
		//setting the recipes with the registered items above
		GameRegistry.addShapelessRecipe(new ItemStack(QCCoreItem.newItemRuby, 9), new ItemStack(QCCoreBlocks.Ruby_block));
		GameRegistry.addShapelessRecipe(new ItemStack(QCCoreItem.newItemSaphire, 9), new ItemStack(QCCoreBlocks.Saphire_block));

		GameRegistry.addRecipe(new ItemStack(QCCoreItem.ItemPickaxeVoid), "xxx", " y "," y ",
		        'x', QCCoreItem.newItemVoidShard, 'y', Items.blaze_rod);
		
		GameRegistry.addRecipe(new ItemStack(QCCoreBlocks.Ruby_block), "xxx", "xxx","xxx",
		        'x', QCCoreItem.newItemRuby);
		
		GameRegistry.addRecipe(new ItemStack(QCCoreBlocks.Saphire_block), "xxx", "xxx","xxx",
		        'x', QCCoreItem.newItemSaphire );
		
		GameRegistry.addRecipe(new ItemStack(QCCoreBlocks.Void_Brick), "xx", "xx", 'x', Quantumcraft.Void_Stone);
		
	}
}
