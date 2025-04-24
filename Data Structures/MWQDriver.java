import java.util.Scanner;
public class MWQDriver 
{
   public static void main (String args[])
   {
      Scanner keyboard = new Scanner(System.in);
      MWQLL queue1 = new MWQLL();
      System.out.print("\n");
      
      //test if empty
      queue1.storeQueue();
      queue1.removeFront();
      
      //Add First Node (odd)
      queue1.addFirstNode();
      
      //storeQueue 
      queue1.storeQueue();
      
      //Remove Front 
      queue1.removeFront();
      
      //printList
      System.out.print("\n");
      queue1.printQueLL();
      System.out.print("\n");
      
      //Search Queue
      System.out.println("\nEnter a value to search for: ");
         int target = keyboard.nextInt();
      
      if (queue1.searchQue(target))
         System.out.println("Value found");
         
      else 
         System.out.println("Value not found");  
         
      //Remove 1 Instance 
      System.out.print("\n");
      System.out.println("Enter a value to remove one instance of: ");
         int target2 =  keyboard.nextInt();
         
      queue1.searchRemoveQue(target2); 
      System.out.println("One instance of " + target2 + " removed.");
      
      System.out.print("\n");
      queue1.printQueLL();
      
      //Remove All Instances and Return How Many Removed
      System.out.print("\n");
      
      if (queue1.front == null)
         System.out.println("List empty. Cannot remove");
      
      else
      {   
         System.out.println("Enter a value to remove all instances of: ");
            int target3 = keyboard.nextInt();
         
         System.out.println(queue1.searchRemoveAllQue(target3) + " instance(s) of " + target3 + " removed");
      }
      
      System.out.print("\n");
      queue1.printQueLL();
      
      //Find Largest 
      System.out.print("\n");
      
      if (queue1.front == null)
         System.out.println("List Empty - no largest");
      else
      {   
         System.out.println("Largest variable: " + queue1.findLargestQue());
      }
      
      //Find Smallest
      System.out.print("\n");
      
      if (queue1.front == null)
         System.out.println("List Empty - no smallest");
      else
      {   
         System.out.println("Smallest variable: " + queue1.findSmallestQue());
      }
      
      //Number of Occurences 
      System.out.print("\n");
      
      System.out.println("Enter a value to find number of occurences for: ");
         int target4 = keyboard.nextInt();
         
      System.out.println("# of occurences for " + target4 + ": " + queue1.numOccrQue(target4));
   }
}