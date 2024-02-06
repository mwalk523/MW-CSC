//ComputerScience 

import java.util.Scanner; 

public class ComputerScience
{
   public static void main (String args[])
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("I'm a hacker now");
      String name = "Miles";
      String place;
      double cash = 4598.76;
      double change = 0.09;
      double price = 10.0;
      double nationalDebt = 4.5e6;
      System.out.print("we are $" + nationalDebt + " in debt!\n");
      int value = 1; 
      int length = name.length();
      System.out.println(length);
      int value2;
      
      double DBL = keyboard.nextDouble();
      value2 = keyboard.nextInt();
      keyboard.nextLine(); //buffer statement 
      place = keyboard.nextLine();
      System.out.printf("\nvalue2 is %d", value2);
     
      
   
   }
   
}