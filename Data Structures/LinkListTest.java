public class LinkListTest
{
   public static void main (String args[])
   {
      Miles_LinkList obj1 = new Miles_LinkList();
      
      //Checking for empty list
      obj1.printList();
      boolean empty = obj1.isEmpty();
      if (empty == true)
      {
         System.out.println("List empty");
      }
      
      else 
         System.out.println("List not empty");

      //Add First Node 
      obj1.addFirstNode('z');
      
      //Add to front 
      obj1.addToFront('y');
      obj1.addToFront('x');
      
      //Add to End
      obj1.addtoEnd('g');
      
      //Initial Print list 
      System.out.print("\n");
      System.out.println("Initial List: ");
      obj1.printList();
      
      //Checking if list empty 
      empty = obj1.isEmpty();
      if (empty == true)
      {
         System.out.println("List empty");
      }
      
      else 
         System.out.println("List not empty");
      
      System.out.print("\n"); 
      //Add 5 nodes  
      obj1.add5FrontNodes();
      System.out.println("List after adding 5 nodes: ");
      obj1.printList();
      
      //Instances of a node
      System.out.println("");
      int instances = obj1.numberOccur('a');
      System.out.println("Instances of character a: " + instances);
      System.out.print("\n");
      
      //Delete First Node 
      obj1.deleteFirstNode();
      System.out.println("List after first node was deleted: ");
      obj1.printList();
      
      //Search List
      System.out.print("\n");
      boolean found = obj1.searchList('z');
      if (found == true)
      {
         System.out.println("Character z found");
      }
      
      else 
         System.out.println("Character z not found");
        
      System.out.print("\n"); 
      
      //Largest and Smallest Character  
      System.out.println("Largest character: " + obj1.findLargest());
      System.out.println("Smallest character: " + obj1.findSmallest());
      
      System.out.print("\n");
      //Delete Last Node
      obj1.deleteLastNode();
      System.out.println("List after deleting last node: ");
      obj1.printList();
      
      //Print Range method
      System.out.print("\n");
      obj1.printRange();
   }
} 