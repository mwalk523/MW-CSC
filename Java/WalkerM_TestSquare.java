import java.util.Scanner;

public class WalkerM_TestSquare
{
   public static void main(String args[])
   {Scanner keyboard = new Scanner(System.in); 
      
      int side = 10;
      String color = "BLUE";
      Square square1 = new Square(side, color); //what is in the parentheses is set to newBase/newColor, which is then set equal to side/color 
                  
         //mutator methods
         square1.setSide(93); //you CAN use set values for mutator methods, not just variables 
         square1.changeColor("RED");
         
         System.out.println("Square 1:\n" + square1.toString());
         int totalArea = 0;
         
         System.out.println("\nEnter the side length for the second square: ");
            int side2 = keyboard.nextInt();
               keyboard.nextLine();
         System.out.println("Enter the color of the second square: ");
            String color2 = keyboard.nextLine();
            
         Square square2 = new Square(side2, color2);
            System.out.println("Square 2:\n" + square2.toString());
          
         int side3 = square1.getSide() + square2.getSide();
         String color3 = square1.getColor();    
         Square square3 = new Square(side3, color3);
            if (side3 % 2 == 0)
            {
               square3.changeColor(square2.getColor());
            }
            
         System.out.println("\nSquare 3:\n" + square3.toString());
         
         totalArea = square1.getArea() + square2.getArea() + square3.getArea();
         System.out.println("\nTotal area is: " + totalArea);
         
         //Current number of objects 
         System.out.println("Current number of objects so far: " + square1.getCount());
         System.out.println("Current number of objects so far: " + square3.getCount());
         /*MILES WALKER: both statements gave me the same value. This is because both methods are simply calling
         the value of cntSquare. Furthermore, because the cntSquare field is static, this value 
         remains the same across all objects*/
         
         Square square4 = new Square (square1); //copy contructor
            System.out.println("\nSquare 1:\n" + square1.toString());
            System.out.println("\nSquare 4:\n" + square4.toString());
         square4.changeColor("magenta");
            System.out.println("\nSquare 4 (after change):\n" + square4.toString());
         
         Square square5 = square2.copy(); //copy method 
            System.out.println("\nSquare 2:\n" + square2.toString());
            System.out.println("\nSquare 5:\n" + square5.toString());
         square5.setSide(square5.getSide() * 2);   
            System.out.println("\nSquare 5 (after change):\n" + square5.toString());
            
         System.out.print("\n");   
         if (square1.equals(square5)) //Used like a String's .equals method
            System.out.println("SAME");
         else 
            System.out.println("DIFFER");
            
         totalArea = square1.getArea() + square2.getArea() + square3.getArea() + square4.getArea() + square5.getArea();
         System.out.println("\nTotal area is: " + totalArea);
         
         //Miles Walker, Cybersecurity
   }
}