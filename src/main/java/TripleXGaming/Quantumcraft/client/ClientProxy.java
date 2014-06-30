package TripleXGaming.Quantumcraft.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import TripleXGaming.Quantumcraft.CommonProxy;
import TripleXGaming.Quantumcraft.Quantumcraft;
import TripleXGaming.Quantumcraft.Entities.EntityMob1;
import TripleXGaming.Quantumcraft.Entities.Satellite;
import TripleXGaming.Quantumcraft.Entities.Renderer.RenderMob1;
import TripleXGaming.Quantumcraft.Entities.Renderer.RenderSatellite;
import TripleXGaming.Quantumcraft.model.ModelBlade;
import TripleXGaming.Quantumcraft.model.ModelHat;
import TripleXGaming.Quantumcraft.model.ModelSatellite;

public class ClientProxy extends CommonProxy {
	
    public void registerRenderThings() {
		VillagerRegistry.instance().registerVillagerSkin(1119, new ResourceLocation("Quantumcraft:textures/entity/b0bVillager.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityMob1.class, new RenderMob1(new ModelBlade(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Satellite.class, new RenderSatellite(new ModelSatellite(), 1));
    }

}
