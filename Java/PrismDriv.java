/*
Name: Miles Walker 
Section: S2
Date: Mar 28, 2024
File: Lab 10, Prism Class - Driver 
I, Miles Walker, pledge to follow the Honor Code in taking my Lab5
*/
import java.util.Scanner;

public class PrismDriv
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner(System.in);
   
      //no arg prism 
      Prism prism1 = new Prism();
      System.out.println("Prism 1: " + prism1.toString());
      System.out.println("Color before update: " + prism1.getColor());
      prism1.replaceColor("red"); //don't need the super keyword to call methods from the superclass
      System.out.println("Color after update: " + prism1.getColor());
      
      //3 arg constructor
      System.out.println("\nEnter base, height, and color: ");
      int base2 = keyboard.nextInt();
      int height2 = keyboard.nextInt();
      keyboard.nextLine();
      String color2 = keyboard.nextLine();
      Prism prism2 = new Prism(base2, height2, color2);
      System.out.println("Prism 2: " + prism2.toString());
      System.out.println("Area before base update: " + prism2.getArea());
      prism2.setBase(25);
      System.out.println("Area after base update: " + prism2.getArea());
      
      //Determine attributes for prism object
      System.out.println("\nEnter base, height, length, color, and material: ");
      int base = keyboard.nextInt();
      int height = keyboard.nextInt();
      int length = keyboard.nextInt();
      keyboard.nextLine();
      String color = keyboard.nextLine();
      String material = keyboard.nextLine();
      
      //Create an object 
      Prism prism3 = new Prism(base, height, color, length, material);
      System.out.println("Prism 3: " + prism3.toString());
      System.out.println("Base before update: " + prism3.getBase());
      prism3.setBase(100);
      System.out.println("Base after update: " + prism3.getBase());
      
       double totalSA = prism1.getArea() + prism2.getArea() + prism3.getArea();
       System.out.print("\nTotal Area is: " + totalSA);

   }   
}  