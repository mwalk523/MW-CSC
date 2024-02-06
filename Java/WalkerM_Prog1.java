/*
Author: Miles Walker
Instructor: Dr. B & Dr. Muhammad
Program Name: WalkerM_Prog1
Description: HW Assignment 1 - 
. creating objects and variables with appropriate data type
. Reading 3 numbers and a String from a keyboard using a Scanner class (a, b, r and name) - a and b are integers, r is a double, and name is a String 
. Calculate 4 results and print out input values
Location: ST 126/Dorm Room/Tutoring
TA: Gabby, Ethan
*/ 

import java.util.Scanner;

public class WalkerM_Prog1
{ 

   public static void main (String args[])
   {  
      Scanner keyboard = new Scanner(System.in);
      
      //Intro
      System.out.print("Summer 2023 - Program by Miles Walker, Major Computer Science" +
      "\n\n\tI, Miles Walker, did not recieve any assistance from another person except CSC 100 instructors and assigned TAs.");
      
      // Variables 
      
      System.out.println("\n\nEnter an integer for a ");
      int a = keyboard.nextInt();
      System.out.println("Enter an integer for b ");
      int b = keyboard.nextInt();
      System.out.println("Enter an decimal number for r ");
      double r = keyboard.nextDouble();
      System.out.println("Enter your name ");
      keyboard.nextLine();
      String name = keyboard.nextLine(); 

      System.out.print("\n\n" + name + ", your values input were: " + 
      "\n\ta = " + a + "\n\tb = " + 5 + "\n\tr = " + r);
      
      // Calculations 
      int result1 = (int) Math.pow(a, 7) + 5 * 9;
      int result2 = (int) Math.pow(a, 4) - (8 * a * b) + (int) Math.pow(b, 5);
      double result3 = (((2 * (double) a) - 5) / 18) + (((3 * (double) b) - 7) / 13); 
      //a and b are still integers so still have to individually define them as doubles even in a double calculation
      double result4 = (5 * Math.pow(r, 10) + 3) / 7;
      
      System.out.print("\n\n Calculated results were: " + 
      "\n\tresult1 = " + result1 + "\n\tresult2 = " + result2 + "\n\tresult3 = " + result3 + 
      "\n\tresult4 = " + result4);
     
      System.out.println("\n\nPlease enter your hometown (City and State): ");
      String homeTown = keyboard.nextLine();
      
      int characters = homeTown.length();
      String upper = homeTown.toUpperCase();
      String lower = homeTown.toLowerCase(); 
      
      System.out.println("\n\n" + name + ", your hometown is " + homeTown + "   (" + characters + " characters)"); //Richmond, Virginia = 18 characters
      System.out.println("\tUpper Case ==> " + upper);   
      System.out.println("\tLower Case ==> " + lower);
      
      char lastLetter = upper.charAt(17);
      System.out.println("\tLast character of your hometown is " + lastLetter);
    
    
    //2 More String Methods 
      System.out.println("\nThe extracted substring is: " + homeTown.substring(10));
      System.out.println("The first occurence of the letter 'V' is at " + homeTown.indexOf("V"));      
    
      System.out.println("\nProgram 1 is completed by " + name);
    
      
   } // end main method 

} //ending of program

         
         
         