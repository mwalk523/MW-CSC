import java.util.Scanner;
public class ForLoopPractice
{

   public static void main (String args[])
   { 
      Scanner keyboard = new Scanner(System.in);
      //Using a for loop, write a program that calculates the sum of all even numbers between 1-100 and prints the result.
      
      int sum = 0;
      for (int count = 1; count <= 100; count++)
      {
      if (count % 2 == 0) //testing for an even number, because an even number will be perfectly divisible by 2, hence no remainder
         {
         sum = sum + count;
         System.out.println(sum);
         }
      }
      System.out.println("\nTotal sum: " + sum);
      
     
      int number = keyboard.nextInt();
      for (int count = 0; number < 1 || number > 100; count++) 
         {
            System.out.println("Invalid");
            number = keyboard.nextInt();
         }
      
      System.out.println("Enter a positive integer");
      int x = keyboard.nextInt();
      while (x < 0)    
      {
         System.out.println("Invalid number. I said *positive*!\n");
         x = keyboard.nextInt();
      }
      System.out.println("You entered " + x + ".");
     
      //do-while - read 3 integers, get sum/average, print asking if they want to repeat y or n
     char yayOrnay;
     
     do
     {
         System.out.println("Enter 3 integers, pressing enter between each one:");
         int y = keyboard.nextInt();
         int z = keyboard.nextInt();
         int a = keyboard.nextInt();
         int sum2 =  z + y + a;
         double average = sum2 / 3;
         
         System.out.printf("\nYou entered %d, %d, and %d. Sum is %d and average is %.2f. Would you like to repeat? Y or N\n", y, z , a, sum2, average);
         keyboard.nextLine();
         yayOrnay = keyboard.nextLine().toUpperCase().charAt(0);
         if (yayOrnay == 'Y')
            System.out.println("You chose to repeat.\n");
      }
      while (yayOrnay == 'Y');
      System.out.println("You decided to not repeat.");
      
      System.out.println("Enter the number 3. You have 3 tries.");
      int b = keyboard.nextInt();
     
      for (int tries = 0; tries < 2; tries++)
      {
         if (b != 3)
         {
            System.out.println("Hello??? I said enter 3 idiot");
            b = keyboard.nextInt();
         }
      }
      if (b == 3)
         System.out.println("Thank you for following instructions and entering " + b + ".");
      
      else
         System.out.println("Out of tries...");
      
      
      
   } // end main method 

} //ending of program