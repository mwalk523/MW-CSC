import java.util.Scanner;
public class arrayExercise 
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner(System.in);
      
      //Problem 1
      int[] myNumbers = new int[10];
      int total = 0;  
      System.out.println("Enter 10 integer values: ");
      for (int i = 0; i < myNumbers.length; i++)
      {
         myNumbers[i] = keyboard.nextInt();
         total += myNumbers[i];
      }
      
      int highest = myNumbers[0];
      int lowest = myNumbers[0];
      
      for (int val : myNumbers)
      {
          if (val > highest)
            highest = val;
          if (val < lowest)
            lowest = val;
      }
       
      System.out.println("Array values: ");
      for (int i = 0; i <= myNumbers.length - 1; i++)
      {
         System.out.print(myNumbers[i] + "\t");
      } System.out.print("\n");

      System.out.println("Total: " + total);
      
      int average = total / myNumbers.length;
      System.out.println("Average: " + average);
      
      System.out.println("Highest: " + highest);
      System.out.println("Lowest: " + lowest);
      /*
      //Problem 2
      System.out.println("Enter a word (10 letters or more): ");
      String word = keyboard.nextLine();
      while (word.length() < 10)
      {
         System.out.println("Must be at least 10 characters. Try again: ");
         word = keyboard.nextLine();
      }

      char[] myChars = new char[word.length()];
            
      for (int i = 0; i < myChars.length - 1; i++)
      { 
         myChars[i] = word.charAt(i);
      }
      
      System.out.println("Each entry: ");
      for (int i = 0; i < myChars.length - 1; i++)
      {
         System.out.print("\n" + myChars[i]);
      } System.out.print("\n");
   
      System.out.println("Each entry on one line: ");
      for (int i = 0; i < myChars.length - 1; i++)
      {
         System.out.print(myChars[i]);
      }System.out.print("\n");

      System.out.println("Each entry on one line (enhanced for loop): ");
      for (char character : myChars)
      {
         System.out.print(character);
      } System.out.print("\n"); */
   }
}