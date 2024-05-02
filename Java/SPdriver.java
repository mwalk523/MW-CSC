//driver
import java.util.Scanner;
public class SPdriver 
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner (System.in);
            
      SqPyramid spP1 = new SqPyramid();
      spP1.setHeight(93);
      
      System.out.println("Enter values for base and height, and a color: ");
         double base2 = keyboard.nextDouble();
         double height2 = keyboard.nextDouble();
         keyboard.nextLine();
         String color2 = keyboard.nextLine();
      SqPyramid spP2 = new SqPyramid (base2, height2, color2);
      
      SqPyramid spP3 = new SqPyramid(spP2);
      spP3.setHeight(spP3.getHeight() * 2);
      
      SqPyramid spP4 = spP1.copy();
      spP4.changeColor("Dark Green");
      
      System.out.print("\n");
      System.out.println("SP1: " + spP1.toString());
         System.out.print("\n");
      System.out.println("SP2: " + spP2.toString());
         System.out.print("\n");
      System.out.println("SP3: " + spP3.toString());
         System.out.print("\n");
      System.out.println("SP4: " + spP4.toString());
      //volume printing as 0.0 for some reason?
      
      double baTotal = spP1.baseArea() + spP2.baseArea() + spP3.baseArea() + 
      spP4.baseArea();
      
      System.out.print("\n");
      
      System.out.println("Total base area of all 4 SqPyramids is: " + baTotal);
      
      System.out.print("\n");
      
      if (spP3.equals(spP4))
         System.out.println("spP4 and spP3 are the same!");
      else 
         System.out.println("spP4 and spP3 are NOT the same!");
   }
}