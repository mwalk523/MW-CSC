/*
Name: Miles Walker 
Section: S2 / Feb 1, 2024
File: Driver 
I, Miles Walker, pledge to follow the Honor Code in taking my Thursday, Lab 3
*/

import java.util.Scanner;
public class WalkerM_Lab3
{
   public static void main(String args[])
   {Scanner keyboard = new Scanner(System.in);
      //Part A - Creating 3 rectangle objects 
      Rectangle posterA = new Rectangle(); //Using the class I made in other file 
      Rectangle posterB = new Rectangle();
      Rectangle posterC = new Rectangle();
   
   //Part C - Reading input 
      System.out.println("Enter name for posterA: ");
         String name = keyboard.nextLine();
      System.out.println("Enter length for posterA: ");
         double length = keyboard.nextDouble();
      System.out.println("Enter width for posterA: ");
         double width = keyboard.nextDouble();
         keyboard.nextLine();
      //call mutator methods
         posterA.updateName(name);
         posterA.setLength(length);
         posterA.setWidth(width);
      
      System.out.println("Enter name for posterB: ");
         String nameB = keyboard.nextLine();
      System.out.println("Enter length for posterB: ");
         double lengthB = keyboard.nextDouble();
      System.out.println("Enter width for posterB: ");
         double widthB = keyboard.nextDouble();
         keyboard.nextLine();
      //call mutator methods
         posterB.updateName(nameB);
         posterB.setLength(lengthB);
         posterB.setWidth(widthB);
         
      System.out.println("Enter name for posterC: ");
         String nameC = keyboard.nextLine();
      System.out.println("Enter length for posterC: ");
         double lengthC = keyboard.nextDouble();
      System.out.println("Enter width for posterC: ");
         double widthC = keyboard.nextDouble();
         keyboard.nextLine();
      //call mutator methods
         posterC.updateName(nameC);
         posterC.setLength(lengthC);
         posterC.setWidth(widthC);   
   
   //Part D - Print out for posterA
   //posterA
      System.out.println("The " + posterA.getName() + " Poster is " + posterA.getLength() + " by " + posterA.getWidth() + "." + 
      "\n\t- area of this poster is " + posterA.calcArea() + " square inches." + 
      "\n\t- perimeter of this poster is " + posterA.calcPerimeter() + " inches.");
      
      System.out.print("\n");
      
      System.out.println("The " + posterB.getName() + " Poster is " + posterB.getLength() + " by " + posterB.getWidth() + "." + 
      "\n\t- area of this poster is " + posterB.calcArea() + " square inches." + 
      "\n\t- perimeter of this poster is " + posterB.calcPerimeter() + " inches.");
      
      System.out.print("\n");
      
      System.out.println("The " + posterC.getName() + " Poster is " + posterC.getLength() + " by " + posterC.getWidth() + "." + 
      "\n\t- area of this poster is " + posterC.calcArea() + " square inches." + 
      "\n\t- perimeter of this poster is " + posterC.calcPerimeter() + " inches.");

   
   //Total of areas and total of perimeters 
      double totalArea = posterA.calcArea() + posterB.calcArea() + posterC.calcArea();
      double totalPeri = posterA.calcPerimeter() + posterB.calcPerimeter() + posterC.calcPerimeter();
   }
}