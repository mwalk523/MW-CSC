/*
Name: Miles Walker 
Section: S2
Date: Mar 28, 2024
File: Lab 10, Prism Class - Inherit from Triangle 
I, Miles Walker, pledge to follow the Honor Code in taking my Lab5
*/

public class Prism extends Triangle 
{
   //add additional attributes 
   private int length;
   private String material;
   
   //constructors 
   public Prism()//no arg constructor
   {
      super(12, 5, "Green"); //superclass constructor, gives prism the same attributes as Triangle's
                             //no arg constructor 
      //Assigning values for the new attributes 
      length = 20; //default value 
      material = "wood"; // default value
   }
   
   public Prism (int b, int h, String c) //3 arg constructor 
   {
      super (b, h, c); //superclass constructor, make sure attributes are entered in the same order 
      length = 20;
      material = "wood";
   }
   
   public Prism (int b, int h, String c, int length, String material) //5 arg constructor
   {
      super (b, h, c); //superclass constructor, make sure attributes are entered in the same order 
      this.length = length;
      this.material = material;
   }
   
   //additional accessors
   public int getLength() 
   { 
      return length; 
   }
   
   public String getMaterial()
   {
      return material;
   }
   
   //additional mutators
   public void setLength (int len)
   {
      length = len;
   }
   
   public void setMaterial (String m)
   {
      material = m;
   }
   
   //override getArea()
   public double getArea()
   {
      double peri = getBase() + Math.sqrt(base * base + height * height); //use the protected access specifier in triangle to allow the use of base in this program
      double surfArea = 2 * super.getArea()/*Used to identify the superclass' method of the same name*/ * peri * length;
      return surfArea;
   }
   
   //Add a method to calculate volume 
   public double calcVolume()
   {
      return super.getArea() * length;
   }
   
   //override toString method
   public String toString()
   {
      String msg = "\nPrism Info:\n" + super.toString()/*Calls the superclass' toString method*/ +
                   "\n\t Length is " + length +
                   "\n\t Material is " + material +
                   "\n\t Volume is " + calcVolume();
      return msg;
   }
   
}