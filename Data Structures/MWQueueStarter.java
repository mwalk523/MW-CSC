import java.util.Scanner;
public class MWQueueStarter 
{
   Scanner keyboard = new Scanner (System.in);
   
   //Class Definition 
   MWQueueStarter front = null;
   MWQueueStarter rear = null;
   int data;
   MWQueueStarter link = null;
   int numNodeFirst = 0;
   
   public MWQueueStarter(int d, MWQueueStarter l)
   {
      data = d;
      link = l;
   }
   
   public MWQueueStarter(int d)
   {
      data = d;
      link = null;
   }
   
   public MWQueueStarter()
   {
      data = 2;
      link = null;
   }
   
   //addFirst
   public void addFirst(int d)
   {
      rear = new MWQueueStarter(d, null);
      front = rear;
      numNodeFirst++;
   }
   
   //addFive
   public void addFive()
   {
      int tracker = 1;
      for (int i = 0; i < 5; i++)
      {
         System.out.println("Enter a value to be added (" + tracker + "/5): ");
            int selection = keyboard.nextInt();
            
         rear.link = new MWQueueStarter(selection);
         rear = rear.link;
         tracker++;
         numNodeFirst++;
      }
      
   }
   
   //removeFront
   public void removeFront()
   {
      front = front.link;
      numNodeFirst--;
   }
   
   
   //printQueue
   public void printQ()
   {
      for (int i = 0; i < numNodeFirst; i++)
      {
         System.out.print(front.data);
      
         rear.link = new MWQueueStarter(front.data);
         rear = rear.link;
         front = front.link;
         
         if (i != numNodeFirst - 1)
            System.out.print(", ");
      }
   }
   
   //searchQueue 
   public boolean searchQ(int x)
   {
      rear = front;
      boolean found = false;
      while (rear.link != null)
      {
         if (rear.data == x)
            found = true;
         
         rear = rear.link;
      }
      
      if (rear.data == x)
         found = true;
         
      return found;
   }
   

}