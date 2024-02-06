/*
Name: Miles Walker 
Instructor: Dr. B and Dr. Muhammad 
Date: 7/10/2023
Desc: Conditioning Statements 
*/

import java.util.Scanner;

//class header
public class WalkerM_Conditions 
   {
      
      public static void main (String args[])
         {
            //create scanner 
            Scanner keyboard = new Scanner (System.in);
            
            System.out.println("Enter a number 0 and 10: ");
            int num1 = keyboard.nextInt();
            
            System.out.println("You enter " + num1);
            // check if this number is larger than 5
            if (num1 > 5) //NO SEMICOLON, the print statement ends the if statement 
               System.out.println("num1 is larger than 5");
               
            else
               System.out.println("num1 is not larger than 5");

            // check if this number is equal 10 
            if (num1 == 10)
               System.out.println("num1 is equal to 10");
            
            else 
               System.out.println("num1 is not equal to 10");

            
            // check if this number is at most 7 
            if (num1 <= 7)
               System.out.println("num1 is less than or equal to 7");
               
            else
               System.out.println("num1 is not less than or equal 7");
            
            System.out.println("Enter a second number: ");
            int num2 = keyboard.nextInt();
            
            //check which is larger 
            if (num1 > num2)
               System.out.println("num1 is larger than num2");
               
            else 
               System.out.println("num2 is larger than num1");
               
           //check if both are the same  
            if (num1 == num2)
               System.out.println("num1 and num2 are equal");
               
            else 
               System.out.println("num1 and num2 are not equal");
               
             //check if double of num1 is larger than num2
            if (2 * num1 > num2)
               System.out.println("Double of num1 is larger than num2");
               
            else 
               System.out.println("num2 is larger than double of num1"); 
             
            //order from smaller to larger    
            if (num1 > num2)
               System.out.println("The order small to large is: " + num2 + ", " + num1);
               
            else
               System.out.println("The order small to large is: " + num1 + ", " + num2);    

            
          // if-else-if 
          //check equals first, and then which one ever one is larger 
          System.out.println("\nif-else-if");
          if (num1 == num2)
            System.out.println(num1 + " is equal to " + num2);
            
          else if (num1 > num2) //second if statement
            System.out.println(num1 + " is larger than " + num2);
            
          else //if neither of the above statements are true it goes to this one; alternatively you can just use more else-if statements 
            System.out.println(num2 + " is larger than " + num1);
          
          //calculation - based on num1 and num2 that we have 
          //only do this if num1 and num2 are not the same
            if (num1 != num2)
            {            
            //if num1 is larger then do the following 
               if (num1 > num2)
               { //these brackets contain the 'if' statement when there are multiple statements within it 
            //      create a int diff variable, use num1 - num2 
            int diff = num1 - num2;                  
            //      create a double result 1, diff / num2
            double result1 = (double) diff / num2;            
            //      then print the result both diff and result1
               System.out.println("Diff is " + diff + "\n result1 is " + result1);
               }
            
          
          //if num2 is larger...
               else 
               {
          //      create an int diff variable , use num2 - num1 
             int diff = num2 - num1;
          //      create a double result2, diff / num1 
            double result2 = diff / num1;
          //      then print the result both diff and result2
            System.out.println("Diff is " + diff + "\nresult2 is " + result2);
               }   
            
            }
                                                         
         }
         
         
   }
  
  
  