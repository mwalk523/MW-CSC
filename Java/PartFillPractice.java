import java.util.Scanner;
public class PartFillPractice
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner(System.in);
      int[] nums = new int[10];
      int index = 0;
      
      System.out.println("Enter a number or -1 to quit: ");
      int num = keyboard.nextInt();
      while (num != -1 && index <= 9)
      {
         nums[index] = num;
         index++;
         System.out.println("Enter a number or -1 to quit: ");
         num = keyboard.nextInt();
      }
      
      for (int val : nums)
      {
         System.out.print("\n");
         System.out.print(val);
      }
   }
}