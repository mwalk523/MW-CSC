import java.util.Scanner;
public class flagtest
{

   public static void main (String args[])
   {  Scanner keyboard = new Scanner (System.in);
   
      boolean highscore;
      System.out.println("Enter a score");
      int score = keyboard.nextInt();
      
      if (score > 95)
         highscore = true;
      
      if (highscore)
         System.out.println("high score");
         
      else 
         System.out.println("Not high score");    
      
   } 

} 
