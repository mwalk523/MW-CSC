/*
Name: Miles Walker 
Section: S2 / Feb 1, 2024
File: Class 
I, Miles Walker, pledge to follow the Honor Code in taking my Thursday, Lab 3
*/

//Part 1
public class Rectangle 
{
   //attributes
   private String name;
   private double length;  
   private double width;
   
   //mutator methods - - update attribute values 
   public void updateName(String newName)
   {
      name = newName;
   }
   public void setLength (double len)
   {
      length = len;
   }
   public void setWidth (double w)
   {
      width = w;
   }
   
   //Accessor methods - Retrieve current values of attributes 
   public String getName()
   {
      return name;
   }
   
   public double getLength()
   {
      return length; //make sure you use the og variable, not len
   }
   
   public double getWidth()
   {
      return width;
   }
   
   //Derived/Calculated Method
   public double calcArea() //Still an accessor method, but returning a calculation rather than one value 
   {
      return length * width;
   }
   
   public double calcPerimeter()
   {
      return (2 * length) + (2 * width);
   }
} //End of class declaration 