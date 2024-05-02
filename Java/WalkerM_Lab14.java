/* 
Name: Miles Walker 
Section/Date: S2 / April 25, 2024
Program: Stack and Queue
 “I, Miles Walker, pledge to follow the Honor Code in taking my Lab 12.”
*/

import java.util.*;
import java.util.concurrent.*;

public class WalkerM_Lab14
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner(System.in);
      //Part A - Stack of Strings
      // create an empty stack
      
      Stack<String> myNameStack = new Stack<String>();
      System.out.print("Enter a name, DONE to stop: ");
      String name = keyboard.nextLine();
      while (!name.equalsIgnoreCase("DONE"))
      {
         myNameStack.push(name); //add to the top 
         System.out.print("Enter a name, DONE to stop: ");
         name = keyboard.nextLine();
      } //read names until user enters DONE
      //remove and print and get stats
      int amount = 0, totalChar = 0;
      String longest = myNameStack.peek();
      String shortest = myNameStack.peek();
      System.out.println("\nOUTPUT for Stack: ");
      while (!myNameStack.empty())
      {
         String n = myNameStack.pop();
         amount++;
         totalChar += n.length();
         System.out.println(n.toUpperCase() +
         "\t Last char = " +
         n.toUpperCase().charAt(n.length() - 1) +
         "\t size = " + n.length());
         if (n.length() > longest.length())
            longest = n;
         if (n.length() < shortest.length())
            shortest = n;
      }
      
      System.out.print("STATS: \n" +
         "Total amount of names: " + amount +
         "\nTotal characters: " + totalChar +
         "\nLongest: " + longest +
         "\nShortest: " + shortest);
      
      //Part B - Integer 
      System.out.println("\n\n*** QUEUE ***");
      ArrayBlockingQueue<Integer> myScoreQueue =
         new ArrayBlockingQueue<Integer>(20);
      //read input 
      System.out.print("Enter an integer, -77 to stop: ");
      int score = keyboard.nextInt();
      while (score != -77)
      {
         if (score > 0) //positive only
            myScoreQueue.add(score); //autoboxing 
         System.out.print("Enter an integer, -77 to stop: ");
         score = keyboard.nextInt(); 
      }
      //print
      int count = 0, sum = 0, max = myScoreQueue.peek();
      int min = myScoreQueue.peek(); //Same concept as using array[0] as min and max
      while (!myScoreQueue.isEmpty())
      {
         int s = myScoreQueue.remove(); // = dequeue, unboxing
         System.out.print(s + "\t");
         count++;
         if (count % 10 == 0)
            System.out.print("\n");
         sum += s;
         if (s > max)
            max = s;
         if (s < min)
            min = s;
      } int average = sum / count;
      
      //summary
      System.out.println("\nStats: \n" +
         "\n\t count = " + count +
         "\n\t sum = " + sum +
         "\n\t average = " + ((double) sum/count) +
         "\n\t min = " + min + 
         "\n\t max = " + max);
   }
}