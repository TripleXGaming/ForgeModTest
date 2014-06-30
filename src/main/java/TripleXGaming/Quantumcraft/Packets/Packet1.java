package TripleXGaming.Quantumcraft.Packets;


import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import TripleXGaming.Quantumcraft.QCCore.QCCoreBlocks;
import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Packet1 implements IMessage{
	
    public int extremelyImportantInteger; 

    public Packet1() {}

    public Packet1(int a) { 
        this.extremelyImportantInteger = a;
    }

    @Override
    public void toBytes(ByteBuf buf) { 
        buf.writeInt(extremelyImportantInteger);
    }

    @Override
    public void fromBytes(ByteBuf buf) { 
        this.extremelyImportantInteger = buf.readInt();
    }
    

}