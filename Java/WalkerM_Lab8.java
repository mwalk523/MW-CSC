/*
Name: Miles Walker 
Phone #: 804-217-1204
Instrcutor: Dr. Aneke
Lab Section: 62 
Date: 11/2/23
Desc: CSC 151 Lab 8 
*/

import java.util.Scanner;
import java.util.Random;
public class WalkerM_Lab8
{
   public static void main(String args[])
   { Scanner keyboard = new Scanner (System.in);
      
      //Part A 
         System.out.println("Enter a limit between (and including) 5 and 10: ");
         int limit = keyboard.nextInt();
         while (limit < 5 || limit > 10)
         {
            System.out.println("Invalid, limit should be between 5 and 10, please reenter: ");
            limit = keyboard.nextInt();
         }
         
         System.out.printf("\nYou enter %d for limit.", limit);
         
      //Part B
      System.out.println("\nNumber\tSquare\tCube\tSquare Root");      
      for (int count = 1; count <= limit; count++)
      {
         System.out.printf("\n%d", count);
         int square = (int)Math.pow(count, 2);
         System.out.printf("\t\t\t%d", square);
         int cube = (int)Math.pow(count, 3);
         System.out.printf("\t\t\t%d", cube);
         double root = Math.sqrt(count);
         System.out.printf("\t\t\t%.2f", root);
         System.out.print("\n");
      } 
      
      //Part C
      Random rng = new Random();
  
      int dice1;
      int dice2;
      int sum;
      
      do
      {
         dice1 = rng.nextInt(6) + 1; 
         dice2 = rng.nextInt(6) + 1; 
         sum = dice1 + dice2;
         System.out.printf("\nDice are %d %d (sum = %d)", dice1, dice2, sum);
      } while (sum != 9);
      System.out.println("\n\t\tNine Rolled");
      
      
      //Part D
      
      //All integers from 0 to 25 
      int x = 0; 
      while (x <= 25)
      {
         System.out.printf("\n%d", x);
         x +=1;
      }
      System.out.print("\n");
      
      x = 0;
      do 
      {
         System.out.printf("\n%d", x);
         x +=1;
      } while (x <= 25);
      System.out.print("\n");
      
      for (x = 0; x <=25; x++)
      {
         System.out.printf("\n%d", x);
      }
      System.out.print("\n");
      
      //All even integers from 0 to 30
      int y = 0;
      do
      {
         System.out.printf("\n%d", y);
         y += 2;
      } while (y <= 30);
      System.out.print("\n");
      
      y = 0;
      while (y <= 30)
      {
         System.out.printf("\n%d", y);
         y += 2;
      }
      System.out.print("\n");
      
      for (y = 0; y <= 30; y+=2)
      {
         System.out.printf("\n%d", y);
      }
      System.out.print("\n");
      
      //All integers divisible by 5, from 50 down to 0
   
      int z;
      for (z = 50; z >= 0; z -= 5)
      {
         System.out.printf("\n%d", z);
      }
      System.out.print("\n");
      
      z = 50;
      while (z >= 0 && z % 5 == 0)
      {
         System.out.printf("\n%d", z);
         z -= 5;
      }
      System.out.print("\n");
      
      z = 50;
      do 
      {
         System.out.printf("\n%d", z);
         z -= 5;
      } while (z >= 0 && z % 5 == 0);
      System.out.print("\n");
      
      /*
      //Part E
      int HH;
      int MM;
      
      for (HH = 00; HH <= 23; HH++)
      {
         for(MM = 00; MM <= 59; MM++)
         {
            System.out.printf("\n%02d:%02d", HH, MM);
         }
      }  
      
      int SS;
      for (HH = 0; HH <= 23; HH++)
      {
         for(MM = 0; MM <= 59; MM++)
         {
            for (SS = 0; SS <= 59; SS++)
            {
               System.out.printf("\n%02d:%02d:%02d", HH, MM, SS);
            }
         }
      }   
      */
   }
}
