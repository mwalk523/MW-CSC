/*
Name: Miles Walker 
Section: S2
Date: Feb 8, 2024
File: Class 
I, Miles Walker, pledge to follow the Honor Code in taking my Thursday Lab 4
*/

public class Triangle()
{
   private int base;
   private int height;
   private String color;
   
   //No arg Contructor
   {
      base = 12;
      height = 7;
      color = "GREEN";
   }
   
   //Parameter/Argument Constructor 
   public Triangle (int aBase, int aHeight, String aColor)
   {
      base = aBase;
      height = aHeight;
      color = aColor;
   }
   
   public void setBase (int newBase)
   {
      base = newBase;
   }
   
   public void updateHeight (int newHeight)
   {
      height = newHeight;
   }
   
   public void replaceColor (String newColor)
   {
      color = newColor;
   }
   
   public int getBase()
   {
      return base;
   }
   
   public int getHeight()
   {
      return height;
   }
   
   public int getColor()
   {
      return color;
   }
   
   public double getArea()
   {
      return (base * height) / 2;
   }
   
   public String toString()
   {
      String msg = "Triangle Information:\n" +
      "\t- base is " + base + " and height is " + height +
      "\n\t- color is " + color +
      "\n\t- area of this triangle is " + area ".";
      
      return msg;
   }  
      
}