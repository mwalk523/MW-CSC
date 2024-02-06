/*
Name: Miles Walker 
Instructors: Dr B. and Dr. Muhammad 
CSC-100-33
Description: Exam Review 
*/

import java.util.Scanner;

// class header 
public class WalkerM_ReviewLabEx
{
   //Main method header 
   public static void main (String args[])
   {
      //Part A - Read Input from Keyboard using Scanner 
         Scanner keyboard = new Scanner (System.in); 
         
         System.out.println("Input full name: ");
         String fullName = keyboard.nextLine();
         System.out.println("Input # of siblings: ");
         int nosiblings = keyboard.nextInt();
         keyboard.nextLine();      
         System.out.println("Input hometown: ");
         String hometown = keyboard.nextLine();
         System.out.println("Input high-school GPA: ");
         double hsGPA = keyboard.nextDouble(); 
         keyboard.nextLine();
         System.out.println("Input high-school name: ");
         String highSchoolName = keyboard.nextLine(); 
         int size = fullName.length();
         String upper = hometown.toUpperCase();
         String lower = hometown.toLowerCase();
         char thirdLetter = hometown.charAt(0);
         
         System.out.println("My name is " + fullName + ", from " + hometown + ". I have " + nosiblings + " in my family." +
         "\n\tI attended " + highSchoolName + " and graduated with an overall " + hsGPA + " GPA." + 
         "\n\nName, which is " + fullName + ", has " + size + " characters." + 
         "\n\nMy Hometown is " + hometown + "." + "\n\tUPPERCASE of hometown is " + upper + "." +
         "\n\tlowercase of hometown is " + lower + "." +
         "\n\tThe third character of my hometown is " + thirdLetter + ".");

         //Part B= - Reading Input and Mathematics calculations including Math Class - Math.pow and Math.sqrt methods 
         
         System.out.println("Enter first integer: ");
         int num1 = keyboard.nextInt(); 
         System.out.println("Enter second integer: ");
         int num2 = keyboard.nextInt();
         System.out.println("Enter third integer: ");
         int num3 = keyboard.nextInt();
         
         int result1 = (int) Math.pow(num1,7) + (5 * num2) - (9 * (int) Math.pow(num3, 5));
         int result2 = (5 * (int) Math.pow(num3, 10) + (3 * num2)) / (int) Math.sqrt (7 * (int) Math.pow(num1, 9));
         double result3 = (((2 * num3) - (5 * num2)) / 18) + ((3 * num1 - 7) / num2);
         double result4 = (Math.sqrt (3 * Math.pow(num1, 4)) + (3 * num2) / (7 * num3));
         double Result5 = (9 * Math.sqrt(num2 * num3)) / (Math.pow(num1, 5) - 7);
         
         System.out.println("Input: " + "\n\t\tnum1 is [" + num1 + "]" +
          "\n\t\tnum2 is [" + num2 + "]" +
         "\n\t\tnum3 is [" + num3 + "]");
         
         System.out.println("\n\nResults: " + "\n\t\tresult1 is [" + result1 + "]" +
         "\n\t\tresult2 is [" + result2 + "]" +
         "\n\t\tresult3 is [" + result3 + "]" +
         "\n\t\tresult4 is [" + result4 + "]" +
         "\n\t\tresult5 is [" + Result5 + "]");
         
   
   }
}