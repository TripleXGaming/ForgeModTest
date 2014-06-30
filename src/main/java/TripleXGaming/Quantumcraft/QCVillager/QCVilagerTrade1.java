package TripleXGaming.Quantumcraft.QCVillager;

import java.util.Random;

import TripleXGaming.Quantumcraft.QCCore.QCCoreItem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class QCVilagerTrade1 implements IVillageTradeHandler {

	@Override
	public void manipulateTradesForVillager(EntityVillager villager,
			MerchantRecipeList recipeList, Random random) {
		recipeList.add(new MerchantRecipe(new ItemStack(QCCoreItem.newItemVoidShard, 3, 0), new ItemStack(Items.blaze_rod, 2, 0), new ItemStack(QCCoreItem.ItemPickaxeVoid, 1, 0)));
		recipeList.add(new MerchantRecipe(new ItemStack(QCCoreItem.newItemVoidShard, 1, 0), new ItemStack(Items.blaze_rod, 2, 0), new ItemStack(QCCoreItem.ItemSpadeVoid, 1,0)));
	}
}
