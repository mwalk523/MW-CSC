public class Square
{
   private int side;
   private String color; 
   
   //Constrcutor 
   public Square (int newBase, String newColor)
   {
      side = newBase;
      color = newColor;
   }
   
   //Mutator methods 
   public void setSide(int newBase)
   {
      side = newBase;
   }
   
   public void changeColor (String newColor)
   {
      color = newColor;
   }
   
   //Accessor methods 
   public int getSide()
   {
      return side;
   }
   
   public String getColor()
   {
      return color;
   }
   
   public int getPerimeter()
   {
      return (side + side + side + side);
   }
   
   public int getArea()
   {
      return (side * side);
   }
   
   public double getHalfArea()
   {
      return getArea() / 2;
   }
   
   public String toString()
   {
      String str = "Side length: " + side + 
      "\nColor: " + color + 
      "\nPerimeter: " + getPerimeter() +
      "\nArea: " + getArea() + 
      "\nHalf Area: " + getHalfArea();
      
      return str;
   }
}