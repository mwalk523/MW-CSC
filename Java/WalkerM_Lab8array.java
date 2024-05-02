/*
Name: Miles Walker 
Date: 3/7/24
Phone #: 804-217-1204 
Instructor: Dr. B 
Section: S2
Desc: Lab 8
*/
import java.util.Scanner;
import java.util.Arrays;
public class WalkerM_Lab8array
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner (System.in);
   //Part A
      int[] scores_MIW = new int[10];
      System.out.println("Enter 10 values: ");
         for (int i = 0; i < scores_MIW.length; i++)
         {
            scores_MIW[i] = keyboard.nextInt();
         }
      //ID: 00534593
      scores_MIW[3] = 593; 
      
      System.out.print("\n");
      for (int s : scores_MIW)
      {
         System.out.print(s + "\t");
      } System.out.print("\n");
      
   //Part C 
      System.out.println("Current values in array: ");
      for (int i = 0; i < scores_MIW.length; i++)
      {
         System.out.print(scores_MIW[i] + "\t"); //5 numbers per line
         if ((i + 1) % 5 == 0)
            System.out.print("\n");
      }   
      
      System.out.println("Enter a target number: ");
      int target = keyboard.nextInt();
      int foundPosition = linearSearch_MIW(scores_MIW, target);
      if (foundPosition > -1) //foundPosition is equal to the returned value of position
         System.out.println("Found " + target + " at " + 
         (foundPosition + 1) + ".");
      else
         System.out.println("Value not found");
         
      //create another and copy content from scores 
      int[] sorted_MIW = new int [scores_MIW.length];
      for (int i = 0; i < scores_MIW.length; i++)
      {
         sorted_MIW[i] = scores_MIW[i];
      }
      Arrays.sort(sorted_MIW); //sort method 
     System.out.println("Sorted values in array: ");
     for (int i = 0; i < sorted_MIW.length; i++)
     {
        System.out.print(sorted_MIW[i] + "\t"); //5 numbers per line
        if ((i + 1) % 5 == 0)
            System.out.print("\n");
     } System.out.print("\n");
     
     System.out.println("Enter a target value: ");
     target = keyboard.nextInt();
     foundPosition = binarySearch_MIW(sorted_MIW, target);   
     if (foundPosition > -1) //foundPosition is equal to the returned value of position
        System.out.println("Found " + target + " at " + 
        (foundPosition + 1) + ".");
     else
        System.out.println("Value not found");
   } //end of main method
      
   //Part B - Linear Search 
      public static int linearSearch_MIW(int[] values, int target)
      {
         int position = -1;
         boolean found = false;
         int index = 0;
         while (!found/*while found is not true*/ && index < values.length)
         {
            if (values[index] == target) //value found
            {
               position = index;
               found = true;
            } index++;
         } return position; 
      }
      
      //Binary Search 
      public static int binarySearch_MIW(int[] values, int target)
      {
         int position = -1, start = 0, end = values.length - 1;
         boolean found = false;
         while (!found && start <= end)/*repeats as long as found is not true and 
         the start value is equal to or less than the end value (they don't overlap)*/
         {
            int mid = (start + end) / 2 ;
            if (values[mid] == target) //target found 
            {
               position = mid;
               found = true;
            }
            else if (values [mid] > target) //basically cutting out front half 
               end = mid - 1;
            else 
               start = mid + 1; //cutting out the lower half if values[mid] is less than the target 
         }
         return position;
      } //REMEMBER OTHER METHODS MUST BE DEFINED OUTSIDE OF MAIN!!!
}   