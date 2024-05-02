/* 
Name: Miles Walker 
Section/Date: S2 / April 11, 2024
Program: Review Exception - add try-catch block invididually
 “I, Miles Walker, pledge to follow the Honor Code in taking my Lab 12.”
*/
import java.util.*;

public class WalkerM_Lab12
{
   public static void main(String [] args) 
   {
   
         // ** Given source code -- you will add try-catch block for each section that could potentially cause exception**// 
         Scanner  keyboard = new Scanner ( System.in );
         System.out.print("Please enter 2 numbers: ");
         int num1 = 0, num2 = 0; //Define outside try block
         try //try for reading input
         {
            num1 = keyboard.nextInt();
            num2 = keyboard.nextInt();
         }
         
         catch(InputMismatchException e)
         {
            System.out.println("Input should be integers");
         }
         
         try //try for divide by zero
         {
            System.out.println("Result is " + num1 / num2);
         }
         
         catch (ArithmeticException e)
         {
            System.out.println("num2 cannot be zero!"); //necause num1 and num2 were assigned to 0 by default
         }
         keyboard.nextLine( ); // clear buffer
      
         System.out.print("Enter a code: ");
         String code = keyboard.nextLine( );
         try //try for charAt
         {
            char   zone = code.charAt(5);
         }
         
         catch (StringIndexOutOfBoundsException e)
         {
            System.out.println("String cannot be less than 6 char");
            System.out.println(e.getMessage()); //print error message
         }
         for (int i = 0 ; i <  code.length( ) ;  i++)
            System.out.println(code.charAt(i) ); 
         
         
         System.out.print("Enter a double num variable : " );
         
         try
         {
            double num3 = keyboard.nextDouble();
         }
         
         catch (InputMismatchException e)
         {
            System.out.println("num3 should be decimal number.");
         }
         // Array 
         int[] myScores = {12,15,20,13,9};
         
         for(int i : myScores){
            System.out.print(i + ", ");
         }
         keyboard.nextLine();
         // Read input and print out information 
        try
        {   
           System.out.print("\nEnter an index that you want to know the score: ");
           int index = keyboard.nextInt();
           System.out.println("The score at index " + index + " is " + myScores[index]);
        }
               
        catch (InputMismatchException e)
        {
           System.out.println("Index must be integer.");
        }
        
        catch (ArrayIndexOutOfBoundsException e)
        {
           System.out.println("Index cannot be larger than " + (myScores.length - 1));
           System.out.println(e.getMessage()); 
        }  
   } // end main
} // end program
// ** update by YOUR NAME