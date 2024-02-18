/*
Name: Miles Walker 
Section: S2
Date: Feb 15, 2024
File: Driver 
I, Miles Walker, pledge to follow the Honor Code in taking my Lab5
*/

import java.util.Scanner;

public class WalkerM_Lab5 //driver for Triangle.java 
{  
   public static void main (String args[])
   {Scanner keyboard = new Scanner(System.in);
   
      //create tri1
      Triangle tri1 = new Triangle(); //no arg-constructor, assigns default values
      System.out.println(tri1);
      tri1.updateHeight(3); //update height to last digit of student id 
      System.out.println("After update height: " + tri1.toString());
      
      //read input for tri2
      System.out.print("Enter base: ");
      int base = keyboard.nextInt(); //What we enter for base gets assigned to aBase in the class, which is then assigned back to base 
      System.out.print("Enter height: ");
      int height = keyboard.nextInt();
      keyboard.nextLine(); //clear buffer 
      System.out.print("Enter color: ");
      String color = keyboard.nextLine();
      //create tri2
      Triangle tri2 = new Triangle(base, height, color);   
      System.out.println("tri2: " + tri2.toString());
      
      //get create triangle 3
      Triangle tri3 = new Triangle (tri2); //Copy constructor in use here!
      
      //compare 
      if (tri2.equals(tri3))
         System.out.println("Tri2 and Tri3 are the same.");
      else
         System.out.println("Tri2 and Tri3 are different.");
         
      //update tri3 - double the base 
      tri3.setBase(tri3.getBase() * 2); //takes current base and multiplied by two
      System.out.println("After update tri3's base is: \n\t");
      
      //compare 
      if (tri2.equals(tri3))
         System.out.println("Tri2 and Tri3 are the same.");
      else
         System.out.println("Tri2 and Tri3 are different.");
         
      //create tri4 from tri1 using copy method 
      Triangle tri4 = tri1.copy();
      
      //compare
      if (tri1.equals(tri4)) //(if "true" is returned from the method
         System.out.println("Tri1 and Tri4 are the same.");
      else 
         System.out.println("Tri1 and Tri4 are different.");
      
      //update tri1 with new color, input from user
      System.out.println("Enter a new color for Tri1: ");
      color = keyboard.nextLine();
      tri1.replaceColor(color);
      System.out.println("Compare after update tri1: ");
      
      //compare
      if (tri1.equals(tri4))
         System.out.println("Tri1 and Tri4 are the same.");
      else 
         System.out.println("Tri1 and Tri4 are different.");
         
      //Find total area 
      double totalArea = tri1.getArea() + tri2.getArea() + tri3.getArea() + tri4.getArea();
      System.out.printf("The total area of 4 triangles is %.2f.", totalArea);

   }
}