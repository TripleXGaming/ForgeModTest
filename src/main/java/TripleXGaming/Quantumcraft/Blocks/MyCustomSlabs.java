package TripleXGaming.Quantumcraft.Blocks;

import java.util.List;
import java.util.Random;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import TripleXGaming.Quantumcraft.Quantumcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class MyCustomSlabs extends BlockSlab{

private boolean isDoubleSlab;
private int numSubBlocks;
private Block singleSlab;
private Block textureBlock;
private int textureStartCounter;


/**
  * Creates a new custom slab
  * @param _isDoubleSlab determines if the slab represents the half block or the full block
  * @param material is the material of the slabs
  * @param _numSubBlocks is the number of metadata sub blocks (can't be more than 8)
  * @param _singleSlab the block representing the half slab and also the block to drop when harvesting a full slab block
  * @param _textureBlock the block from which to retrieve the texture
  * @param _textureStartCounter the starting index from which to retrieve a texture from a metadata block
  */
public MyCustomSlabs(boolean _isDoubleSlab, Material material, int _numSubBlocks, Block _singleSlab, Block _textureBlock, int _textureStartCounter) {
  super(_isDoubleSlab, material);
  setHardness(2.0F);
  setResistance(5.0F);
  setStepSound(Block.soundTypeStone);                     
  useNeighborBrightness = true;
  if(_isDoubleSlab)
   setCreativeTab(null); //Set the creative tab to null so that the double slab blocks will not appear in the creative tabs
  else
   setCreativeTab(Quantumcraft.tabQuantumcraft); //Set your creative tab, for example: setCreativeTab(MyModName.tabBlocks)
  isDoubleSlab = _isDoubleSlab;
  numSubBlocks = _numSubBlocks;
  singleSlab = _singleSlab;
  textureBlock = _textureBlock;
  textureStartCounter = _textureStartCounter;
}

@Override
@SideOnly(Side.CLIENT)
public void getSubBlocks(Item par1, CreativeTabs tab, List subItems)
        {
         for (int ix = 0; ix < numSubBlocks; ix++)
         {
          subItems.add(new ItemStack(this, 1, ix));
         }
}

@SideOnly(Side.CLIENT)
public IIcon getIcon(int side, int meta)
{
  return textureBlock.getIcon(side, (meta % 8) + textureStartCounter);
}


@Override
public Item getItemDropped(int par1, Random rand, int par3)
{
  return (isDoubleSlab ? Item.getItemFromBlock(singleSlab) : Item.getItemFromBlock(this));
}

@Override
        public int quantityDropped(Random rand)
        {
                return (isDoubleSlab ? 2 : 1);
        }

@Override
public int damageDropped (int metadata) {
  return metadata % 8;
}



@Override
protected ItemStack createStackedBlock(int meta)           
{                          
  return new ItemStack(singleSlab, 2, meta & 7);       
}          



@Override
//In Forge 1.6.4 it was "getFullSlabName"
public String func_150002_b(int par1)
{
  if ((par1 < 0) || (par1 >= numSubBlocks))                        
  {                                        
   par1 = 0;                       
  }                        
  return super.getUnlocalizedName() + "." + (par1+1);  
}
}