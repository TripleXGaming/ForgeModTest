package TripleXGaming.Quantumcraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHat extends ModelBase
{
  //fields
    ModelRenderer StrikHart;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
  
  public ModelHat()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      StrikHart = new ModelRenderer(this, 19, 0);
      StrikHart.addBox(-2F, -2F, -2F, 4, 4, 3);
      StrikHart.setRotationPoint(0F, 18F, 6F);
      StrikHart.setTextureSize(64, 32);
      StrikHart.mirror = true;
      setRotation(StrikHart, 0F, 0F, 0.7853982F);
      Shape1 = new ModelRenderer(this, 0, 7);
      Shape1.addBox(0F, -1F, 0F, 8, 1, 1);
      Shape1.setRotationPoint(0F, 18F, 6F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, -3.141593F, 0.7853982F);
      //Shape1.mirror = false;
      Shape2 = new ModelRenderer(this, 1, 6);
      Shape2.addBox(0F, -2F, 0F, 7, 1, 1);
      Shape2.setRotationPoint(0F, 18F, 5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0.7853982F);
      //Shape2.mirror = false;
      Shape3 = new ModelRenderer(this, 2, 5);
      Shape3.addBox(0F, -3F, 0F, 6, 1, 1);
      Shape3.setRotationPoint(0F, 18F, 6F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, -3.141593F, 0.7853982F);
      //Shape3.mirror = false;
      Shape4 = new ModelRenderer(this, 3, 5);
      Shape4.addBox(0F, -4F, 0F, 5, 1, 1);
      Shape4.setRotationPoint(0F, 18F, 6F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, -3.141593F, 0.7853982F);
     // Shape4.mirror = false;
      Shape5 = new ModelRenderer(this, 4, 4);
      Shape5.addBox(0F, -5F, 0F, 4, 1, 1);
      Shape5.setRotationPoint(0F, 18F, 6F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, -3.141593F, 0.7853982F);
     // Shape5.mirror = false;
      Shape6 = new ModelRenderer(this, 5, 4);
      Shape6.addBox(0F, -6F, 0F, 3, 1, 1);
      Shape6.setRotationPoint(0F, 18F, 6F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, -3.141593F, 0.7853982F);
      //Shape6.mirror = false;
      Shape7 = new ModelRenderer(this, 6, 3);
      Shape7.addBox(0F, -7F, 0F, 2, 1, 1);
      Shape7.setRotationPoint(0F, 18F, 6F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, -3.141593F, 0.7853982F);
     // Shape7.mirror = false;
      Shape8 = new ModelRenderer(this, 7, 1);
      Shape8.addBox(0F, -8F, 0F, 1, 1, 1);
      Shape8.setRotationPoint(0F, 18F, 6F);
      Shape8.setTextureSize(64, 32);
     // Shape8.mirror = true;
      setRotation(Shape8, 0F, -3.141593F, 0.7853982F);
      Shape8.mirror = false;
      Shape9 = new ModelRenderer(this, 0, 7);
      Shape9.addBox(0F, -1F, 0F, 8, 1, 1);
      Shape9.setRotationPoint(0F, 18F, 5F);
      Shape9.setTextureSize(64, 32);
     // Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0.7853982F);
      Shape9.mirror = false;
      Shape10 = new ModelRenderer(this, 1, 6);
      Shape10.addBox(0F, -2F, 0F, 7, 1, 1);
      Shape10.setRotationPoint(0F, 18F, 6F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, -3.141593F, 0.7853982F);
      //Shape10.mirror = false;
      Shape11 = new ModelRenderer(this, 2, 5);
      Shape11.addBox(0F, -3F, 0F, 6, 1, 1);
      Shape11.setRotationPoint(0F, 18F, 5F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0.7853982F);
      Shape12 = new ModelRenderer(this, 3, 5);
      Shape12.addBox(0F, -4F, 0F, 5, 1, 1);
      Shape12.setRotationPoint(0F, 18F, 5F);
      Shape12.setTextureSize(64, 32);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0.7853982F);
      Shape13 = new ModelRenderer(this, 4, 4);
      Shape13.addBox(0F, -5F, 0F, 4, 1, 1);
      Shape13.setRotationPoint(0F, 18F, 5F);
      Shape13.setTextureSize(64, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0.7853982F);
      Shape14 = new ModelRenderer(this, 5, 4);
      Shape14.addBox(0F, -6F, 0F, 3, 1, 1);
      Shape14.setRotationPoint(0F, 18F, 5F);
      Shape14.setTextureSize(64, 32);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0.7853982F);
      Shape15 = new ModelRenderer(this, 6, 3);
      Shape15.addBox(0F, -7F, 0F, 2, 1, 1);
      Shape15.setRotationPoint(0F, 18F, 5F);
      Shape15.setTextureSize(64, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0.7853982F);
      Shape16 = new ModelRenderer(this, 7, 1);
      Shape16.addBox(0F, -8F, 0F, 1, 1, 1);
      Shape16.setRotationPoint(0F, 18F, 5F);
      Shape16.setTextureSize(64, 32);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0.7853982F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    StrikHart.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Shape15.render(f5);
    Shape16.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
