import java.util.Scanner;
public class MWQueueDriver 
{
   public static void main (String args[])
   {
      Scanner keyboard = new Scanner(System.in);
      MWQueueStarter queue1 = new MWQueueStarter();
      
      //Add First 
      System.out.println("Enter a value for first element: ");
         int selection = keyboard.nextInt();
      
      queue1.addFirst(selection);
      
      //Add5 
      queue1.addFive();
      
      //Removing Front
      System.out.println("Removing front");
      queue1.removeFront();
      
      //Print Queue
      System.out.print("\n");
      System.out.println("Printing queue: ");
      queue1.printQ();
      
      //Search Queue
      System.out.print("\n\n"); 
      System.out.println("Enter a value that you wish to search for: ");
         int target = keyboard.nextInt();
         
      if (queue1.searchQ(target) == true)
         System.out.print("Target value found");
      else 
         System.out.print("Target value not found");
      
      
         
   }
}