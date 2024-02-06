/*
Name: Miles Walker 
Coding HW2: Number Game
Instructor: Dr. B & Josh
*/

import java.util.Scanner;
import java.util.Random;

public class WalkerM_P2
{
   public static void main(String args[])
      {
      
         //Section 1 - Introducing the game
            System.out.println("Let's play a number guessing game!");
            
         //Section 2 - Determining the range 
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("Enter an integer:");
            int num1 = keyboard.nextInt();
            System.out.println("Enter a second (different) integer:");
            int num2 = keyboard.nextInt();
            
            if (num1 == num2)
               {
               System.out.println("Not cool. I asked for different numbers.");
               return; //exits the program
               }
            int smallest = (num1 < num2) ? num1 : num2;
            int largest = (num1 > num2) ? num1 : num2;
            
            int range = -1;
            if (num1 < 0 && num2 < 0)
               range = Math.abs(smallest) - Math.abs(largest) + 1;
               
            if (num1 >= 0 && num2 >= 0)
               range = largest - smallest + 1;
               
            if (num1 > 0 && num2 < 0)
               range = Math.abs(smallest) + largest + 1;
               
            if (num1 < 0 && num2 > 0) 
               range = Math.abs(smallest) + largest + 1;
               
          
          //Section 3 - Choosing a Number
            Random rng = new Random();
            
            int target = rng.nextInt(range) + smallest;
            System.out.println("I've chosen a random number in the range you specified.");
            System.out.printf("There are %d numbers to choose from, between and including %d and %d.", range, smallest, largest);
           
         
         //Section 4 - First Guess - Nested If
            System.out.printf("\nGuess a whole number between and including %d and %d: ", smallest, largest);
            int guess = keyboard.nextInt();
            
            if (guess != target)
            {
               if (guess > target)
               {
                  System.out.printf("%d is too large", guess);
                  largest = guess - 1;
               }
               
               if (guess < target)
               {
                  System.out.printf("%d is too small", guess);
                  smallest = guess + 1;
               }
             
             }
               
            if (guess == target)
            {
            System.out.printf("\n%d is correct.", guess); 
            return;
            }
            
            
         //Section 5 - If Without Nesting, Second Guess 
         
            System.out.printf("\nGuess a whole number between and including %d and %d: ", smallest, largest); 
            guess = keyboard.nextInt(); 
            
            if (guess == target)
            {
               System.out.printf("%d is correct.", guess);
               return;
            }
            
            if (guess > target)
            {
               System.out.printf("%d is too large", guess);
               largest = guess - 1;
            }
            
            if (guess < target)
            {
               System.out.printf("%d is too small", guess);
               smallest = guess + 1;
            }
            
         //Section 6: Conditional Operators, third guess  
            
            System.out.printf("\nGuess a whole number between and including %d and %d: ", smallest, largest); 
            guess = keyboard.nextInt();
            
            if (guess == target)
            {
               System.out.printf("%d is correct.", guess);
               return;
            }
            
            String direction = (guess > target) ? "large" : "small";
            largest = (guess > target) ?  guess - 1 : largest;
            smallest = (guess < target) ? guess + 1 : smallest;
            
            System.out.printf("%d is too %s", guess, direction);
            
         //Section 7 - Switch, fourth guess  
         
            System.out.printf("\nGuess a whole number between and including %d and %d: ", smallest, largest);  
            guess = keyboard.nextInt();
            int offBy = 0;
            
            if (guess > target)
            offBy = 1; 
            
            if (guess < target)
            offBy = -1;
            
            if (guess == target)
            offBy = 0;
            
            switch (offBy)
            {
               case -1:
               System.out.printf("%d is too small. The number was %d.", guess, target);
               break;
               
               case 1:
               System.out.printf("%d is too large. The number was %d.", guess, target);
               break;
               
               case 0:
               System.out.printf("%d is correct.", guess);
            }
               
      }
}