public class Pyramid extends SuperSquare
{

   //add additionalfields 
   private double height;
   private String material;
   
   //no-arg constructor
   public Pyramid()
   {
      side = 593;
      height = 15;
      color = "red";
      material = "Red Wood";
   }

   public Pyramid(double s, String c)
   {
      super(s, c);
      material = "Red Wood";
      height = 15;
      
   }  
   
   public Pyramid (double s, double height, String c, String m)
   {
      side = s;
      this.height = height;
      color = c;
      material = m;
   }
   
   public void setMaterial(String material)
   {
      this.material = material;
   }
   
   public String getMaterial()
   {
      return material;
   }
   
   public double getArea()
   {
      return super.getArea() + 2 * (side * Math.sqrt((Math.pow(side, 2) / 4) + Math.pow(height, 2)));
   }
   
   public double getVolume()
   {
      return (double)((1/3) * super.getArea() * height);
   }
   
   public String toString()
   {
      String str = super.toString() + "\nHeight: " + height + 
                                      "\nMaterial: " + material +
                                      "\nSurface Area: " + getArea() +
                                      "\nVolume: " + (double)getVolume();
      return str;
   }
}  