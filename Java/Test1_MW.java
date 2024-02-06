/* 
Name: Miles Walker
Date: 7/9/23
Instructor: Dr. B and Dr. Muhammad 
Desc: Putting the paper portion of the test into java 
*/ 


//2. Give an import statement to read from the keyboard 
import java.util.Scanner;

//1. Give a complete java program structure
public class Test1_MW 
   {
      
      public static void main (String args[])
         {
            //3. Create a scanner object to read data from the keyboard
            Scanner keyboard = new Scanner (System.in);
            
            //4. Reading input / write Java statements for the following 
            //a. prompt the user for a double 
            System.out.print("Enter double: ");
            //b. Read user input and store input into the variable called myDouble (define your variables)
            double myDouble = keyboard.nextDouble();
            //c. prompt the user for an integer 
            System.out.println("Enter integer: ");
            //d. Read user input and store input into the variable called myInteger (define your variables)
            int myInteger = keyboard.nextInt();
            keyboard.nextLine();
            //e. Prompt the user to enter their name 
            System.out.println("Enter name: ");
            //f. Read user input and store input into the variable called myName (define your variables)
            String myName = keyboard.nextLine();
            //g. Print all variables' values: myDouble, myInteger, and myName with messages
            System.out.println("myDouble is: " + myDouble + 
            "\nmyInteger is: " + myInteger +
            "\nmyName is: " + myName);
            //h. print myName in ALL UPPERCASE, including the number of characters in myName. Make sure to print with messages
            String upper = myName.toUpperCase();
            int charNum = myName.length();           
            System.out.println("UPPERCASE of myName is: " + upper + ", and it has " + charNum + " characters.");
            
            //i. Print the fourth character of myName using method and with a message 
            char fourthLetter = myName.charAt(3);
            System.out.print("The fourth character is: " + fourthLetter + ".");
            
            /*5. Give the order of precedence (execution, write 1 to 7):
            -7 + 4 * 3 % 5 - 6 / 2 + 7 
            1. -7
            2. * 3 
            3. % 5 
            4. / 2 
            5. + 4 
            6. - 6 
            7. + 7 
            */
        
            /*6. Give the order of the precedence of the following formula (you may re-write to make it easier to provide the order
            
            result = (((Math.pow(num3, 2) + 3) * num2) / (Math.sqrt(Math.pow(num1, 3) - 5))) + Math.sqrt(Math.pow(num2, 4) + 10)
            1. *num2 
            2. + 3 
            3. Math.pow(num3, 2)
            4. -5 
            5. Math.pow(num1, 3)
            6. Math.sqrt(Math.pow(num1, 3))
            7. / Math.sqrt(Math.pow(num1, 3)) - 5
            8. + 10
            9. Math.pow(num2, 4)
            10. + Math.sqrt(Math.pow(num2, 4) + 10)
            */
            
            /*7. Write a complete java statement for the following calculation (num1, num2, num3 are integers; have been defined and assigned values)
            
            a. int result1 = ((int)Math.pow(num1, 2)) + (4 * (int)Math.pow(num2, 3) - (2 * (int)Math.pow(num3, 7));
            
            b. int result2 =  (int)((Math.pow(num3, 10) + 3) * num2) / Math.sqrt(Math.pow(num1, 4));
            
            c. double result3 = (((double)num3 - (double)num2) / (8 * (double)num1)) + (((4 * (double)num1) - num3) / num2);
            
            d. double result4 = (Math.sqrt((3 * Math.pow(num2, 4)) + 3) - (double)num1) / (7 * Math.pow(num2, 2));
            */
         
                
         
         }
    
   }