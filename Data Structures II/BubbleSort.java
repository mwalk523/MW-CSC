public class BubbleSort
{
   //Double Linked List Pointers
   static NodeLL head;
   static NodeLL rear; 
   
   static NodeLL tptr;
   
   public static void main (String args[])
   {
      //An array of integers
      int[] array  = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
      
      //Create the Double Linked List 
      for (int i = 0; i < array.length; i++)
      {
         tptr = new NodeLL();
         tptr.data = array[i];
         
         //List is empty 
         if (head == null)
         {
            head = tptr;
            rear = head; 
         }
         
         //Insert at the rear
         else 
         {
            tptr.previous = rear;
            rear.next = tptr;
            rear = tptr;
         }
      }
      
      //Print the unsorted Double Linked List
      System.out.println("Unsorted Double Linked List");
      
      tptr = head;
      while (tptr != null)
      {
         System.out.print(tptr.data + " ");
         tptr = tptr.next;
      }
      System.out.println();
      
      //Bubble Sort 
      boolean done = false; 
      while (!done)
      {
         tptr = head;
         done = true;
         
         while (tptr != rear)
         {
            if (tptr.data > tptr.next.data)
            {
               //Swap Nodes
               NodeLL before, swap1, swap2, after;
               
               //Initialize all the pointers
               before = tptr.previous; //Node before the swap
               swap1 = tptr; //Nodes to swap 
               swap2 = tptr.next; //Nodes to swap 
               after = tptr.next.next; //Node after the swap 
               
               //Swap the Nodes
               if (before != null)
                  before.next = swap2;
               else   
                  head = swap2; //First node in the list
               
               swap1.next = after;
               swap1.previous = swap2;
               swap2.next = swap1;
               swap2.previous = before;
               
               if (after != null)
                  after.previous = swap1;
               else 
                  rear = swap1; //Last Node
                  
               done = false;
            }
            else
               tptr = tptr.next;
         }
      }
      
      //Print out the sorted Double Linked List
      System.out.println("\nSorted Double Linked List");
      
      NodeLL tptr = head;
      while (tptr != null)
      {
         System.out.print(tptr.data + " ");
         tptr = tptr.next;
      }
      System.out.println();
   }  
}