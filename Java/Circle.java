public class Circle 
{
   private int diameter;
   private String color;
   
   public Circle() //no arg constructor, assigns default values
   {
      diameter = 12;
      color = "yellow";
   }
   
   public Circle (int aDiameter, String aColor) //argument constructor
   {
      diameter = aDiameter;
      color = aColor;
   }
   
   public void setDiameter(int newDia)
   {
      diameter = newDia;
   }
   
   public void chooseColor (String newColor)
   {
      color = newColor;
   }
   
   public int getDiameter()
   {
      return diameter;
   }
   
   public String getColor()
   {
      return color;
   }
   
   public int getRadius()
   {
      return diameter/2;
   }
   
   public int getArea()
   {
      return (int)(Math.PI * Math.pow(getRadius(), 2)); //Math.PI, PI is in all caps remember this!!!
   }
   
   public String toString() 
   {
      String str = "\nDiameter: " + diameter +
      "\nColor: " + color + 
      "\nRadius: " + getRadius() +
      "\nArea: " + getArea();
      
      return str;
   }
   
}