package TripleXGaming.Quantumcraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSatellite extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
  
  public ModelSatellite()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 16, 16, 16);
      Shape1.setRotationPoint(-8F, 8F, -8F);
      Shape1.setTextureSize(512, 512);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 40, 1, 2);
      Shape2.setRotationPoint(-8F, 12F, 1F);
      Shape2.setTextureSize(512, 512);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, -3.141593F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 40, 1, 2);
      Shape3.setRotationPoint(8F, 12F, -1F);
      Shape3.setTextureSize(512, 512);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 0F, 0F, 35, 0, 16);
      Shape4.setRotationPoint(-48F, 11.9F, -8F);
      Shape4.setTextureSize(512, 512);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(0F, 0F, 0F, 35, 0, 16);
      Shape5.setRotationPoint(13F, 11.9F, -8F);
      Shape5.setTextureSize(512, 512);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5 )
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
