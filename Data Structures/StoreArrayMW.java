public class StoreArrayMW
{
   final int SIZE = 20; //Define Array Structure 
   int count = 0; //Count variable 
   int[] arrayMW = new int[SIZE];
   /* By defining these variables at the top they become "global parameters" 
   aka they don't have to be defined/called for every method. They are universal. */
   
   //Store Array Method
   public void StoreArray() //use void because you aren't returning anything
   {
      for (int i = 0; i < 10; i++)
      {
         arrayMW[i] = i;
         count++;
         
      }
   }
   
   //Print Array Method
   {
      for (int i = 0; i < count; i++)
      {
         System.out.print(array[i]);
         System.out.print("\n");
      }
   }
   
   //Search Array Method 
   public boolean search(x)
   {
      int element = -1;
      for (int i = 0; i < count; i++)
      {
         if (array[i] == x)
         {
            System.out.println("Found at " + x);
            element = x;
         }
         
      }
      
      if (element == -1)
         System.out.println("not found");
   }
   
}