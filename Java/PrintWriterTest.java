import java.util.Scanner;
import java.io.PrintWriter; //import Statement used to import a number of classes used to work with files (this is one of them)
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class PrintWriterTest
{

   public static void main (String args[]) throws FileNotFoundException, IOException //"Passes the buck" - Acknowledges the error but lets someone else handle the program

   { Scanner keyboard = new Scanner (System.in);
     System.out.println("Enter file name:");
     String filename = keyboard.nextLine();     
     FileWriter fw = new FileWriter ("test.txt");
     PrintWriter writer = new PrintWriter (fw); //Designates a file name to PrintWriter
     writer.println("Hampton University");
     writer.println("Computer Science Department");
     writer.close();
      
   } // end main method 

} //ending of program