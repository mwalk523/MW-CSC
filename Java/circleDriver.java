import java.util.Scanner;
public class circleDriver
{
   public static void main(String args[])
   {Scanner keyboard = new Scanner (System.in);
      Circle c1 = new Circle();
         System.out.println("Circle 1:\n" + c1.toString());
      
     System.out.println("Enter a value for diameter: ");
         int diameter = keyboard.nextInt();
         keyboard.nextLine();
     System.out.println("Enter a color: ");
         String color = keyboard.nextLine();
     Circle c2 = new Circle(diameter, color);
         System.out.println("Circle 2: " + c2.toString());
    
   }
}