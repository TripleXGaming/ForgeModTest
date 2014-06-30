package TripleXGaming.Quantumcraft.Blocks;

import static net.minecraftforge.common.util.ForgeDirection.UP;
import TripleXGaming.Quantumcraft.Quantumcraft;
import TripleXGaming.Quantumcraft.QCCore.QCCoreBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class Void_Grass extends Block{
	
     @SideOnly(Side.CLIENT)
	 private IIcon field_149991_b;
	private IIcon field_149993_M;
	private IIcon field_149994_N;

	public Void_Grass(Material grass) {
        super(Material.grass);
        this.setTickRandomly(true);
        this.setHardness(2F).setStepSound(Block.soundTypeGrass);
        this.setBlockName("Void_Grass");
        this.setCreativeTab(Quantumcraft.tabQuantumcraft);
        this.setBlockTextureName("Quantumcraft:void_grass");
	}
	@Override
	public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable)
    {
        Block plant = plantable.getPlant(world, x, y + 1, z);
        EnumPlantType plantType = plantable.getPlantType(world, x, y + 1, z);

        if (plant == Blocks.cactus && this == Blocks.cactus)
        {
            return true;
        }

        if (plant == Blocks.reeds && this == Blocks.reeds)
        {
            return true;
        }

        if (plantable instanceof BlockBush)
        {
            return true;
        }

        switch (plantType){
            case Desert: //return this == Blocks.sand;
            case Nether: return this == Blocks.soul_sand;
            case Crop:   return this == Blocks.farmland;
            case Cave:   return isSideSolid(world, x, y, z, UP);
            case Plains: return this == QCCoreBlocks.Void_Grass || this == Blocks.dirt;
            case Water:  return world.getBlock(x, y, z).getMaterial() == Material.water && world.getBlockMetadata(x, y, z) == 0;
            case Beach:
                boolean isBeach = this == QCCoreBlocks.Void_Grass || this == Blocks.dirt;// || this == Blocks.sand;
                boolean hasWater = (world.getBlock(x - 1, y, z    ).getMaterial() == Material.water ||
                                    world.getBlock(x + 1, y, z    ).getMaterial() == Material.water ||
                                    world.getBlock(x,     y, z - 1).getMaterial() == Material.water ||
                                    world.getBlock(x,     y, z + 1).getMaterial() == Material.water);
                return isBeach && hasWater;
        }

        return false;
    }
	
    public int getBiomeGrassColor(){
    	//color black
    	return 0x2a2a2a;
    	// color red	
  //  	return 0xFF0000;
    }
    
	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (!p_149674_1_.isRemote)
        {
            if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) < 4 && p_149674_1_.getBlockLightOpacity(p_149674_2_, p_149674_3_ + 1, p_149674_4_) > 2)
            {
                p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, Blocks.dirt);
            }
            else if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = p_149674_2_ + p_149674_5_.nextInt(3) - 1;
                    int j1 = p_149674_3_ + p_149674_5_.nextInt(5) - 3;
                    int k1 = p_149674_4_ + p_149674_5_.nextInt(3) - 1;
                    Block block = p_149674_1_.getBlock(i1, j1 + 1, k1);

                    if (p_149674_1_.getBlock(i1, j1, k1) == Blocks.dirt && p_149674_1_.getBlockMetadata(i1, j1, k1) == 0 && p_149674_1_.getBlockLightValue(i1, j1 + 1, k1) >= 4 && p_149674_1_.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        p_149674_1_.setBlock(i1, j1, k1, QCCoreBlocks.Void_Grass);
                    }
                }
            }
        }
    }
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
    {
        if (p_149673_5_ == 1)
        {
            return this.field_149991_b;
        }
        else if (p_149673_5_ == 0)
        {
            return Blocks.dirt.getBlockTextureFromSide(p_149673_5_);
        }
        else
        {
            Material material = p_149673_1_.getBlock(p_149673_2_, p_149673_3_ + 1, p_149673_4_).getMaterial();
            return material != Material.snow && material != Material.craftedSnow ? this.blockIcon : this.field_149993_M;
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.field_149991_b = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.field_149993_M = p_149651_1_.registerIcon(this.getTextureName() + "_side_snowed");
        this.field_149994_N = p_149651_1_.registerIcon(this.getTextureName() + "_side_overlay");
    }


	
    @SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        double d0 = 0.5D;
        double d1 = 1.0D;
        return 0x871A52;
    }

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_)
    {
    	return 0x871A52;
    }
    
	@SideOnly(Side.CLIENT)
	    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	    {
	        return p_149691_1_ == 1 ? this.field_149991_b : (p_149691_1_ == 0 ? Blocks.dirt.getBlockTextureFromSide(p_149691_1_) : this.blockIcon);
	    }
	
	 @SideOnly(Side.CLIENT)
	    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
	    {
	        int l = 0;
	        int i1 = 0;
	        int j1 = 0;

	        for (int k1 = -1; k1 <= 1; ++k1)
	        {
	            for (int l1 = -1; l1 <= 1; ++l1)
	            {
	                int i2 = p_149720_1_.getBiomeGenForCoords(p_149720_2_ + l1, p_149720_4_ + k1).getBiomeGrassColor(p_149720_2_ + l1, p_149720_3_, p_149720_4_ + k1);
	                l += (i2 & 16711680) >> 16;
	                i1 += (i2 & 65280) >> 8;
	                j1 += i2 & 255;
	            }
	        }

	        return 0x871A52;
	    }
	 
}

