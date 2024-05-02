import java.util.Scanner;

public class WalkerM_Exam3Q2Driver
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner(System.in);
   
      Pyramid pyrOne = new Pyramid();
      pyrOne.setSide(93);
      
      System.out.println("Enter values for side and height, a color, and a material:\n");
         int s = keyboard.nextInt();
         double height = keyboard.nextDouble();
         keyboard.nextLine();
         String c = keyboard.nextLine();
         String m = keyboard.nextLine(); 
      
      Pyramid pyrTwo = new Pyramid (s, height, c, m);
      pyrTwo.setColor(pyrOne.getColor());
      
      Pyramid pyrThree = new Pyramid (pyrOne.getSide(), pyrTwo.getColor());
      
      System.out.println("\nPyramid 1:" + pyrOne.toString() +
                         "\n\nPyramid 2:" + pyrTwo.toString() +
                         "\n\nPyramid 3:" + pyrThree.toString());
   }
}