package TripleXGaming.Quantumcraft.Packets;

import TripleXGaming.Quantumcraft.QCCore.QCCoreItem;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Packet1Handler implements IMessageHandler<Packet1, IMessage> { 
	
	@SideOnly(Side.SERVER)
    @Override
    public IMessage onMessage(Packet1 message, MessageContext ctx) { 
    	ctx.getServerHandler().playerEntity.inventory.addItemStackToInventory(new ItemStack(QCCoreItem.newItemVoidShard,message.extremelyImportantInteger));
        //System.out.println(message.extremelyImportantInteger);
        return null;
    }

}