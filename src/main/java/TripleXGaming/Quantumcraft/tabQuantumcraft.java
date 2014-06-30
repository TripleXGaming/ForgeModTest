package TripleXGaming.Quantumcraft;

import TripleXGaming.Quantumcraft.QCCore.QCCoreItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class tabQuantumcraft extends CreativeTabs {

public tabQuantumcraft(String tabLabel)
{
super(tabLabel);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return Items.diamond;
}

}

