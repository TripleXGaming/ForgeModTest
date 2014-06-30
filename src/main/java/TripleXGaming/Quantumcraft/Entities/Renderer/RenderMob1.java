package TripleXGaming.Quantumcraft.Entities.Renderer;

import TripleXGaming.Quantumcraft.Entities.EntityMob1;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderMob1 extends RenderLiving{
    private static final ResourceLocation mobTextures = new ResourceLocation("Quantumcraft:textures/entity/Blade.png");
    private static final String __OBFID = "CL_00000984";

    public RenderMob1(ModelBase par1ModelBase, float par2){
        super(par1ModelBase, par2);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityMob1 par1EntityCow){
        return mobTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityMob1)par1Entity);
    }
}