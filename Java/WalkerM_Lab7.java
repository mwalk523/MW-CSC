/*
Name: Miles Walker
Date: 7/12/23
Instructor: Dr B. and Dr. Muhammad 
Name: WalkerM_Lab7
*/ 

import java.util.Scanner; 

//class header
public class WalkerM_Lab7
{ 

   public static void main (String args[])
   { //create a scanner object
      Scanner keyboard = new Scanner (System.in);
      
      //Part A While - Loop - this is a pretest; tests for the correct conditions before it enters the loop 
      int num1 = 1; //starting value to test
      while (num1 <= 10) //correct conditions; test to see it it will enter the loop 
      { //Brackets!
         System.out.println ("Hello world");
         num1 = num1 + 1; //add -  when num =11 will not enter loop 
         
      }
      
      int num2 = 15;
      while (num2 > 7) // this would be an infinite loop 
      {
         System.out.println("num2");
         num2 = num2 - 1;  //incrementally subracting        
      }

      //ask the user for values in a loop 
      int sum = 5;
      System.out.println("Enter a number from 1 to 10");
      System.out.println("Enter a number greater than 10 to quit");
      int num3 = keyboard.nextInt();
      while (num3 <= 10) //Entering a number greater than 10 will not meet the condition; also notice how while statements do not need semicolons 
      { 
         sum = sum + num3; //running total
         System.out.println("Enter a number from 1 to 10");
         System.out.println("Enter a number greater than 10 to quit");
         num3 = keyboard.nextInt(); //read another number
      } //end of loop 
      System.out.println ("Sum: " + sum);
      
      //validation loop - while loop 
      System.out.println ("Enter a positive number greater than 0");
      int posNum = keyboard.nextInt();
      while ( posNum <= 0) // we want to test for 0 not being what we asked for (validation)
      {
      System.out.println ("You enetered an invalid number try again.");
      System.out.println ("Enter a positive number greater tan 0");
      posNum = keyboard.nextInt();
      
     }
     System.out.println ("Great job - you entered a valid amount"); 
     //for...loop 
     //start i = 1, Test: +1, everytime i loop incrmentem
     //Test i <= 10 if true goes into loop
     //adds i to 1 
       int sum1 = 0;
       for(int i = 1; i <= 10; i++) //start with i equal to one 
       {
       System.out.println("i: " + i);
       sum1 = sum1 + 1; 
       } 
     
   } // end main method 

} //ending of program
