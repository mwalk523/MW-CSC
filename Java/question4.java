//Print true if a string is the same forwards and backwards
import java.util.Scanner;
public class question4
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner (System.in);
   
      System.out.print("Enter a word, any word!");
         String pal = keyboard.nextLine();
         String palindrome = "";
      for (int i = pal.length() - 1; i >= 0; i--)
      {
         palindrome += pal.charAt(i);
      }
      
      if (palindrome.compareToIgnoreCase(pal) == 0)
      {
         System.out.println("true");
      }
         
      else
      { 
         System.out.println("false");   
      }
   }
}