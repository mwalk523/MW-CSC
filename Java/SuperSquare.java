public class SuperSquare
{
   //Fields 
   protected double side;
   protected String color; 
   
   //Constructors 
   
   public SuperSquare() //no-arg constructor for subclass
   {
   }
   
   public SuperSquare (double s, String c)
   {
      side = s;
      color = c;
   }
   
   public double getSide()
   {
      return side;
   }
   
   public String getColor()
   {
      return color;
   }
   
   public void setSide(double newS)
   {
      side = newS;
   }
   
   public void setColor (String newC)
   {
      color = newC;
   }
   
   public double getArea()
   {
      return (Math.pow(side, 2));
   }
   
   public double getPerimeter()
   {
      return side * 4; 
   }
   
   public String toString()
   {
      String str = "\nSide: " + side +
                   "\nColor: " + color;
      return str; 
   }
}
      