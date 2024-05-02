
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class switchTest
{

   public static void main (String args[])
   { 
   
      Random rng = new Random();
      Scanner keyboard = new Scanner(System.in);
     /* 
      int x = keyboard.nextInt();
      int y = keyboard.nextInt();
      
      if (y == 100)
      x = 1;

      else
      x = 0;
      
      
      char myChar = 'D';
      if (myChar == 'D')
      System.out.println("Goodbye");

      
      switch (x)
      {
      
      case 5:
      System.out.println("Success");
      break;
      
      default:
      System.out.println("failure");
      
      }
      
      double test = rng.nextDouble();
      System.out.println(test);
      
      if (x == 5)
      {
      y = 3;
      System.out.println(y);
      }
      
      /*
      String name;
      name = JOptionPane.showInputDialog("Enter your Name");
      
      
int amount1 = keyboard.nextInt();
int amount2 = keyboard.nextInt();
if (amount1 > 10)
    {
	if (amount2 < 100);
	System.out.println("Between amount1 and amount2, the greatest between them is amount1 with a value of " + amount1 + ".");
   }
   
   int temperature = keyboard.nextInt();
   
   if (temperature >= -50 && temperature <= 150)
	System.out.println("The number is valid.");
   
   String title1 = keyboard.nextLine();
   String title2 = keyboard.nextLine();
   
if (title1.compareTo(title2) < 0)
System.out.printf("Alphabetical order is %s, %s.", title1, title2);

if (title1.compareTo(title2) > 0)
System.out.printf("Alphabetical order is %s, %s.", title2, title1);
*/


System.out.println("Enter a positive number of seconds");
int seconds = keyboard.nextInt();

if (seconds < 60)
System.out.printf("You entered %d seconds.", seconds);


else if (seconds >= 60 && seconds < 3600)
{
   int minutes = seconds / 60;
   int leftoverSec = seconds - (minutes * 60);
   System.out.printf("\nYou entered %d seconds, which translates to %d minutes with %d seconds left over.", seconds, minutes, leftoverSec);
}

else if (seconds >= 3600 && seconds < 86400)
{
   int hours = seconds / 3600;
   int leftoverSec = seconds - (hours * 3600);
   System.out.printf("\nYou entered %d seconds, which translates to %d hours with %d seconds left over.", seconds, hours, leftoverSec);
}

else if (seconds >= 86400)
{
   int days = seconds / 86400;
   int leftoverSec = seconds - (days * 86400);
   System.out.printf("\nYou entered %d seconds, which translates to %d days with %d seconds left over.", seconds, days, leftoverSec);
}


/*
int price = 99; 
int packages = keyboard.nextInt();

if (packages >= 10 && packages < 20)
{
   double discount = 0.20;
   double total = price * discount;
   System.out.printf("Total price is %f.", total);
}
   
if (packages >= 20 && packages < 50)
{
   double discount = 0.30;
   double total = price * discount;
   System.out.printf("Total price is %f.", total);
}

if (packages >= 50 && packages < 100)
{
   double discount = 0.40;
   double total = price * discount;
   System.out.printf("Total price is %f.", total);
}

if (packages >= 100)
{
   double discount = 0.50;
   double total = price * discount;
   System.out.printf("Total price is %f.", total);
}

else
System.out.printf("Total price is %f.", price);
*/

/*
System.out.println("Enter your weight in pounds:");
int weight = keyboard.nextInt();

System.out.println("Enter your height in inches:");   
int height = keyboard.nextInt();

double BMI = weight * (703 / Math.pow(height, 2));  

if (BMI >= 18.5 && BMI <= 25)
System.out.println("\nYou are within the optimal weight range.");

if (BMI < 18.5)
System.out.println("\nYou are underweight.");

if (BMI > 25)
System.out.println("\nYou are overweight.");
*/


System.out.println("Welcome to Serendipity Booksellers! How many books have you purchased this month?");
int books = keyboard.nextInt();

switch (books)
{
   case 0:
   case 1:
   {
   System.out.println("You earn 0 points.");
   System.out.print(" oops");
   }
   break;
   
   case 2:
   System.out.println("You earn 15 points.");
   break;
   
   case 3:
   System.out.println("You earn 30 points.");
   break;
   
   default:
   System.out.println("Rip");
}

if (books >= 4)
   System.out.println("You earn 60 points!");


/*
int sales = keyboard.nextInt();   
double commission;

if (sales < 10000 && sales >= 0)
   commission = 0.1;

else if (sales >= 10000 && sales <= 15000)
        commission = 0.15;

else if (sales > 15000)
        commission = 0.2;

else 
System.out.println("Invalid value. No commission.");
*/
   
      
   } // end main method 

} //ending of program
