/*
Name: Miles Walker
Section: S2
Instructor: Dr. B/ Dr. Aneke
Desc: Lab 7 
*/

import java.util.Scanner;
public class WalkerM_Lab7
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner(System.in);
      
      //Part A 
         System.out.println("Enter a sentence: ");
         String sentence_MIW = keyboard.nextLine();
         char[] myChars_MIW = new char[sentence_MIW.length()];
         
         for (int i = 0; i < myChars_MIW.length; i++) 
         {
            myChars_MIW[i] = sentence_MIW.charAt(i);
         }
         
         //Prints sentence in reverse 
         System.out.println("Print in reverse: ");
         for (int i = myChars_MIW.length - 1; i >= 0; i--)
         {
            System.out.print(myChars_MIW[i]);
         } System.out.print("\n");
         
      //Part B - String array 
         String[] myFriends_MIW = new String[5];
         
         for (int i = 0; i < myFriends_MIW.length; i++)
         {
            System.out.println("Enter a friend's name: ");
            myFriends_MIW[i] = keyboard.nextLine();
         }
         //print out 
         for (String name : myFriends_MIW)
         {
            System.out.print(name + " has " + name.length() + " characters - " +
             name.toUpperCase().charAt(0) +
             name.toUpperCase().charAt(name.length() - 1));
             
            System.out.print("\n");
         }
       
      //Part C - Partially Filled Array   
         int[] myScores_MIW = new int[100];
         int count = 0;
         
            System.out.print("Enter a number or -1 to stop: ");
            int number = keyboard.nextInt();
            while (number != -1 && count <= 99)
            {
               myScores_MIW[count] = number; //assign to array 
               count++; //increment count by 1
               System.out.println("Enter a number or -1 to stop: ");
               number = keyboard.nextInt();
            }
            
            //print using enhanced for loop 
            int cnt_print = 0; //keep track of numbers printed 
            for (int num : myScores_MIW)
            {
               System.out.print(num + "\t");
               cnt_print++; //increment count for printing
               
               if (cnt_print % 10 == 0)
               {
                  System.out.print("\n");
               }
            } System.out.print("\n");
            
            //print using regular, only what entered
            for(int i = 0; i < count; i++)
            {
               System.out.print(myScores_MIW[i] + "\t");
               if ((i + 1) % 10 == 0)
                  System.out.print("\n"); 
            } System.out.print("\n");
            
            //find stats 
            int sum = 0;
            int min = myScores_MIW[0];
            int max = myScores_MIW[0];
      
            for (int i = 0; i < count; i++)
            {
               sum += myScores_MIW[i];
               if (myScores_MIW[i] > max)
                  max = myScores_MIW[i];
               if (myScores_MIW[i] < min)
                  min = myScores_MIW[i];
            } double average = (double) sum / count;
            
            System.out.println("\nEnhanced for loop print out: " + 
            "\n\tsum = " + sum +
            "\n\thighest = " + max +
            "\n\tlowest = " + min + 
            "\n\taverage = " + average);


   }
}
