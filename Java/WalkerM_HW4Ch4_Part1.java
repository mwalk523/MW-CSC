import java.util.Scanner;

public class WalkerM_HW4Ch4_Part1
{

   public static void main (String args[])
   { 
   Scanner keyboard = new Scanner(System.in);


   int a = keyboard.nextInt();
   int b = keyboard.nextInt();
   int c = keyboard.nextInt();
   int z = keyboard.nextInt();
   int x = keyboard.nextInt();
   int y = keyboard.nextInt();
   int speed = keyboard.nextInt();
   
   if (speed >= 0 && speed <= 200) 
System.out.println("The number is valid");

   
   if (a < 10)
   {
   b = 0;
   c = 1;
   }
   else 
   {
   b = -99;
   c = 0;
   }
   
   if (x > 0)
{
	if (y < 20)

	z = 1;
	else
   { 
   z = 0;
	c = 3;
   }
}

keyboard.nextLine();
String name1 = keyboard.nextLine();
String name2 = keyboard.nextLine();
  
if (name1.compareTo(name2) > 0) 
System.out.println("Alphabetical order is " + name2 + ", " + name1 + ".");

if (name1.compareTo(name2) < 0)
System.out.println("Alphabetical order is " + name1 + ", " + name2 + ".");

 
int d = 5;
int e = 3;
int f = 5; 

f = (d > e) ? d * 5 : e * 5;

int result = keyboard.nextInt();
System.out.println((result >= 0) ? "The result is positive." : "The result is negative.");

keyboard.nextLine();
char selection = keyboard.nextLine().charAt(0);
switch (selection)
{
case 'A':
System.out.println("You selected A.");
break;

case 'B':
System.out.println("You selected B.");
break;

case 'C':
System.out.println("You selected C.");
break;

case 'D':
System.out.println("You selected D.");
break;

default:
System.out.println("Not good with letters, eh?");
}


      
   } // end main method 

} //ending of program
