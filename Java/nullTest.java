import java.util.Scanner;
public class nullTest
{
   public static void main(String args[])
   {Scanner keyboard = new Scanner (System.in);
   
      String name = keyboard.nextLine();
      if (name != null)
         System.out.println("no name");
      else
         System.out.println("name is: " + name);
   
   }
}