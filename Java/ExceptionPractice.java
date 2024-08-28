import java.util.*;

public class ExceptionPractice
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner(System.in);
     
     int num1 = 0;
     try
     {
        System.out.println("Enter an integer: "); 
         num1 = keyboard.nextInt();
         keyboard.nextLine();
     }
     
     catch (InputMismatchException e)
     {
         System.out.println("Input must be an int!");
     }
     
     
     System.out.println("Enter a number to divide your int by: "); 
        int dividend = keyboard.nextInt();
        keyboard.nextLine();
     
     try
     {
         double quotient = num1 / dividend;
         System.out.println("Result: " + quotient);
     }
     
     catch (ArithmeticException e)
     {
         System.out.println("\nOperation impossible!");
         System.out.println(e.getMessage());
     }
      
     System.out.print("Enter a string (at least 6 characters long): ");
     String code = keyboard.nextLine();
        try //try for charAt
         {
            char 6zone = code.charAt(5);
            for (int i = 0 ; i <  code.length( ) ;  i++)
            {
               System.out.println(code.charAt(i));
            }
         }
         
         catch (StringIndexOutOfBoundsException e)
         {
            System.out.println("String cannot be less than 6 char");
            System.out.println(e.getMessage()); //print error message
         }
      
      int[] numArray = {23, 25, 27, 28, 29};
      System.out.println("Enter an index to search for: ");   
         int index = keyboard.nextInt();
      
      try 
      {
         System.out.println(numArray[index]);
      }
      
      catch (ArrayIndexOutOfBoundsException e)
      {
         System.out.println(e.getMessage());
      }
      
         
   }
   
}