/*
Name: Miles Walker 
Phone #: (804) 217-1204
Lab Instructor: Dr. Aneke
Section: 62
Date: 11/9/23
Desc: Lab 9 
*/

import java.util.Scanner;

public class WalkerM_Lab9
{
   public static void main(String args[])
   { Scanner keyboard = new Scanner(System.in);
   
     //Part A
     int num = 0;
     int countOdd = 0;
     int countEven = 0;
     int sumOdd = 0;
     int sumEven = 0;
     System.out.println("Please enter an integer (-1 to exit): "); 
     num = keyboard.nextInt();
     
     while (num != -1)
     {
         if (num % 2 != 0)
         {  
            System.out.printf("\t\t%d is odd", num);
            System.out.println("\nPlease enter an integer (-1 to exit): ");
            sumOdd += num; 
            countOdd += 1; 
            num = keyboard.nextInt();
         }
        
         if (num % 2 == 0)
         {
            System.out.printf("\t\t%d is even", num);
            System.out.println("\nPlease enter an integer (-1 to exit): ");
            sumEven += num; 
            countEven += 1;
            num = keyboard.nextInt();    
         }   
     }
    
     int countNum = countOdd + countEven;
     System.out.printf("\tYou enter %d numbers: \n\t%d odd integer(s); a total of %d \n\t%d even integer(s); a total of %d", countNum, countOdd, sumOdd, countEven, sumEven);
     
     //Part B
     String message;
     int count = 0;
     int longCount = 0;
     int shortCount = 0;
     System.out.println("\n\nEnter a message (STOP to exit): ");
     keyboard.nextLine();
     message = keyboard.nextLine();
     
     while (!message.equalsIgnoreCase("STOP"))
     {
         if (message.length() > 10)
         {
            System.out.println("Long message");
            longCount += 1; 
            message = keyboard.nextLine();
         }
         
         else
         { 
            System.out.println("Short message");
            shortCount += 1;
            message = keyboard.nextLine();
         }
            
         count += 1;     
     }
     
     System.out.printf("\nYou entered %d messages \n\t%d long messages \n\t%d Short messages", count, longCount, shortCount);
     
     //Part C WITH BONUS
     char answer;
     do
     {
      System.out.println("\nWhat a character you want to use for pattern? ");
      char pattern = keyboard.nextLine().charAt(0);
      System.out.println("How many rows to print? ");
      int row = keyboard.nextInt();
      System.out.println("How many columns to print? ");
      int col = keyboard.nextInt();
      System.out.println("Printing " + pattern + " for " + row + " rows and " + col + " columns:\n");
      for (int rows = 0; rows < row; rows++)
      {
         for (int cols = 0; cols < col; cols++)
         {
            System.out.print(pattern);
         }
        System.out.print("\n");  
      }
      
      System.out.println("Do you want to repeat? Yes or No: ");
      keyboard.nextLine();
      answer = keyboard.nextLine().charAt(0);
     } while(answer == 'Y' || answer == 'y');
     
     //Part D
     System.out.println("Enter an integer for limit between 5 and 10: ");    
     int limit = keyboard.nextInt();
     while (limit < 5 || limit > 10)
     {
         System.out.println("Limit is outside range. Please re-enter: ");
         limit = keyboard.nextInt();
     }
     
     System.out.println("Enter a power (exponent) value that is at least 2: ");
     int power = keyboard.nextInt();
     while (power < 2)
     {
         System.out.println("Invalid value. Please re-enter: ");
         power = keyboard.nextInt();
     }
     
     System.out.println("Number\tPower of " + power + "\tSquared\tCubed\t Square root");
     for (int limitC = 1; limitC <= limit; limitC++)
     {
         int powered = (int)Math.pow(limitC, power);
         int square = (int)Math.pow(limitC, 2);
         int cube = (int)Math.pow(limitC, 3);
         double sqrt = Math.sqrt(limitC);
         System.out.printf("\n[%d]\t[%d]\t[%d]\t[%d]\t[%.2f]", limitC, powered, square, cube, sqrt);
     }
     
   }
}