import java.util.*;
import java.util.concurrent.*;
public class StackPrac 
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner(System.in);
   
      Stack<Integer> intStack = new Stack<Integer>();
      System.out.println("Enter 6 integers and push to stack: ");     
      int[] intArray = new int[6];
      for (int i = 0; i < 6; i++)
      {
         intArray[i] = keyboard.nextInt();
      }
      
      for (int i : intArray)
      {
         intStack.push(i);
      }
           
      System.out.println("Top value: " + intStack.peek());
      System.out.println("Popping values: ");
      
      while (!intStack.empty())
      {
         System.out.println(intStack.pop());
      }
      
      
      ArrayBlockingQueue<Integer> intQueue = new ArrayBlockingQueue<Integer>(15);
      
      System.out.println("Enter an integer or -1 to stop: ");
      int num2 = keyboard.nextInt(); 
      while (num2 != -1)
      {
         intQueue.add(num2);
         System.out.println("Enter an integer or -1 to stop: ");
         num2 = keyboard.nextInt();
      }
      
      while (!intQueue.isEmpty())
      {
         System.out.println(intQueue.remove());
      }
      
      
      
   }
}