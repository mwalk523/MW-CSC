public class PseudoRandom
{
   //Define Variables 
   private static long m; //Modulus 
   private static long a; //Multiplier 
   private static long c; //Increment 
   private static long s; //Seed
   
   private static long x0; //First number in the series 
   
   //Set the initial values for the variables 
   public static void SetValues(long mm, long aa, long cc, long ss)
   {
       m = mm;
       a = aa;
       c = cc;
       s = ss;
       
       x0 = s;
   }
   
   //Returns the next Pseudo Random Number 
   public static long NextRandom()
   {
      long x1;
      
      x1 = (a * x0 + c) % m;
      x0 = x1; //Next Number in series
      
      return x1;
   }
}