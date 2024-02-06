//Print all the numbers in an array that are divisible by 3 
public class question3
{
   public static void main (String args[])
   {
   
   int[] test = {2, 3, 6, 9, 13, 15, 18, 23, 24, 27, 30, 37, 42, 45, 49, 51};
   
      for (int i = 0; i < test.length; i++)
      {
         int multiple = test[i];
         if (multiple % 3 == 0)
         {
            System.out.print(multiple);
            System.out.print("\n");
         }
      }
   
   }
}