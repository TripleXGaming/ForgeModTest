package TripleXGaming.Quantumcraft;

import java.util.Random;

import TripleXGaming.Quantumcraft.QCCore.QCCoreBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId){
		case -1:
		    generateNether(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 0:
		    generateSurface(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 1:
		    generateEnd(world, random, chunkX * 16, chunkZ * 16);
		    break;
		}
		
		
		
		
		
	}

	private void generateEnd(World world, Random random, int i, int j) {
		
	}

	private void generateSurface(World world, Random random, int i, int j) {
		
		for(int kSaphire = 0; kSaphire < 59; kSaphire++) {
			
			int BlockSaphireXCoord = i + random.nextInt(16);
			int BlockSaphireYCoord = random.nextInt(64);
			int BlockSaphireZCoord = j + random.nextInt(16);
			
		for(int kRuby = 0; kRuby < 59; kRuby++) {
			int BlockRubyXCoord = i + random.nextInt(16);
			int BlockRubyYCoord = random.nextInt(64);
			int BlockRubyZCoord = j + random.nextInt(16);
			
		for(int kDarkMatter = 0; kDarkMatter < 109; kDarkMatter++) {	
			int BlockDarkMatterXCoord = i + random.nextInt(16);
			int BlockDarkMatterYCoord = random.nextInt(64);
			int BlockDarkMatterZCoord = j + random.nextInt(16);
			
		for(int kVoid = 0; kVoid < 109; kVoid++) {		
			int BlockVoidXCoord = i + random.nextInt(16);
			int BlockVoidYCoord = random.nextInt(64);
			int BlockVoidZCoord = j + random.nextInt(16);
			
			(new WorldGenMinable(QCCoreBlocks.Saphire_Ore, 9+random.nextInt(7))).generate(world, random, BlockSaphireXCoord, BlockSaphireYCoord, BlockSaphireZCoord);
			(new WorldGenMinable(QCCoreBlocks.Ruby_Ore, 9+random.nextInt(7))).generate(world, random, BlockRubyXCoord, BlockRubyYCoord, BlockRubyZCoord);
			(new WorldGenMinable(QCCoreBlocks.Void_Ore, 1+random.nextInt(1))).generate(world, random, BlockVoidXCoord, BlockVoidYCoord, BlockVoidZCoord);
			(new WorldGenMinable(QCCoreBlocks.DarkMatter, 9+random.nextInt(7))).generate(world, random, BlockDarkMatterXCoord, BlockDarkMatterYCoord, BlockDarkMatterZCoord);

			}
		}
	}
}
		
}

	private void generateNether(World world, Random random, int i, int j) {
		
	}
	
	
	
	

}
