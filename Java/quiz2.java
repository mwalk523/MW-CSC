import java.util.Scanner;
public class quiz2 
{
   public static void main (String args[])
   { Scanner keyboard = new Scanner (System.in);
   String name1 = "Miles";
   String name2 = "Jadyn";
   /*
   if (!(name1.equals(name2)))
      {
         if (name1.compareTo(name2) < 0)
            System.out.printf(name1 + ", " + name2);
         if (name1.compareTo(name2) > 0)
            System.out.printf("%s, %s", name2, name1);
      }
    
    
    System.out.println("Please enter a character of the alphabet: ");
      char choice = keyboard.nextLine().toUpperCase().charAt(0);
    switch (choice)
    {
      case 'A':
         System.out.println("Apple");
      break;
      
      case 'B':
         System.out.println("Banana");
      break;
      
      case 'C':
         System.out.println("Cantaloupe");
      break;
      
      case 'D':
         System.out.println("Dragonfruit");
      break;
      
      default:
         System.out.println("No fruit on the list");
      }
    
    
    int num1 = keyboard.nextInt();
    int num2 = keyboard.nextInt();
    int num3 = keyboard.nextInt();
    
    if (num1 == num2 && num2 == num3 && num1 == num3)
      System.out.println("The numbers are the same");
    else 
    {
      if (num1 > num2 && num2 > num3)
         System.out.printf("%d, %d, %d", num3, num2, num1);
         
      if (num1 > num3 && num3 > num2)
         System.out.printf("%d, %d, %d", num2, num3, num1);
         
      if (num2 > num1 && num1 > num3)
         System.out.printf("%d, %d, %d", num3, num1, num2);
      
      if (num2 > num3 && num3 > num1)
         System.out.printf("%d, %d, %d", num1, num3, num2);
         
      if (num3 > num2 && num2 > num1)
         System.out.printf("%d, %d, %d", num1, num2, num3);
         
      if (num3 > num1 && num1 > num2)
         System.out.printf("%d, %d, %d", num2, num1, num3);        
    }
    
    
      System.out.println("Please enter your full name");
         String fullName = keyboard.nextLine();
        
      
      if (fullName.length() > 10)
         System.out.println("Your " + fullName + " is longer than 10 characters.");
      
      else 
         System.out.println("Your " + fullName + " only has " + fullName.length() + " characters.");
      */
      /*
      int choice;
      int sum = 0;
      do 
      {
         System.out.println("Enter a positive number (enter -1 to stop): ");
         choice = keyboard.nextInt();
         if (choice > 0)
         {
            sum += choice;
         }
      }
      while (choice != -1);
      System.out.println(sum);
      
      int num = 5;
      while (num == 5)
      {
         System.out.println("incorrect.");
         break;
      }
      
      
      int num = 0;
      while (num <= 100)
      {
         if (num % 5 == 0 && num >= 15)
         {
            System.out.println(num);
         }
         num += 1;
      }
    
      int num = 70;
      do 
      {
         System.out.println(num);
         num--;
      } while (num >= 0);
     
     
     System.out.println("Enter an integer: ");
     int max = keyboard.nextInt();
     int squareTotal = 0;
     int cubeTotal = 0;
     System.out.println("number\t\tsquare\t\tcube");
     for (int i = 1; i <= max; i++)
     {
         int square = (int)Math.pow(i, 2);
            squareTotal += square;
         int cube = (int)Math.pow(i, 3);
            cubeTotal += cube;
         System.out.println(i + "\t\t\t\t" + square + "\t\t\t\t" + cube + "\t\t\t\t");
     }
     System.out.println("Square total: " + squareTotal + "\nCube total: " + cubeTotal);
     */
     
     for (int hour = 0; hour <= 23; hour++)
     {    
         for (int min = 0; min <= 59; min++)
         {
            System.out.printf("\n%02d:%02d", hour, min);
         }
       System.out.print("\n");
     }
            
      
   }
}