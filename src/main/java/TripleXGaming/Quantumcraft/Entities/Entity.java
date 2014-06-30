package TripleXGaming.Quantumcraft.Entities;

import net.minecraft.entity.EntityList;
import TripleXGaming.Quantumcraft.Quantumcraft;
import cpw.mods.fml.common.registry.EntityRegistry;

public class Entity {

	public static void mainRegistry(){
		registerEntity();
		
	}
	
	public static void registerEntity(){
		createEntity(EntityMob1.class, "Mob 1", 0x0022FF, 0xFF0000);
		createEntity(Satellite.class, "Satellite", 0x0034FF, 0xFF0222);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, Quantumcraft.modid, 64, 1, true);
		createEgg(randomId, solidColor, spotColor);
	}

	private static void createEgg(int randomId, int SolidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, SolidColor, spotColor));
	}
}
