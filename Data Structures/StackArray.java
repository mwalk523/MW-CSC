import java.util.Scanner;
//Stack 
public class StackArray
{
   Scanner keyboard = new Scanner (System.in);
   //Define Array for the original stack - size 10
   int[] origStack = new int[10];
   int top = 0; //this is the top of the original stack 

   //Define Array for the tempstack - size 10 
   int[] tempStack = new int[10];
   int ttop = 0; //this is the top of the temp stack
   
   //Create Store 5 Method 
   public void store5()
   {
      System.out.println("Enter a number to be stored: ");
         int choice;      
         
      for (int i = 0; i < 5; i++)
      {
         choice = keyboard.nextInt();
         origStack[i] = choice;
         top++; //top increments like count and will occupy the first (highest) empty node
      }  
   }
   
   //Create method to print AND store in tempStack in reverse order
   public void printStack()
   {
      for (int i = top - 1; i >= 0; i--)
      {
         tempStack[ttop] = origStack[i];
         ttop++;
         top--; 
      }
      top = 0;
      for (int i = ttop - 1; i >= 0; i--)
      {
         System.out.println(tempStack[i]); // Prints in the the order elements were added. If you put the print statement in the first
         origStack[top] = tempStack[i];    // for loop, it would print the elements in reverse order (because it starts from the top)
         top++;
      }
   }    
      
   //Create search method
   public boolean searchStack(int x)  
   {
      boolean found = false;
      
      for (int i = top - 1; i >= 0; i--) //START AT TOP, NOT 0. In a stack you only have access to the top; you can't just jump to 0. 
      {
         if (origStack[i] == x)
            found = true;
      } return found;
   }
}