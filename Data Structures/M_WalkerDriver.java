import java.util.Scanner;
public class M_WalkerDriver
{
   public static void main (String args[])
   {
      Scanner keyboard = new Scanner (System.in);
      MWarray obj1 = new MWarray();
      
      //Store Array 
      obj1.store_arr();
      
      //Add 1 
      obj1.add1("magenta");
      
      //Search
      System.out.println("Enter a string to search for: ");
         String find = keyboard.nextLine();
      boolean result = obj1.search(find);
      if (result == true)
         System.out.println("String found");
      else
         System.out.println("String not found");
        
      //Add 4     
      obj1.add4();  
            
      obj1.printarr();    
      
      System.out.println("\nChoose a string to find number of occurences: ");
         String occurence = keyboard.nextLine();
         int instance = obj1.numOccr(occurence);
         System.out.println("# of occurences: " + instance);
      
      System.out.print("\n");      
      //Find Longest
      String longest = obj1.find_longest();
      System.out.println("Longest: " + longest);   
      
      //Find Shortest 
      String shortest = obj1.find_shortest();
      System.out.println("Shortest: " + shortest);
            
      System.out.print("\n");
      //Print All Over 6 
      obj1.allover6();
      
      //Delete Last
      obj1.del_last();
      
      System.out.print("\n");
      //Print Array List
      obj1.arrayList();
   }   
}