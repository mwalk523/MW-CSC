public class IntDriverList 
{
   public static void main (String args[])
   {
      IntNode list1 = new IntNode();
      System.out.println("First print list: ");
      list1.addFirstNode(35);
      list1.printList();
      
      System.out.println("Second print list:");
      list1.addToFront(23);
      list1.printList();
   }
   
   

}