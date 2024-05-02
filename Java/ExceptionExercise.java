import java.util.Scanner;
public class ExceptionExercise 
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner (System.in);
      
      try
         {
            System.out.println("Enter 2 integers: ");
               int num1 = keyboard.nextInt();
               int num2 = keyboard.nextInt();
            System.out.println("Enter a double: ");
               double num3 = keyboard.nextDouble();
         }
         catch (Exception e)
         {
            System.out.println("Value should be numbers.");
         }
      keyboard.nextLine();
      System.out.println("Enter a name: ");
         String name = keyboard.nextLine();
      try 
         { 
            char myChar = name.charAt(10);
         }
         catch (Exception e)
         {
            System.out.println("The name was not long enough to get character at index 10.");   
         } 
      System.out.print("\n");
      int[] myScores = {12, 15, 20, 13, 9};
      System.out.println("What index do you want to print from the array (0-4)? ");
      
      try 
         {
            int index = keyboard.nextInt();
            System.out.print(myScores[index]);
         }
         catch (Exception e)
         {
            System.out.println("Index should be within range.");
         }   
   }
}