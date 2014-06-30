package TripleXGaming.Quantumcraft.Items;

import TripleXGaming.Quantumcraft.Quantumcraft;
import TripleXGaming.Quantumcraft.Packets.Packet1;
import TripleXGaming.Quantumcraft.QCCore.QCCoreBlocks;
import TripleXGaming.Quantumcraft.QCCore.QCCoreItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;



public class MatterManipulator extends Item {
	
	public static Block heldBlock;
	public static Material blockMaterial;
	public static String blockMaterialSound;
	
	
	public MatterManipulator() {
		this.setCreativeTab(Quantumcraft.tabQuantumcraft);
	}
	
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float x1, float y1, float z1){
    	if(!world.isRemote){
    		if(player.isSneaking()){
    			heldBlock = world.getBlock(x, y, z);
    			blockMaterial = heldBlock.getMaterial();
    			player.addChatMessage(new ChatComponentTranslation("You have selected : " + heldBlock.getLocalizedName() + "  " + blockMaterial + " " + Material.grass));
    		}else if(heldBlock != null && world.getBlock(x, y, z) != heldBlock){
    			blockMaterialSound = getMaterialName(blockMaterial);
    			world.playSoundEffect((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, blockMaterialSound, 1.0F, Item.itemRand.nextFloat() * 0.4F + 0.8F);  
    			world.setBlock(x, y, z, heldBlock);
    			//System.out.println("Debug - " + " side " + side  + " x " + x  + " y " + y  + " z " + z  + " x1 " + x1  + " y1 " + y1  + " z1 " + z1);
            return true;
    		}
    	}
        return false;
    }
    
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player){
    	player.openGui(Quantumcraft.modid, 1, world, 0, 0, 0);
		return itemstack;
    	
        	//player.inventory.addItemStackToInventory(new ItemStack(heldBlock,1));
        	//Quantumcraft.network.sendToServer(new Packet1(3));
    }
    
    
    public static String getMaterialName(Material blockMaterial){
    	if(blockMaterial == Material.grass){
    		return "dig.grass";
    	}else if(blockMaterial == Material.ground){
    		return "dig.ground";	
    	}
		return "dig.stone";
    }
    
}
