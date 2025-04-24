import java.util.Scanner;
public class Fl_Walker
{
   String[] array = new String[15];
   Scanner keyboard = new Scanner(System.in);
   int count = 0;
   
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
         count++;
      }            
   }
   
   //Add one Element
   public void add1(int x)
   {
      arrayB[count] = x; //adds the element at the next available index (where count is
      count++;
   }
   
   
   int[] arrayB = new int[3]
   for (int i = 0; i < 3; i++)
   {
      arrayB[i] = i;
      System.out.println(arrayB[i])
   }

}