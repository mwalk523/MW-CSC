import java.util.Scanner;
public class ArrayQuizDriv_Walker
{
   public static void main (String args[])
   {  
      Scanner keyboard = new Scanner(System.in);
      MW_ArrayQuiz obj1 = new MW_ArrayQuiz();
      
      //Store method 
      obj1.storearray();
      System.out.print("\n");
      
      //find less 10 
      int elements = obj1.findLessTen();
      System.out.println("Number of elements less than 10: " + elements);
      System.out.print("\n");
      
      //add 3 elements 
      obj1.add3Elements();
      System.out.print("\n");
      
      //Print range even
      obj1.printRangeEven();
      System.out.println("\n");
      
      //delete last 
      obj1.deleteLast();
      
      //Search at least 4
      boolean found = obj1.searchAtLeast4(6);
      System.out.println("Found? " + found);
      System.out.print("\n");
      
      //Increment Multiples of 3
      int increments = obj1.incrementMultiples3();
      System.out.println("Multiples of 3 incremented: " + increments);
      System.out.print("\n");
      
   }
}