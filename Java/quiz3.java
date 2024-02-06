/*
A) Define Scanner object (3 pt)

B) Ask user to enter 2 integers (a, b)   and 1 double (r)  (6 pt)

C) Ask user to enter a full name   (fullName)    (2 pt)

D) Define a constant variable, int data type called fixValue and assign last 3 digits of your student ID to this fixValue constant variable.   (3 pt)

E) You will calculate (result1 and result2) and write in comment explain order of precedence in each result:  (8 pts)

        int result1 =  a9 + 5ab + b7

        double result2 =  r + 2b / fixValue

F)  print out all user input values (with appropriate label), as well as result1 and result2 (with 2 decimal points)     (6 pts)

G)  If fullName is longer than 10 characters, print "Your name is longer than 10 characters" at the end (4 pts)

H)  Overall structure of the programs, class header, main method header (8 pts)
*/

import java.util.Scanner;
public class quiz3
{
   public static void main(String args[])
   {Scanner keyboard = new Scanner (System.in);
      System.out.println("Enter two integers: ");
         int a = keyboard.nextInt();
         int b = keyboard.nextInt();
   System.out.println("\nEnter a decimal: ");
      double r = keyboard.nextDouble();
   System.out.println("\nEnter your full name: ");
      keyboard.nextLine();
      String fullName = keyboard.nextLine();
      final int fixValue = 593;
      int result1 = (int)Math.pow(a,9) + (a * b * 5) + (int)Math.pow(b,7);
      double result2 = r + 2 * b / fixValue;
   System.out.println("First integer is " + a + ". Second integer is " + b + ". \nFull name is " + fullName + ". \nResult 1 is " + result1 + ".");
   System.out.printf("Result 2 is %.2f.", result2);

   if (fullName.length() > 10)
      System.out.println("\nYour name is longer than 10 characters.");
   }
}