import java.util.Scanner;
public class MW_ArrayStack
{
   Scanner keyboard = new Scanner(System.in);
   private int stackSize = 25;
   
   private int[] origStack = new int[stackSize];
   private int top = 0;
   
   private int[] tempStack = new int[stackSize];
   private int ttop = 0;
   
   //Store array
   public void storeStack()
   {
      int choice;
      int tracker = 1;
      for (int i = 0; i < 9; i++)
      {
         System.out.println("Enter an odd multiple of 3 (" + tracker + "/9):");
         choice = keyboard.nextInt();
         
         while (choice % 2 == 0 || choice % 3 != 0)
         {
            System.out.println("Invalid value. Try again: ");
            choice = keyboard.nextInt();
         }
         
         origStack[top] = choice;
         tracker++;
         top++;
      }
   }
   
   //Print array 
   public void printStack()
   {
      System.out.println("Printing stack (reverse order): ");
      for (int i = top-1; i >= 0; i--) 
      {
         System.out.print(origStack[i]);
         
         if (i > 0)
            System.out.print(", ");
      }
   }
   
   //Search array
   public boolean searchStack(int x)
   {
      boolean found = false;
      for (int i = top-1; i >= 0; i--)
      {
         if (origStack[i] == x)
            found = true;
      } return found;
   }
      
   //Number of occurences
   public int numOccr(int x)
   {
      int numOccr = 0;
      for (int i = top-1; i >= 0; i--)
      {
         if (origStack[i] == x)
            numOccr++;
      } return numOccr;
   }
   
   //Print all multiples of 9
   public void printAll()
   {
      int multiples = 0;
      System.out.println("\nPrintAll method- All multiples of 9: ");
      for (int i = top-1; i >= 0; i--)
      {
         if (origStack[i] % 9 == 0)
         {
            System.out.print(origStack[i] + " / ");  
            multiples++;
         }
      }
         if (multiples == 0)
            System.out.print("No multiples of 9");
   }
   
   //Increment all numbers in stack by 2 
   public void incrementStack()
   {
      for (int i = top-1; i >= 0; i--)
      {
         origStack[i] += 2;
      }
   }

   //Add 3 Numbers to the Stack 
   public void add3Num()
   {
      int tracker = 1;
      int choice;
      for (int i = 0; i < 3; i++)
      {
         System.out.println("Enter an additional element to add (" + tracker + "/3):");
            choice = keyboard.nextInt();
            
         origStack[top] = choice;
         tracker++;
         top++;
      }
   }
   
   //Delete 1 occurence of x
   public void deleteStackOne(int x)
   {
      ttop = 0;
      int deleted = 0;
      for (int i = top - 1; i >= 0; i--)  
      {
         if (origStack[i] == x && deleted < 1)
         {
            deleted++;
            continue;
         }
         tempStack[ttop] = origStack[i];
         ttop++;
         top--;
      } top = 0;
      
      for (int i = ttop - 1; i>= 0; i--)
      {
         origStack[top] = tempStack[i];
         top++; 
      }
   }
   
   //Delete all occurences of x
   public void deleteStackAll(int x)
   {
      ttop = 0;
      for (int i = top - 1; i >= 0; i--)
      {
         if (origStack[i] == x)
         {
            continue;
         }
         
         else 
         {
            tempStack[ttop] = origStack[i];
            ttop++;
            top--;
         }
      }
      top = 0; 
      for (int i = ttop - 1; i >= 0; i--)
      {
         origStack[top] = tempStack[i];
         top++;
      }  
   }
   
   //Add one element 
   public void addOneElement(int myNum)
   {
      origStack[top] = myNum;
      top++;
   }
   
   //Delete Last
   public void deleteLast()
   {
      ttop = 0;
      for (int i = top - 1; i >= 0; i--)
      {
         if (i == top - 1)
            continue;
         
         else
         {
            tempStack[ttop] = origStack[i];
            ttop++;
            top--;
         }
      }
      top = 0;
      for (int i = ttop - 1; i >= 0; i--) 
      {
         origStack[top] = tempStack[i];
         top++;
      }
   }
   
   //Find Smallest 
   public int findSmallest()
   {
      ttop = 0;
      int smallest = origStack[top - 1];
      for (int i = top - 1; i >= 0; i--)
      {
         if (origStack[i] < smallest)
         {
            smallest = origStack[i];
         } 
         
         tempStack[ttop] = origStack[i];
         ttop++;
         top--;
      }
      top = 0;
      
      for (int i = ttop - 1; i >= 0; i--) 
      {
         origStack[top] = tempStack[i];
         top++;
      } return smallest; 
   }
   
   //Find Largest 
   public int findLargest()
   {
      int largest = origStack[top - 1];
      for (int i = top - 1; i >= 0; i--)
      {
         if (origStack[i] > largest)
         {
            largest = origStack[i];
         } 
      } return largest;
   }
   
   //Find Average 
   public double findAverage()
   {
      int sum = 0;
      double average;
      for (int i = top - 1; i >= 0; i--)
      {
         sum += origStack[i];
      }
      average = sum / top;
      return average;
   }
   
   //Sum of multiples of x 
   public int sumNum(int x)
   {
      int sumNum = 0;
      for (int i = top - 1; i >= 0; i--)
      {
         if (origStack[i] % x == 0)
            sumNum += origStack[i];
      } return sumNum;
   }
   
   //Check if empty 
   public boolean stackEmpty()
   {
      boolean empty = false;
      if (top == 0)
         empty = true;
         
      return empty;
   }
   
   //Check if full
   public boolean stackFull()
   {
      boolean full = false;
      if (top == stackSize)
         full = true;
            
      return full;
   }

}