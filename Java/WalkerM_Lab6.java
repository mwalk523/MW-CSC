/*
Author: Miles Walker 
Date: 7/10/23 
Phone #: (804) 217-1204
Lab Section: CSC-100-33
Instructor: Dr. B and Dr. Muhammad 
Desc: Lab 6 
*/

import java.util.Scanner; 

public class WalkerM_Lab6
   {
      
         public static void main (String args[])         
            {
               Scanner keyboard = new Scanner (System.in); 
               
               //Part A - Guessing Game with Basic If-Statement 
               int myNUMBER = 7;
               System.out.println("Guess a number between 0 and 9");
               int guessNumber = keyboard.nextInt();
               
               if (guessNumber == myNUMBER)
                  System.out.println("Good Guess, " + guessNumber + " is my favorite number.");
               
               //Part B - Two numbers: Am I higher or lower? If-Statement 
               System.out.println("Enter any number: ");
               {
               int num1 = keyboard.nextInt();
               System.out.println("Enter a second number: ");
               int num2 = keyboard.nextInt();
               
               if (num1 < num2)
                  System.out.println("- Based on user input (" + num1 + " and " + num2 + "), num 2 is higher than num1");
                  
               if (num1 > num2)
                  System.out.println("- Based on user input (" + num1 + " and " + num2 + "), num 1 is lower than num2");
                  
               if (num1 == num2)
                  System.out.println("- Based on user input (" + num1 + " and " + num2 + "), num 1 is equal to num2");
               }
                  
               //Part C - Read Scores, Get Average, and Print Message with if-else-if 
               {//to redefine a variable must put it in brackets
               System.out.println("Re-enter first number: ");
               int num1 = keyboard.nextInt();  
               System.out.println("Re-enter second number: ");
               int num2 = keyboard.nextInt();
               System.out.println("Enter third number: ");
               int num3 = keyboard.nextInt();
               System.out.println("Enter fourth number: ");
               int num4 = keyboard.nextInt();
               System.out.println("Enter fifth number: ");
               int num5 = keyboard.nextInt();
               double average = (double) (num1 + num2 + num3 + num4 + num5) / 5;
               
               if (average < 60)
               System.out.println("Your score of [" + average + "] is Need to improve more.");
               
               else if (average >= 60 && average <= 69 )
               System.out.println("Your score of [" + average + "] is Poor, with room to improve."); 
               
               else if (average >= 70 && average <= 79 )
               System.out.println("Your score of [" + average + "] is Just enough, but you can do more.");
               
               else if (average >= 80 && average <= 89 )
               System.out.println("Your score of [" + average + "] is Good job!");
               
               else if (average >= 90 && average <= 99 )
               System.out.println("Your score of [" + average + "] is Excellence!!");
               
               else if (average >= 100)
               System.out.println("Your score of [" + average + "] is Outstanding!!");                                            
               
               }
                  
             
             
         //Part D - Read input and calculation (order of precedence and data conversion)
         
         System.out.println("Input an integer for a: ");
         int a = keyboard.nextInt();
         System.out.println("Input an integer for b: ");
         int b = keyboard.nextInt();
         System.out.println("Input a decimal for r: ");
         double r = keyboard.nextDouble();
         
         int result1 =  (int) Math.pow(a, 9) + 7 * 9 - (int) Math.sqrt(a);
         double result2 = ((3 * (double) a + 7) / 5) + ((2 * (double) b - 9 * (double) a) / 8);
         double result3 = (((4 * Math.pow(r, 9)) + 3 * a - 2 * b) / 7);
         
         System.out.println("Your entered: a = " + a + ", b = " + b + ", and r = " + r + "." +
         "\n\tresult1 is " + result1 + "." +
         "\n\tresult2 is " + result2 + "." +
         "\n\tresult3 is " + result3 + ".");
        
         //Part E - String Input and String Manipulation 
            keyboard.nextLine();
            System.out.println("Input first name: ");
            String firstName = keyboard.nextLine();
            System.out.println("Input last name: ");
            String lastName = keyboard.nextLine();
            System.out.println("Input age: ");
            int age = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Input hometown (city AND state): ");
            String hometown = keyboard.nextLine();
            
            System.out.println("Hello, my name is " + firstName + " " + lastName + ", and I am " + age + " years old " +
            "\n\t\tfrom " + hometown + ".");
            
            String fullName = firstName + " " + lastName;
            int size = fullName.length();
            String firstUpper = firstName.toUpperCase();
            int firstLength = firstUpper.length();
            String upper = fullName.toUpperCase();
            String lower = hometown.toLowerCase();
            char firstLetter = hometown.charAt(0);
            char lastLetter = firstUpper.charAt(firstLength - 1);
            
            System.out.println("Part 2: My Name is " + fullName + ", has a total of " + size + " characters." +
            "\n\tUPPERCASE of my full name is " + upper + "." +
            "\n\tlowercase of hometown is " + lower + "." +
            "\n\t\tThe first character of hometown is " + firstLetter + "." +
            "\n\t\tThe last character of first name uppercase is " + lastLetter + ".");
            
            if (size >= 10)
               System.out.println("Your full name, " + upper + ", has at least 10 characters.");
            
            else
               System.out.println("Your full name, " + upper + ", has less than 10 characters.");
              
            }         
             
    }