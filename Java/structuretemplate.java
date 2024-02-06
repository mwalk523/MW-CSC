/*
Author: [name]
Instructor: Dr. B & Dr. Muhammad
Date: 
Program Name:
Description:
*/ 



public class //title
{

   public static void main (String args[])
   { 
   
      
   } 

} 


//Scanner input template 
import java.util.Scanner; // put above the class
Scanner keyboard = new Scanner(System.in); //Create scanner object, right after method header 
// keyboard is just the name of the object, you can make it whatever 

//PrintWriter input template 
import java.io.*; //This import statement is actually used for a number of classes to work with files, PrintWriter is one of them
PrintWriter outputFile = new PrintWriter ("StudentData.txt");

//Random input template
import java.util.Random;
Random rng = new Random(); //Notice no system.in

String firstName = keyboard.nextLine();
// String variable = keyboard.nextVar();
keyboard.nextLine(); //clear buffer, needed everytime you go from an int or double to a string, should always be nextLine, DONT FORGET PARENTHESES
String name = "Miles"; //how to write a non-input String var 
//To read a char, you have to first make an input statement and then use charAt to read the first letter 
//OR, you can use keyboard.nextLine().charAt(0)

//String manipulation 
For # of characters: int string.length(); // where "string" is replaced with the actual String variable name (in quotes if it isn't an input)
For Upper Case: String upper = string.toUpperCase();
For lower case: string lower = string.toLowerCase();
For the xth character: char firstLetter = string.charAt(0); //where 0 is the first character 
keyboard.nextLine().charAt(0); //To read a character (must go into a character variable)
keyboard.nextLine().length(); //To read input length 
// these are also known as methods 


//math commands 
Math.pow(x, y)
Math.sqrt(x)
Math.abs //absolute value

      /* 
      OOP Order
      Take care of things in parentheses first, right to left
      Negatives first - Right to left 
       * , /, Math.pow, Math.sqrt and % - Left to right 
       + and -, Left  to right
       In a division problem, take care of the numerator, then denominator , and then the division
      */
      
      //Example 
         
         result = (((Math.pow(num3, 2) + 3) * num2) / Math.sqrt(Math.pow(num1, 3)) - 5) + (Math.sqrt(Math.pow(num2, 4) + 10))
         
         /*
         Order of Precedence 
         1. Math.pow(num3, 2)
         2. + 3 
         3. * num2
         4. Math.pow(num1, 3)
         5. Math.sqrt(Math.pow(num1,3))
         6. - 5 
         7. / Math.sqrt(Math.pow(num1,3)) - 5
         8. Math.pow(num2, 4)
         9. + 10 
         10. Math.sqrt(Math.pow(num2, 4) + 2)
         11. + Math.sqrt(Math.pow(num2, 4) + 2)
         
         * in a problem with a fraction, you should take care of the numerator first, then the denominator, and then whatever is added to it. 
           Treat them as separate parts.
         */
        

// conditioning statements
'if'statement: decides whether a section of code executes or not; uses a boolean to decide whether the next statement or block of statements executes
In most cases the boolean expression uses expressions like:
    < less than
    > Greater than
    == equal to (note the two equal signs)
    >= greater than or equal to 
    <= less than or equal to 
    != not equal to
    && range (Example: (average >= 80 && average <= 89 )); also allows for multiple non-if statements in one if statement
    || = and 
    
'if-else' statements- adds the ability to conditionally execute code when the if statement is false 

if (expression)
System.out.println(statement);

else 
System.out.print(statement);

'if-else-if' statements- basically lets you put multuple if/else statements into one 
Example:

           
          // if-else-if 
          //check equals first, and then which one ever one is larger 
          System.out.println("\nif-else-if");
          if (num1 == num2)
            System.out.println(num1 + " is equal to " + num2);
            
          else if (num1 > num2) //second if statement
            System.out.println(num1 + " is larger than " + num2);
            
          else //if neither of the above statements are true it goes to this one  
            System.out.println(num2 + " is larger than " + num1);
          
          //calculation - based on num1 and num2 that we have 
          //only do this if num1 and num2 are not the same
            if (num1 != num2)
            {            
            //if num1 is larger then do the following 
               if (num1 > num2)
               { //these brackets contain the 'if' statement
            //      create a int diff variable, use num1 - num2 
               int diff = num1 - num2;                  
            //      create a double result 1, diff / num2
                double result1 = (double) diff / num2;            
            //      then print the result both diff and result1
               System.out.println("Diff is " + diff + "\n result1 is " + result1);
               }
            
          
          //if num2 is larger...
               else 
               {
          //      create an int diff variable , use num2 - num1 
               int diff = num2 - num1;
          //      create a double result2, diff / num1 
               double result2 = diff / num1;
          //      then print the result both diff and result2
               System.out.println("Diff is " + diff + "\nresult2 is " + result2);
               }   
            
            }   

loops 
      //while loops 
      int num1 = 1; //starting value to test
      while (num1 <= 10) //correct conditions; test to see it it will enter the loop 
      { //Brackets!
         System.out.println ("Hello world");
         num1 = num1 + 1; //add -  when num =11 will not enter loop 
         
      } //as long as the while condition is met the loop (in the brackets) will execute
"""
To test for even numbers use (number % 2 == 0), because an even number will be perfectly divisible by two
"""
 
 //for...loop 
     //start i = 1, Test: +1, everytime i loop increment
     //Test i <= 10 if true goes into loop
     //adds i to 1 
       int sum1 = 0;
       for(int i = 1; i <= 10; i++) //start with i equal to one, one key difference from while is that all the statements are at the top rather than within the loop 
       {
       System.out.println("i: " + i);
       sum1 = sum1 + 1;  
       return;
       } 
     //type "return" to exit the program

// the i++ means it is increasing incrementally by 1 each loop, alternatively you could use i+2 or something like that
/* key difference between for and while loops is that for loops can run a set amount of times and then stop,
on the other hand while loops can go infinitely and only stop when the preset condition is no longer met */

System.out.printf method 
The printf method basically lets you substitute format specifiers within the print statement for variables like an int*/
int value;
value = 2; 
System.out.printf("value is %d", value);
/* %d is the format specifier and only works for int variables, an error will occur if it is a non-int value 
- The , at the end separates the print statement from the variable/argument list. This tells the program what arguments are in the print statement.
- WIthout this list, the format specifier %d will not be read as the int variable 
- You can use multiple format specifiers and the program will print out the first, second, third variables and so on 
- Make sure to put all the vars in the argument list!
- The format specifier for float/double variables is %f, %s is for strings
- For doubles or floats, you can put a decimal between the % and the f (ex. %.1f) 
to affect the number of decimal places shown. %.1f shows one decimal place, %.2f shows 2, etc. 
*/


