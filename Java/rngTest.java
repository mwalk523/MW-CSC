
import java.util.Scanner;
import java.util.Random;

public class rngTest
{

   public static void main (String args[])
   { 
     Scanner keyboard = new Scanner(System.in);
     Random rng = new Random();
     int x = rng.nextInt(10) + 1;
     System.out.println(x);
   
      
   } // end main method 

} //ending of program
