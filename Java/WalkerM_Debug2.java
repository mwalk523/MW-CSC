// Comments at the beginining
//Author: Miles Walker
//Instructor: Dr. Muhammad and Dr. Boonthum-Denecke
//Class: CSC-100-33
//Date: June 30, 2023 - 4/3/23
//Description: Debugging Assignment 2

////////////////////////////////////////////////////////////

//**************************************************************
// Instruction:  For everything that you fix, you will need 
//               to put in a comment ABOVE or END of the line that you fixed
//**************************************************************

//================================ NO ERROR ABOVE THIS LINE =============================

// import Scanner class
import java.util.Scanner; 

public class WalkerM_Debug2    // please make sure that you replace LASTNAME and first-inital with your own
{
   public static void main (String args[]) // Moved the brackets around, made "main" lowercase
   {
   
      Scanner keyboard = new Scanner (System.in); // capitalized Scanner and System 
     
      //Part A: read 3 integers, calculate sum and average. Average should have correct decimal point 
      int num1, num2, num3, sum;
      double average;
            
      //A.1) read input from keyboard
      System.out.print("Enter the first integer: " );
      num1 = keyboard.nextInt();
      System.out.print("Enter the second integer: " );
      num2 = keyboard.nextInt();
      System.out.print("Enter the third integer: " );
      num3 = keyboard.nextInt(); //added ()
      //made keyboard lowercase, made int uppercase in nextInt
      
      //A.2) calculate sum
      sum = num1 + num2 + num3; // changed num2 * num3 to num2 + num3; also removed int at the start as sum was already defined 
      
      // A.3) calculate average
      average = (double) sum / 3; //defined sum as a double so that the program would output the actual decimal average and not 3 
      
      // A.4) print out result -- make sure to check spacing
      System.out.println("You enter 3 integers: " + num1 + ", " + num2+ ", and " + num3); //Corrected spacing on num3 
      System.out.println("Sum of these integers is " + sum); //Corrected the spelling in "Sytem", changed the 1n in "print1n" to ln
      System.out.println("Average of these integers is " + average); 
      //Corrected the capitalization on "system.Out.print", also added end quotes to close the quote and allow the variable to be read
      
  
      
      // Part B: Reading mixed data type - String, int, double
      keyboard.nextLine(); //added a buffer 
      System.out.print("Enter your name: "); // Tells user what to enter 
      String name = keyboard.nextLine(); // Reads user imput, assigns to name
      
      System.out.print("Enter your age: ");
      int age =  keyboard.nextInt(); // Reads the age: int; made int lowercase so it could be recognized as a variable 
      
      keyboard.nextLine();
      
      System.out.print("Enter your major: ");
      String major = keyboard.nextLine(); // Reads the major: string; capitalized the string variable 


      System.out.print("Enter your high-school GPA: ");
      double gpa = keyboard.nextDouble(); // Reads the gpa: double; Capitalized the D in "keyboard.nextdouble"
      
      keyboard.nextLine();
      
      System.out.print("Enter your favorite artist (actor/singer): ");
      String artist = keyboard.nextLine(); // reads the artist: string; capitalized line in "nextLine", added () 
      
      //B.2) Print out all the input given by user with one print statement and tab/indentation from line age onward
      
      System.out.println("Name is " + name  + "\n\tAge is " + age + "\n\tGPA is " + gpa +
                           "\n\tMajor is " + major + "\n\tFavorite Artist is " + artist); /*added another plus sign after the gpa variable to link it to the next line
                           Also added an \n to "Favorite artist" to make it a new line, and made sure all the slashes for \n and \t were backslashes */
                           
      
      // Part C: String Manipulation
      int num_chars = major.length(); // how many char in string; added () after major.length
      String str_caps = major.toUpperCase(); // converts to all upper case
      String str_lower = major.toLowerCase(); // converts to all lower case; changed major.Lowercase to major.toLowerCase
      char thirdLetter = str_caps.charAt(2); //  get the third letter of major and assigns it to thirdLetter as a char variable; because the first letter is assigned to 0, the third letter would be 2, not 3 
      char firstLetter = artist.charAt(0); //  get the first letter of artist and assigns it to firstLetter as a char variable; same as previous line, first character is 0, not 1 
      
      // C.2) print out all information 
      System.out.println("Major is " + major + ", has " + num_chars + " characters"); //changed the variable after "major is" to major instead of name
      System.out.println("UPPERCASE of major is " + str_caps);
      System.out.println("lowercase of major is " + str_lower);
      System.out.println("The third character of major is " + thirdLetter);
      System.out.println("The first character of artist is "  + firstLetter); // fixed the capitalization in firstletter to math the variable, also fixed the capitalization in the print statement (U should be lowercase)
      //Finally, added quotes to the statement in parentheses
      
      // Part D: Math Calculations
      int myAnswer1 = (int) Math.pow(8, 4); // 8 to the power of 4 -- result should be 4096 as integer; capitalized math.pow, also defined math.pow as an integer individually as it would come out as a double otherwis e
      System.out.println("myAnswer1 is " + myAnswer1); //Capitalized System
      
      int myAnswer2 = (int) Math.sqrt(4); // square root of 4 is 2 -- result shold be 2 as integer; made Sqrt lowercase 
      System.out.println("myAnswer2 is " + myAnswer2);
      
      /*===============  submit the first submission before you start extra credit  ===========*/
      /*===============  You will write additional Java code to complete the following ========*/
      
      /* Part E: Bonus 1- reading more and printing  (7 points)
      
      
       You will definite your own variables or reuse variables - make sure do not duplicate 
       E.1) Read input (use appropriate data type - String, int, double): name, age, hometown_city, college_name, company, salary, dream_vacation
       E.2) based on the input you will print out using the following format in 1 print statement, variables are in { .. } 
       
            There once was a person named {name} who lived in {hometown_city}.
               At the age of {age}, {name} went to college at {college_name}.
               {name} graduated and went to work for {company} with starting saraly at {salary}.
               {name} hope that to travel to {dream_vacation}
      
      */
      
            System.out.println("Enter hometown city: ");
            String hometown_city = keyboard.nextLine();      
            System.out.println("Enter college: ");    
            String college_name = keyboard.nextLine();
            System.out.println("Enter company: ");
            String company = keyboard.nextLine();
            System.out.println("Enter salary: ");
            double salary = keyboard.nextDouble();
            keyboard.nextLine();
            System.out.println("Enter dream vacation: ");
            String dream_vacation = keyboard.nextLine();
            
            System.out.println("There once was a person named " + name + " who lived in " + hometown_city + "." + 
            "\n\tAt the age of " + age + ", " + name + "went to college at " + college_name + "." + 
            "\n\t" + name + "graduated and went to work for " + company + "with starting saraly at " + salary + "." +
            "\n\t" + name + "hope that to travel to " + dream_vacation);
      
      /*  Part F: Bonus 2 - reading and calcuation (8 points)
          F.1) You will ask the user to enter an integer variable called side;  NOTE that side will be used for all calculation
          F.2) You will then look up the formular and calculate the following 
               (need to make sure that the results that need decimal points are double data type)
              (a) an area of a square with {side}  
              (b) a perimeter of a square with {side}
              (c) an area of a circle with a radius of {side}
              (d) a perimeter of a circle with a radius of {side}
              (e) an area of a circle with a diameter of {side}
              (f) a perimeter of a circle with a diameter of {side}
              (g) a volume of a ball with a radius of {side}
              (h) an area of a hexagon with {side}

          F.3) You will print out each result one per line - don't forget to provide a label, eg. an area of a square with {side} is {area_sq}.
      
      */
      
      
         
   } // End of Main
} // End of Class
// Fixed the brackets for "end of main" and "end of class" by making them closed rather than open
