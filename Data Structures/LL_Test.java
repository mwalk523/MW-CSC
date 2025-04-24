import java.util.Scanner;
public class LL_Test
{
   String data;
   LL_Test link;
   LL_Test head = null;
   LL_Test tptr;

   Scanner keyboard = new Scanner (System.in);
   //Constructors 
   public LL_Test(String idata, LL_Test ilink)
   {
      data = idata;
      link = ilink;
   } 
   
   public LL_Test(String idata)
   {
      data = idata;
      link = null;
   }  
   
   public LL_Test()
   {
      data = "moo"; //remember char variables have one quotation mark
      link = null;
   }

//Add after
   public void addAfter (String search, String newData)
{
   tptr = head;
   if (head == null)
      System.out.println("List empty");
 
   if (head.link == null)
   {
      if (head.data == search)
         head.link = new LL_Test(newData, null);
   }
 
   while (tptr.link != null)
   {
      if (tptr.data == search)
      {
         tptr.link = new LL_Test(newData, tptr.link);
      } 
      tptr = tptr.link;
   }
}

//add to end 
   public void addEnd(String x)
{
   tptr = head;
   if (head == null)
      System.out.println("List Empty");
 
   else if(head.link == null)
   {
      head.link = new LL_Test(x, null);
   }
 
   else 
      {
          while (tptr != null)
          {
              tptr = tptr.link;
          }
          tptr.link = new LL_Test(x, null);
      }
}

//add first 
public void addFirstNode(String x)
{
	head = new LL_Test(x, null);
}

//delete longest
public void deleteLongestStr()
{
	tptr = head;
	String longest;
	if (head == null)
		System.out.println("Cannot delete. List empty.");
	
	else if (head.link == null)
		head = null; 

	else 
	{
		longest = tptr.data;
while (tptr.link != null)
{
	tptr = tptr.link;
	if ((tptr.data).length() > longest.length())
		longest = tptr.data;
}

while (tptr.link != null)
{
	if(tptr.link.data == longest)
		tptr.link = tptr.link.link;
	tptr =  tptr.link;
}	
	}
}

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

//5 Front Nodes
public void add5FrontNodes()
   {

      String selection;

      if (head == null)

         System.out.println("List empty. Add a head node first.");

      else 

      {
         for (int i = 0; i < 5; i++)
         {
            System.out.println("Please enter another character to be added to the list: ");
            selection = keyboard.nextLine();
            head = new LL_Test(selection, head);
         }

      }
   }
   
    //Add 8 character string
   public void storeStrings()
{
	String entry;
System.out.println("Enter a string to be added to list (must be 8 characters): ");
	entry = keyboard.nextLine();

	while (entry.length() != 8 )
	{
		System.out.println("Entry must be 8 characters. Try again: ");
		entry = keyboard.nextLine();
	}

	head = new LL_Test(entry, head);		
}

//Delete First 
   public void deleteFirstNode()
{
   if (head == null)
      System.out.println("Cannot delete, list empty");
 
   else if (head.link == null)
      head = null;
 
   else 
   {
      head = head.link;
   }
}



}