//class
public class SqPyramid
{
   //Fields
   private double base;
   private double height;
   private String color;
   private static int count = 0;
   
   //Constructors
   public SqPyramid()
   {
      base = 93;
      height = 10;
      color = "blue";
      count++;
   }
    
   public SqPyramid(double b, double h, String c)
   {
      base = b;
      height = h;
      color = c;
      count++;
   }
   
   public SqPyramid(double base, double height)
   {
      this.base = base;
      this.height = height;
      color = "green";
      count++;
   }
   //copy constructor
   public SqPyramid (SqPyramid sp2)
   {
      base = sp2.base;
      height = sp2.height;
      color = sp2.color;
      count++;
   }
   
   //Mutators 
   public void setBase (double base)
   {
      this.base = base; 
   }
   
   public void setHeight (double height)
   {
      this.height = height;
   }
   
   public void changeColor (String newC)
   {
      color = newC;
   }
   
   //Accessors
   public double getHeight()
   {
      return height;
   }
   public double baseArea()
   {
      return Math.pow(base, 2);
   }
   
   public double surfaceArea()
   {
      return baseArea() + (2 * base * Math.sqrt(baseArea() / 4 + Math.pow(height, 2)));
   }
   
   public double volume()
   {
      return ((1/3) * Math.pow(base, 2) * (double)height); 
   }
   
   public boolean equals (SqPyramid sp2)
   {
      boolean status = false; 
      if (base == sp2.base && height == sp2.height  && color.equalsIgnoreCase(sp2.color))
         status = true;
      return status; 
   }
   
   public SqPyramid copy()
   {
      SqPyramid copyObject = new SqPyramid(base, height, color);
      return copyObject;
   }
   
   public String toString()
   {
      String str = "\nBase: " + base + 
                   "\nHeight: " + height +
                   "\nColor: " + color +
                   "\nBase Area: " + baseArea() +
                   "\nSurface Area: " + surfaceArea() +
                   "\nVolume: " + volume();   
      return str;                
   }
}