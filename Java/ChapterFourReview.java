import java.util.Random;

public class ChapterFourReview 
{
   public static void main(String args[])
   { 
   
      Random random = new Random();
      
      int randomIntOne = random.nextInt();
      
      if (randomIntOne > 5000)
      {
         System.out.println("That's a big int! " + randomIntOne);
         if (randomIntOne > 100000)
         {
            System.out.println("Actually, that's a huge int!");
         }
      }
            
      else 
      System.out.println("eh. " + randomIntOne);
      
      Random random2 = new Random();
      
       int dice = random2.nextInt(6) + 1;
      //the (6) limits the random range to a number between 0 and 5 (6 is exclusive). The + 1 shifts the range to the right be one so now the range is 1 to 6, like an actual die
      System.out.println("\nDice is " + dice);

      //String Comparison
      String s1 = "Hampton";
      String s2 = "Hampton";
      
      if (s1.equals(s2)) 
         System.out.println("The Hamptons Match!");
         //You have to use .equals for String comparison, but you should still use == for the primitive data types (numbers and char)
     
      boolean highScore;
      highScore = true;
      
   
   }
}