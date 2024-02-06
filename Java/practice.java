/*
Author: [name]
Instructor: Dr. B & Dr. Muhammad
Date": 
Program Name:
Description:
*/ 

import java.util.Scanner; 

//class header
public class practice
{ //Start of program
   // main method header
   public static void main (String args[])
   { //start main method
      Scanner keyboard = new Scanner (System.in);
    
      System.out.println("Enter number 1: ");
      int num1 = keyboard.nextInt();
      System.out.println("Enter number 2: ");
      int num2 = keyboard.nextInt();
      System.out.println("Enter number 3: ");
      int num3 = keyboard.nextInt();
      System.out.println("Enter number 4: ");
      int num4 = keyboard.nextInt();

      if (num1 > num2 && num1 > num3 && num1 > num4)
         System.out.println("Largest number is: " + num1);
         
      if (num2 > num1 && num2 > num3 && num2 > num4)
         System.out.println("Largest number is: " + num2);
         
      if (num3 > num1 && num3 > num2 && num3 > num4)
         System.out.println("Largest number is: " + num3);
      
      if (num4 > num1 && num4 > num3 && num4 > num2)
         System.out.println("Largest number is: " + num4);
      
      
      
      
   } // end main method 

} //ending of program