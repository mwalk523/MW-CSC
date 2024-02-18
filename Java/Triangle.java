/*
Name: Miles Walker 
Section: S2
Date: Feb 15, 2024
File: Class 
I, Miles Walker, pledge to follow the Honor Code in taking my Lab5
*/

//to be used with WalkerM_Lab5
public class Triangle
{
   //attributes
   private int base;
   private int height;
   private String color;
   
   //No arg Contructor
   public Triangle()
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
   
   //Copy constructor
   public Triangle(Triangle obj2) //whatever object is put in parentheses in the driver is "obj2"
   {
      base = obj2.base;
      height = obj2.height;
      color = obj2.color;
   }
   
   //copy method 
   public Triangle copy()
   {
      Triangle copyObject = new Triangle(base, height, color); //creates a new object
      //Triangle copyObject = new Triangle(this);
      // must have copy constructor for the above statement
      return copyObject;
   } //creates a copy of Triangle with the current value of attribute: base, height, and color
   
   //equals Method
   public boolean equals(Triangle obj2)
   {
      boolean status = false;
      if (base == obj2.base && height == obj2.height && color.equalsIgnoreCase(obj2.color) )
         status = true;   
         
      return status; //Returns boolean true if all attributes of the current object and obj2 are the same 
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
   
   public String getColor()
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
      "\n\t- area of this triangle is " + getArea() + ".";
      
      return msg;
   }  
      
}