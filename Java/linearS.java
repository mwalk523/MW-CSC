import java.util.Scanner;
public class linearS
{
   //search method
   public static int SeqSearch (int[] array, int val)
   {
      int index;
      int element;
      boolean found;
      
      index = 0; //set the starting point at the first element of the array (index = 0)
      element= -1;
      found = false;
      
      while (!found && index < array.length/*stop when either found is true or index reaches the final element*/)
      {
         if (array[index] == val)
         {
            found = true;
            element = index;
         } index++; //increments index each time, testing the next element in the array 
      }
      
      return element;
   }
   
   public static int findSum(int[] array)
   {
      int sum = 0;
      for (int numb : array)
      {
         sum += numb;
      } return sum;
   }
   
   //method in use
   public static void main (String args[])
   {Scanner keyboard = new Scanner (System.in);
      int[] nums = {15, 14, 100, 105, 200, 54, 76, 83, 999, 777, 7, 2, 11, 39};
      int result; 
      System.out.println("Enter a number to search for: ");
      int target = keyboard.nextInt();
      
      result = SeqSearch(nums, target);
      
      
      if (result == -1) //if result is -1, it means the target value was never found, element was never updated, and SeqSearch returned -1 
         System.out.println("Value not found.");
      else 
         System.out.println("Value found. It was entry number " + (result + 1) + "."); 
     
    System.out.println("Sum is: " + findSum(nums)); 
   }
}
