import java.util.Scanner;
import java.util.Random;

public class arrayPractice 
{
   public static void main(String args[])
   {Scanner keyboard = new Scanner(System.in);
    Random rng = new Random();
    
      //test 1 
      int[] test = new int[10];
         int guess = rng.nextInt(10) + 1;
         test[3] = guess; 
         
         System.out.println("Enter an integer for the second entry: ");
            test[1] = keyboard.nextInt();
            
         System.out.println(test[1] + "\n");
         System.out.println(test[3]);
      
      //test 2 
      int test2[][] = {
                     {1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9},
                     {10, 20, 30},
                    };
      int firstEntry = rng.nextInt(4);
      int secondEntry = rng.nextInt(3);              
      System.out.println("test2[" + firstEntry + "][" + secondEntry + "]: " + test2[firstEntry][secondEntry]);
      
      //test 3
      int[] test3 = new int[20];
      int sum = 0;
      
         System.out.println("\nEnter a value for the first entry: ");
            test3[0] =  keyboard.nextInt();
            sum += test3[0];
            
         for (int i = 1; i <= 19; i++)
         {
            test3[i] = test3[i - 1] + 1;
            System.out.print(test3[i] + "\n");  
            sum += test3[i];          
         }
         
         System.out.println("Sum: " + sum);
         
         System.out.println("\n");
         
         //test 4 
         int[] test4 = new int[50];
         int sum2 = 0;
         test4[0] = rng.nextInt(50) + 1;
         sum2 += test4[0];
         System.out.print(test4[0] + "\n");
         
         for (int i = 1; i <= 49; i++)
         {
            test4[i] = test4[i - 1] + 1;
            System.out.print(test4[i] + "\n");  
            sum2 += test4[i];          
         }
         
         System.out.println("Sum: " + sum);            
        
   }
}