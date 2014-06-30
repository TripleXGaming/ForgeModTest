package TripleXGaming.Quantumcraft.dimension;


import java.util.Random;

import TripleXGaming.Quantumcraft.Quantumcraft;
import TripleXGaming.Quantumcraft.Entities.EntityMob1;
import TripleXGaming.Quantumcraft.QCCore.QCCoreBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBlackForest extends BiomeGenBase
{
    public BiomeGenBlackForest(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new SpawnListEntry(EntityOcelot.class, 2, 4, 8));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityMob1.class, 2, 4, 8));
        this.topBlock = QCCoreBlocks.Void_Grass;
        this.fillerBlock = QCCoreBlocks.Void_Cobblestone;
        this.theBiomeDecorator.treesPerChunk = 3;
        this.sky.setColor(0xE42D17);
        //this.theBiomeDecorator.deadBushPerChunk = 2;
        //this.theBiomeDecorator.reedsPerChunk = 50;
        //this.theBiomeDecorator.cactiPerChunk = 10;
        this.waterColorMultiplier = 0xE42D17;
        this.setDisableRain();

    }
    public int getBiomeGrassColor(){
    	//color black
    	//return 0x2a2a2a;
    	// color red	
    	return 0xFF0000;
    }
    @Override
	public void genTerrainBlocks(World world, Random random, Block[] blocks, byte[] bytes, int int1, int int2, double d) {
		boolean flag = true;
        Block block = this.topBlock;
        byte b0 = (byte)(this.field_150604_aj & 255);
        Block block1 = this.fillerBlock;
        int k = -1;
        int l = (int)(d / 3.0D + 3.0D + random.nextDouble() * 0.25D);
        int i1 = int1 & 15;
        int j1 = int2 & 15;
        int k1 = blocks.length / 256;

        for (int l1 = 255; l1 >= 0; --l1)
        {
            int i2 = (j1 * 16 + i1) * k1 + l1;

            if (l1 <= 0 + random.nextInt(5))
            {
                blocks[i2] = Blocks.bedrock;
            }
            else
            {
                Block block2 = blocks[i2];

                if (block2 != null && block2.getMaterial() != Material.air)
                {
                    if (block2 == Quantumcraft.Void_Stone)
                    {
                        if (k == -1)
                        {
                            if (l <= 0)
                            {
                                block = null;
                                b0 = 0;
                                block1 = Quantumcraft.Void_Stone;
                            }
                            else if (l1 >= 59 && l1 <= 64)
                            {
                                block = this.topBlock;
                                b0 = (byte)(this.field_150604_aj & 255);
                                block1 = this.fillerBlock;
                            }

                            if (l1 < 63 && (block == null || block.getMaterial() == Material.air))
                            {
                                if (this.getFloatTemperature(int1, l1, int2) < 0.15F)
                                {
                                    block = Blocks.ice;
                                    b0 = 0;
                                }
                                else
                                {
                                    block = Blocks.water;
                                    b0 = 0;
                                }
                            }

                            k = l;

                            if (l1 >= 62)
                            {
                                blocks[i2] = block;
                                bytes[i2] = b0;
                            }
                            else if (l1 < 56 - l)
                            {
                                block = null;
                                block1 = Quantumcraft.Void_Stone;
                                blocks[i2] = Blocks.gravel;
                            }
                            else
                            {
                                blocks[i2] = block1;
                            }
                        }
                        else if (k > 0)
                        {
                            --k;
                            blocks[i2] = block1;

                            if (k == 0 && block1 == Blocks.sand)
                            {
                                k = random.nextInt(4) + Math.max(0, l1 - 63);
                                block1 = Blocks.sandstone;
                            }
                        }
                    }
                }
                else
                {
                    k = -1;
                }
            }
        }
	}
}