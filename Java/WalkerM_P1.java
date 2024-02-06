/*
Name: Miles Walker 
Instructor: Dr. B and Josh McAdams 
Date: 10/4/23
Location: Dorm/Student Center/Library
Section: 151-02
Desc: Programming Assignment 1 
*/

//Scanner import statement 
import java.util.Scanner;

//Class header
public class WalkerM_P1
{  
   //method header 
   public static void main(String args[])
      {
         //New scanner 
         Scanner keyboard = new Scanner(System.in);
         
         //Declaring String variables to read user input
         System.out.println("Enter the name of your school.");
         String school = keyboard.nextLine();
         
         System.out.println("Enter the name of a person.");
         String person1 = keyboard.nextLine();
         
         System.out.println("Enter the name of another person.");
         String person2 = keyboard.nextLine();
         
         System.out.println("Enter a color.");
         String color1 = keyboard.nextLine();
         
         System.out.println("Enter another color.");
         String color2 = keyboard.nextLine();
         
         //Declaring and initializing int variables
         System.out.println("Enter a (positive) integer.");
         int years = keyboard.nextInt();
         int halfYears = years / 2;
         
         //clear buffer
         keyboard.nextLine();
         
         //Declaring more variables, reading user input for most but initializing others with a value
         System.out.println("Enter the name of a food.");
         String food1 = keyboard.nextLine();
         String food1AllCaps = food1.toUpperCase();
         
         System.out.println("Enter the name of another food.");
         String food2 = keyboard.nextLine();
         
         System.out.println("Enter a personal pronoun (he, she, they, etc).");
         String pronoun = keyboard.nextLine();
         
         System.out.println("Enter an adjective.");
         String adjective1 = keyboard.nextLine();
         
         System.out.println("Enter another adjective.");
         String adjective2 = keyboard.nextLine();
         
         System.out.println("Enter an adverb.");
         String adverb = keyboard.nextLine();
         
         System.out.println("Enter a decimal.");
         double radius = keyboard.nextDouble();
         
         keyboard.nextLine(); //another buffer
         
         double searchArea = Math.PI * Math.pow(radius, 2); //using the math.PI constant and multiplication to find the area
         int eachSearchArea = (int)searchArea / 2; //used a cast operator to identify searchArea as an int 
         
         System.out.println("Enter a plural unit of measurement.");
         String distanceUnits = keyboard.nextLine();
         
         System.out.println("Enter a plural measurement of time.");
         String timeUnits = keyboard.nextLine();
         
         //Print statements
         System.out.printf("%d years ago at %s the esteemed %s desperately needed to find a %s %s.\n", years, school, person1, color1, food1); 
         
         System.out.printf("%s searched and searched for the evasive %s %s, but alas, the %s was never found.\n", pronoun, color1, food1, food1);
         
         System.out.printf("%d years after the search began %s enlisted the help of %s the %s.\n", halfYears, person1, person2, adjective1);
         
         System.out.printf("It turns out that this might have been %s's fatal mistake.\n", person1);
         
         System.out.printf("You see, %s suggested that they focus their search only on %s.\n", person2, school);
         
         System.out.printf("They would create a circle to search around the school and run around shouting \"%s!!%s!!\".\n", food1AllCaps, food1AllCaps);
         
         System.out.printf("The search parameter was going to be %.2f square %s\n", searchArea, distanceUnits);
         
         System.out.printf("That is roughly %d square %s each.\n", eachSearchArea, distanceUnits);
         
         System.out.println("The search could take " + timeUnits + " to complete.");
         
         System.out.printf("In the end %s %s settled for some %s %s and told %s to bug off!", person1, adverb, adjective2, food2, person2);
         
     
              
      } //end of method
      
} //end of program