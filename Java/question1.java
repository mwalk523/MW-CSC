//Write a progarm that prints out the first 10 numbers of the fibonacci sequence
public class question1
{  
   public static void main (String args[])
   {
      int x = 0;
      int y = 1;
      System.out.println(x);
      System.out.println(y);
      for (int i = 0; i <= 7; i++)
      {
        int fibonacci = x + y;
        System.out.println(fibonacci);
        x = y;
        y = fibonacci;
      }
   }
}