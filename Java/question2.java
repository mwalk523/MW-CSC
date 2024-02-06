//Find the smallest number in an array 
public class question2
{
   public static void main (String args[])
   {
   
      int[] test = {9, 3, 6, 8, 10, 12, 14, 16, 5, 20};
      int smallest = test[0];
      for (int i = 0; i < test.length; i++)
      {
         if (smallest < test[i])
         {
            continue;
         }
         
         else
         {
            smallest = test[i];
         }
      }
      System.out.println(smallest);
         
            
               
      
   
   }
}