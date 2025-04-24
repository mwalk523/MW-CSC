import java.util.Scanner;
public class Miles_LinkList
{
   char data;
   Miles_LinkList link;
   Miles_LinkList head = null;
   Miles_LinkList tptr;

   Scanner keyboard = new Scanner (System.in);
   //Constructors 
   public Miles_LinkList(char idata, Miles_LinkList ilink)
   {
      data = idata;
      link = ilink;
   } 
   
   public Miles_LinkList(char idata)
   {
      data = idata;
      link = null;
   }  
   
   public Miles_LinkList()
   {
      data = 'm'; //remember char variables have one quotation mark
      link = null;
   }
   
   //Add First Node
   public void addFirstNode(char chardata)
   {
      head = new Miles_LinkList(chardata, null);
   }
   
   //Add to Front
   public void addToFront(char charData)
   {
      head = new Miles_LinkList(charData, head/*links to current head*/);
   }
   
   
   //Add to End
   public void addtoEnd(char data)
   {
      tptr = head;
      while (tptr.link != null)
      {
         tptr = tptr.link;
      }
      
      tptr.link = new Miles_LinkList(data, null);
   }
   
   //Print List
   public void printList()
   {
      tptr = head;
      if (tptr == null) //test if list is empty
         System.out.println("List empty");
      else 
      {
         while (tptr.link != null)
         {
            System.out.println(tptr.data); //Prints the data of the node tptr is currently pointing to
            tptr = tptr.link; //link to next node
         } System.out.println(tptr.data); //print the data of the final node (aka the one with "null" as the link)
      }
   }
   
   //Is Empty
   public boolean isEmpty()
   {
      boolean empty = false;
      if (head == null)
      {
         empty = true;
      } return empty;
     
   }
   
   //Add 5 Front Nodes 
   public void add5FrontNodes()
   {
      char selection;
      for (int i = 0; i < 5; i++)
      {
         System.out.println("Please enter another character to be added to the list: ");
         selection = keyboard.nextLine().charAt(0);
         head = new Miles_LinkList(selection, head/*links to current head*/ );
      }
   }  
   
   //Number of Occurences
   public int numberOccur(char x)
   {
      tptr = head; //start at the beginning of the list
      int instance = 0;
      while (tptr.link != null) //if tptr.link is null it means the list is empty
      {
         if (tptr.data == x)
         {
            instance++;  
         } tptr = tptr.link; //links to next node
      } return instance; 
   }
   
   //Delete First Node
   public void deleteFirstNode()
   {
      if (head == null)
         System.out.println("Cannot delete; List empty");
      else 
      {
         if (head.link == null)
            System.out.println("Cannot delete; only one node");
         else
            head = head.link;
      }
   }
   
   //Delete Last Node
   public void deleteLastNode()
   {
      if (head == null)
         System.out.println("Cannot delete last; list empty");
      
      else if (head.link == null)
         head = null; 
      
      else
      {
         tptr = head; 
         while (tptr.link.link != null)
         {
            tptr = tptr.link;
         }
         
         tptr.link = null;
      }
   }
   
   //Find Largest
   public char findLargest()
   {
      tptr = head;
      char largest = tptr.data;
      while (tptr.link != null)
      {
         tptr = tptr.link;
         if (tptr.data > largest)
            largest = tptr.data; 
          
      } return largest;
   }
   
   //Find Smallest
   public char findSmallest()
   {
      tptr = head;
      char smallest = tptr.data;
      while (tptr.link != null)
      {
         tptr = tptr.link;
         if (tptr.data < smallest)
            smallest = tptr.data;  
      } return smallest;
   }
   
   //Search List
   public boolean searchList(char x)
   {
      boolean found = false;
      tptr = head;//again, starts at beginning of node
      
      while (tptr.link != null)
      {
         if (tptr.data == x)
         {
            found = true;
         } tptr = tptr.link;
      } 
      
      if (tptr.data == x) //Make sure you test for that last node!!
         {
            found = true;
         }
   return found;
   }
    
   //Print Range
   public void printRange()
   {
      tptr = head;
      System.out.println("All elements between d-t: "); 
      while (tptr.link != null)
      {
         if (tptr.data >= 'd' && tptr.data <= 't')
         {
            System.out.println(tptr.data);
         }
         tptr = tptr.link;
      }
      
      if (tptr.data >= 'd' && tptr.data <= 't')
      {
         System.out.println(tptr.data);
      }

   }
  
   
}