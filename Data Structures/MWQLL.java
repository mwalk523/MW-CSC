import java.util.Scanner;
public class MWQLL
{
  Scanner keyboard = new Scanner(System.in);

  MWQLL front = null;
  MWQLL rear = null;
  int data;
  MWQLL link = null;
  int numNode = 0;

  //Constructors
  public MWQLL(int d, MWQLL l)
  {
     data = d;
     link = l;
  }
  
  public MWQLL(int d)
  {
     data = d;
     link = null;
  }
   
  public MWQLL()
  {
     data = 1;
     link = null;
  }
  
  //Add First Node (odd numbers)
  public void addFirstNode()
  {   
      int choice;
      
      System.out.println("Enter an odd number to be added as the first node: ");
      choice = keyboard.nextInt();
      
      while (choice % 2 == 0)
      {
         System.out.print("Entry is even. Enter a new value: ");
         choice = keyboard.nextInt();
      }
      
      rear = new MWQLL(choice, null);
      front = rear;
      System.out.println("Selection added");
      numNode++;
  }
  
  //storeQueue
  public void storeQueue()
  {
     if (front == null)
        System.out.println("List empty. Add first node before storing");
        
     else 
        {
            int tracker = 1;
            int choice;
         
            for (int i = 0; i < 5; i++)
            {
               System.out.println("Enter an odd number to add to the list(" + tracker + "/5): ");
               choice = keyboard.nextInt();
            
               while (choice % 2 == 0)
               {
                  System.out.println("Entry is even. Enter different value: ");
                  choice = keyboard.nextInt();
               }
      
               rear.link = new MWQLL(choice, null);
               rear = rear.link;
               System.out.println("Selection added");
               tracker++;
               numNode++;
            }
         } 
  }
  
  //addRear
  public void addRear()
  {
      if (front == null)
         System.out.println("List empty. Add first node before adding to rear");
         
      else
      {
         System.out.println("Enter a value to be aded to rear");
         int choice = keyboard.nextInt();
         
         while (choice % 2 == 0)
         {
            System.out.println("Entry must be odd, enter new value: ");
            choice = keyboard.nextInt();
         }
      
         rear.link = new MWQLL(choice, null);
         rear = rear.link; 
         numNode++;
         System.out.println("Entry stored");
      }
  }
  
  //removeFront
  public void removeFront()
  {
      if (front == null)
         System.out.println("Cannot remove, list empty");
         
      else if (front.link == null)
      {
         front = null;
         numNode = 0;
      }
         
      else 
      {
         front = front.link;
         numNode--;
         System.out.println("Front node removed.");
      }
         
  }
  
  //printQueLL
  public void printQueLL()
  {
      System.out.println("Printing queue: ");
      for (int i = 0; i < numNode; i++)
      {
         System.out.print(front.data + " ");
         rear.link = new MWQLL(front.data, null);
         rear = rear.link;
         front = front.link;
      }
  }
  
  //Search queue
  public boolean searchQue(int x)
  {
      boolean found = false;
      for (int i = 0; i < numNode; i++)
      {
         if (front.data == x)
            found = true;
         
         rear.link = new MWQLL(front.data, null);
         rear = rear.link;
         front = front.link;
      } return found;
  }
  
  //Remove 1 instance
  public void searchRemoveQue(int x)
  {
  
      if (front == null)
         System.out.println("List empty. Can't remove");
      
      else if (front.link == null)
      {
         if (front.data == x)
         {
            front = null;
            numNode--;
         }
      }
      
      else
      {
         int removed = 0; 
         for (int i = 0; i < numNode; i++)
         {
            if (front.data == x && removed < 1)
            {
               front = front.link;
               removed++;
            }
         
            else
            {
               rear.link = new MWQLL(front.data, null);
               rear = rear.link;
               front = front.link;
            }
         } 
         numNode -= removed;
      }
  }
  
  //Search and Remove All 
  public int searchRemoveAllQue(int x)
  {     
      int instanceRem = 0; 
      for (int i = 0; i < numNode; i++)
      {
         if (front.data == x)
         {
            front = front.link;
            instanceRem++;
         }
         
         else //So that only one of these loops is guaranteed to execute
         {
            rear.link = new MWQLL(front.data, null);
            rear = rear.link;
            front = front.link;
         }
      } 
      numNode -= instanceRem;
      return instanceRem;
  }
  
  //Find Largest
  public int findLargestQue()
  {
      int largest = front.data;
      
      for (int i = 0; i < numNode; i++)
      {
         if (front.data > largest)
            largest = front.data;
         
         rear.link = new MWQLL(front.data, null);
         rear = rear.link;
         front = front.link;
      } return largest;
  }
  
  //Find Smallest
  public int findSmallestQue()
  {
      int smallest = front.data;
      
      for (int i = 0; i < numNode; i++)
      {
         if (front.data < smallest)
            smallest = front.data;
         
         rear.link = new MWQLL(front.data, null);
         rear = rear.link;
         front = front.link;
      } return smallest;
  }
  
  //Number of Occurences 
  public int numOccrQue(int x)
  {
      int numOccr = 0;
      for (int i = 0; i < numNode; i++)
      {
         if (front.data == x)
            numOccr++;
            
         rear.link = new MWQLL(front.data, null);
         rear = rear.link;
         front = front.link;
      } return numOccr;
  }
}
