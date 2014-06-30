package TripleXGaming.Quantumcraft;

import TripleXGaming.Quantumcraft.Blocks.DarkMatter;
import TripleXGaming.Quantumcraft.Blocks.Furture_Ore;
import TripleXGaming.Quantumcraft.Blocks.Iridium;
import TripleXGaming.Quantumcraft.Blocks.RubyOre;
import TripleXGaming.Quantumcraft.Blocks.Ruby_Block;
import TripleXGaming.Quantumcraft.Blocks.SaphireOre;
import TripleXGaming.Quantumcraft.Blocks.Saphire_Block;
import TripleXGaming.Quantumcraft.Blocks.VoidDirt;
import TripleXGaming.Quantumcraft.Blocks.VoidOre;
import TripleXGaming.Quantumcraft.Blocks.Void_Brick;
import TripleXGaming.Quantumcraft.Blocks.Void_Cobblestone;
import TripleXGaming.Quantumcraft.Blocks.Void_Stone;
import TripleXGaming.Quantumcraft.Entities.Entity;
import TripleXGaming.Quantumcraft.Entities.EntityMob1;
import TripleXGaming.Quantumcraft.Entities.Satellite;
import TripleXGaming.Quantumcraft.Packets.Packet1;
import TripleXGaming.Quantumcraft.Packets.Packet1Handler;
import TripleXGaming.Quantumcraft.QCCore.QCCoreBlocks;
import TripleXGaming.Quantumcraft.QCCore.QCCoreCrafting;
import TripleXGaming.Quantumcraft.QCCore.QCCoreItem;
import TripleXGaming.Quantumcraft.QCCore.QCCoreRegistry;
import TripleXGaming.Quantumcraft.Tools.ItemAxeVoid;
import TripleXGaming.Quantumcraft.Tools.ItemPickaxeRuby;
import TripleXGaming.Quantumcraft.Tools.ItemPickaxeSaphire;
import TripleXGaming.Quantumcraft.Tools.ItemPickaxeVoid;
import TripleXGaming.Quantumcraft.Tools.ItemSpadeVoid;
import TripleXGaming.Quantumcraft.dimension.BiomeGenBlackForest;
import TripleXGaming.Quantumcraft.dimension.WorldProviderTutorial;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod (modid = "Quantumcraft", name = "Quantumcraft", version = "1.1")

public class Quantumcraft {
	
	@Instance ( "Quantumcraft" )
	
	public static Quantumcraft modid;
	public static int BlackForestId = -2;
	
	public static CreativeTabs tabQuantumcraft = new tabQuantumcraft("Quantumcraft Items");
	
	public static Block Void_Stone = new Void_Stone(Material.rock);	
	public static BiomeGenBase blackForest;
	
	public static SimpleNetworkWrapper network;
	
	@SidedProxy (clientSide="TripleXGaming.Quantumcraft.client.ClientProxy", serverSide="TripleXGaming.Quantumcraft.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {
		
		proxy.registerRenderThings();
	    network = NetworkRegistry.INSTANCE.newSimpleChannel("Quantumcraft");
	    network.registerMessage(Packet1Handler.class, Packet1.class, 0, Side.SERVER);
		Entity.mainRegistry();
		QCCoreItem.InitItems();
		QCCoreBlocks.InitBlock();
		QCCoreRegistry.Initregistery();
		QCCoreCrafting.InitCraftingRecipes();
		DimensionManager.registerProviderType(Quantumcraft.BlackForestId, WorldProviderTutorial.class, false);     
		DimensionManager.registerDimension(Quantumcraft.BlackForestId, Quantumcraft.BlackForestId);
		blackForest = (new BiomeGenBlackForest(44)).setBiomeName("BlackForest").setColor(0x8F1D72);
	    //network.registerMessage(Packet1Handler.class, Packet1.class, 0, Side.CLIENT);
	    // network.registerMessage(SecondMessage.Handler.class, SecondMessage.class, 1, Side.CLIENT);
	}	

	@EventHandler
	public void load (FMLInitializationEvent event) {

		EntityRegistry.registerModEntity(EntityMob1.class, "tutorial mob", 1, this, 80, 3, true);
		EntityRegistry.registerModEntity(Satellite.class, "Satellite", 2, this, 80, 3, true);
		proxy.registerNetworkStuff();
		//registering to spawn mobs
		for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++){
		    if (BiomeGenBase.getBiomeGenArray()[i] != null){
		        EntityRegistry.addSpawn(EntityMob1.class, 13, 1, 1, EnumCreatureType.monster, BiomeGenBase.getBiomeGenArray()[i]);
		    }
		}
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
	}

	//Liquid materials
	public static Material DarknessFluidMaterial = new MaterialLiquid(MapColor.grassColor);
	}
