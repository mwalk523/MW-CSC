/*
Author: Miles Walker 
Instructor: Dr. B & Dr. Muhammad
Date: 7/14/2023  
Program Name:WalkerM_Lab8a
Description: Lab 8a 
*/ 

import java.util.Scanner; 

public class WalkerM_Lab8a
{

   public static void main (String args[])
   { 
      Scanner keyboard = new Scanner (System.in);
      
      int total = 0;
      for (int a = 0; a < 6; a++ /*same as a+1 */ ) //incrementally adds on as it goes through the loop 
      //Starting value, condition, increment (in that order)
      {
         total = total + a; // don't need to define total 
         System.out.println ("a: " + a);
         
      } //end of loops 
      System.out.print ("total: " + total);
      
      // even numbers 
      int total1 = 0;
      for (int b = 0; b <= 10; b = b+2  ) //print out even numbers 
         {
            System.out.println("\nb even numbers: " + b);
            total1 = total +b;
         
         }  
         System.out.print("\ntotal1: " + total1);
       
       
       // multiples of 3  
      int total2 = 0;
      for (int c = 0; c <= 15; c = c+3  ) //print out multiples of 3  
         {
            System.out.println("\nMultiples of 3: " + c);
            total2 = total2 + c;
         
         }  
         System.out.print("\ntotal2: " + total2);
         
       //ask the user for their 5 grades - print out grades and the average 
       double average; 
       double grade; 
       double sum = 0; //starting value 
       for (int x = 1; x <= 5; x= x +1 /*last statement in the for loop doesn't need a semicolon*/ )
         {
            System.out.println("\nEnter your grade: ");
            grade = keyboard.nextDouble();
            sum = sum + grade;  
         } //end of loop for grades      
         average = sum / 5.0;
         System.out.println("Average grade: " + average);
         
       //Part A- While-loop; this is a pretest 
       int num1 = 50; //starting value to test 
       while (num1 >= 20)//test to see if we enter the loop 
       {
         //create the code to print only the odd 
         // x % 2 == 0 ....... even number 
         // x % 2 == 1 ....... odd number 
         if (num1 % 2 == 1) //only print odd numbers 
            {
             System.out.println("num1: " + num1);             
            }
            num1 = num1 - 1 ; // increment down here as opposed to within the for loop
        }
        
       double average1; 
       double grade1; 
       double sum1 = 0; //starting value 
       int count = 0;
       System.out.println("Enter your first grade: ");
       grade1 = keyboard.nextDouble();

       while (count < 5) // says how many times it will loop; will loop 5 times to get 5 grades 
       {
         sum1 = sum1 + grade1; 
         count = count + 1;
         System.out.println("grade1: " + grade1);
         System.out.println( "Enter another grade: ");
         grade1 = keyboard.nextDouble(); //can use the same variable again within the loop 
       }
       average1 = sum1/count;
       System.out.print("Average: " + average1);   
         
        
        
   } // end main method 

} //ending of program
