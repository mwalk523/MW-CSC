public class Square
{
   private int side;
   private String color; 
   private static int cntSquare = 0;
   /*
   The static keyword means that rather than belonging to each individual object,
   the cntSquare variable will only have one instance that shared across all objects.
   Whereas side and color have their own values for each square object, the static
   keyword ensures that the value of cntSquare stays the same across all objects. 
   */
   
   //Constrcutor 
   public Square() 
   {
      side = 15;
      color = "Cyan";
      cntSquare++;
   }
   
   public Square (int aSide, String aColor)
   {
      side = aSide;
      color = aColor;
      cntSquare++; 
   }
   
   //copy constructor
   public Square(Square s2)
   {
      side = s2.side;
      color = s2.color;
      cntSquare++; 
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
   
   //copy method
   public Square copy()
   {
      Square copyObject = new Square(side, color);/*uses the argument constructor with the values of whatever object
      the method was used on, then sets the new object equal to this "copy object"*/
      
      return copyObject;
   }
   
   //Equals method
   public boolean equals(Square s2)
   {
      boolean status = false;
         if (side == s2.side && color.equalsIgnoreCase(s2.color))
            status = true;   
         
         return status;
   }

   //Accessor methods 
  public int getCount()
  {
     return cntSquare;
  }
   
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