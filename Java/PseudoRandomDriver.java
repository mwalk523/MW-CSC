public class PseudoRandomDriver
{
   public static void main (String[] args)
   {
      //Initialize the Pseudo Random Number 
      long m;
      long a;
      long c; 
      long s;
      
      //Values for the small series of Pseudo Random Numbers
      m = 11;
      a = 7;
      c = 5;
      s = 3;
      
      //Initialize the Pseudo Random Number Generator 
      PseudoRandom.SetValues(m, a, c, s);
      
      System.out.println("Small series of Pseudo Random Numbers");
      
      for (int i = 0; i < 50; i++)
         System.out.print(PseudoRandom.NextRandom() + " ");
         
      //Values for the large series of Pseudo Random Numbers 
      m = 2147483647;
      a = 16807;
      c = 0;
      s = 3;
      
      //Initialize the Pseudo Random Number Generator
      PseudoRandom.SetValues(m, a, c, s);
      
      System.out.println("\n\nLarge series of Pseudo Random Numbers");
      for (int i = 0; i < 50; i++)
      {
         System.out.print(PseudoRandom.NextRandom() + " ");
         
         if (i % 5 == 0)
            System.out.print("\n");
      }
   }

}