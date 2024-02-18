import java.util.Scanner;

public class TriDriver //driver for Triangle.java 
{  
   public static void main (String args[])
   {Scanner keyboard = new Scanner(System.in);
   
      //create tri1
      Triangle tri1 = new Triangle(); //no arg-constructor, assigns default values
      System.out.println(tri1);
      tri1.updateHeight(3); //update height to last digit of student id 
      System.out.println("After update height: " + tri1.toString());
      
      //read input for tri2
      System.out.print("Enter base: "); 
      int base = keyboard.nextInt(); //What we enter for base gets assigned to aBase in the class, which is then assigned back to base 
      System.out.print("Enter height: ");
      int height = keyboard.nextInt();
      keyboard.nextLine(); //clear buffer 
      System.out.print("Enter color: ");
      String color = keyboard.nextLine();
      //create tri2
      Triangle tri2 = new Triangle(base, height, color); //  parameter constructor, the values in the parentheses are assigned to aBase, aHeight, etc., then assigned to base, height, etc.
      System.out.println("tri2: " + tri2.toString());
      
      //get info for tri3
      base = tri1.getBase() + tri2.getBase();
      height = tri1.getHeight() + tri2.getHeight();
      if (height % 2 == 1) //odd # 
         color = tri1.getColor();
      else 
         color = tri2.getColor();
      Triangle tri3 = new Triangle(base, height, color);
      System.out.println("tri3: " + tri3.toString());
   }
}