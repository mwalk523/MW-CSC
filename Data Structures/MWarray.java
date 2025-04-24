import java.util.Scanner;
public class MWarray
{
   String[] array;
   
   Scanner keyboard = new Scanner(System.in);
   int count = 0;
   
   //constructor
   public MWarray()
   {
      array = new String[15];
   }
  
   //Store method 
   public void store_arr()
   {
      String entry;
      for (int i = 0; i < 6; i++)
      {
         System.out.println("Enter a string (5 to 10 characters)");
         entry =  keyboard.nextLine();
         
         while (entry.length() < 5 || entry.length() > 10)
         {
            System.out.println("Entry outside of bounds. Try again: ");
            entry = keyboard.nextLine();
         }
         array[i] = entry;
         System.out.println("Storing: " + array[i]);
         count++;
      } 
      System.out.println("\ncount: " + count + "\n");           
   }
   
   //Print Array Elements
   public void printarr()
   {
      System.out.println("Printing array: ");
      for (int i = 0; i < count; i++)
      {
         System.out.println(array[i]);
      }
   }
  
   //Add one Element
   public void add1(String str)
   {
      if (count != 15)
      {
         array[count] = str; //adds the element at the next available index (where count is)
         count++;
      }
      
      else
      {
         System.out.println("Array limit reached");
      }
   }
   
   //Search Array 
   public boolean search(String str)
   {
      boolean found = false;
      for (int i = 0; i < count; i++)
      {
         if (array[i].equalsIgnoreCase(str))
         {
            found = true;       
         } 
      }
      return found;
   } 
   
   //Add 4 elements 
   public void add4()
   {  
      int num = 1;
      
      String str;
      for (int i = 0; i < 4; i++)
      {
         if (count != 15)
         {
            System.out.println("Select another element to be added (" + num + "/4): ");
            str = keyboard.nextLine(); //adds the element at the next available index (where count is)
               while (str.length() < 5 || str.length() > 10)
               {
                  System.out.println("Entry outside of bounds. Try again: ");
                  str = keyboard.nextLine();
               }
            num++;
            array[count] = str;
            count++;
         }
         
         else
         {
            System.out.println("Array limit reached");
         }
      }      
   }
   
   //Find Longest 
   public String find_longest()
   {
      String longest = array[0];
      
      for (int i = 0; i < count; i++)
      {
         if (array[i].length() > longest.length())
            longest = array[i];
      }
      return longest;
   }
   
   //Find Shortest
   public String find_shortest()
   {
      String shortest = array[0];
      
      for (int i = 0; i < count; i++)
      {
         if (array[i].length() < shortest.length())
            shortest = array[i];
      }
      return shortest;
   }
   
   //Print all over 6 characters
   public void allover6()
   {
      System.out.println("All entries over 6 characters:");
      for (int i = 0; i < count; i++)
      {
         if (array[i].length() > 6)
         {
            System.out.println(array[i]);
         }
      }
   }
   
   //Number of occurences of x 
   public int numOccr(String occr)
   {
      int instance = 0; 
      
      for (int i = 0; i < count; i++)
      {
         if (array[i].equalsIgnoreCase(occr))
         {
            instance++;
         }
      } return instance;
   }
   
   
   
   //Delete last element
   public void del_last()
   {
      if (count != 0)
      {
         array[count - 1] = "";
         count -= 1;
      }
      
      else 
         System.out.println("Array empty. Cannot delete.");
   }
   
   
   //Print Array List 
   public void arrayList()
   {
      System.out.println("Printing array list: ");
      
      String[] arraylist = new String[count];
      for (int i = 0; i < count; i++)
      {
         arraylist[i] = array[i];
      }
      
      for (String s : arraylist)
      {
         System.out.print(s + " ");
      }
   }
   
}