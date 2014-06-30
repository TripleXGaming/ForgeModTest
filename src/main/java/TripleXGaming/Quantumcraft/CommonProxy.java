package TripleXGaming.Quantumcraft;

import TripleXGaming.Quantumcraft.Handler.QCGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.world.World;

public class CommonProxy {

    public void registerRenderInformation() {
	}

    public World getClientWorld(){
        return null;
    }
    
	public void registerRenderThings() {
	}
	
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(Quantumcraft.modid, new QCGuiHandler());
		
	}
	

}
