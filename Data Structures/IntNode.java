public class IntNode 
{
   int data;
   IntNode link;
   IntNode head = null; 
   IntNode tptr; 
   
   public IntNode(int idata, IntNode ilink) //constructor 
   {
      data = idata;
      link = ilink;
   }
 
   public IntNode()
   {
      data = 0;
      link = null;
   }
   
   public void addFirstNode(int d)
   {
      head = new IntNode(d, null);
   }
   
   public void addToFront(int d)
   {
      head = new IntNode(d, head);
                            //The link for head
   }
   
   public void printList()
   {
      tptr = head; //start at the beginning of the list
      if (head == null)
         System.out.println("List empty");
      else 
      {
         while (tptr.link != null)
         {
            System.out.println(tptr.data); //Prints the data of the current node pointer is at
            tptr = tptr.link; //links to next node
         }
      }
      System.out.println(tptr.data);
   }//end 
   
   public void deleteFirstNode()
   {
      head = head.link; /*Assigns the node head is pointing as the new head,
                          in other words, deletes that original head/first node*/
   }                 
} 