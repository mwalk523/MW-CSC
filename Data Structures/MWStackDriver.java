import java.util.Scanner;
public class MWStackDriver
{
   public static void main (String args[])
   {Scanner keyboard = new Scanner(System.in);
   
      MW_ArrayStack stack1 = new MW_ArrayStack();
      
      //Empty and Full check 
      if (stack1.stackEmpty())
         System.out.println("Stack empty- no elements added yet");
         
      if (stack1.stackFull() == false)
         System.out.println("Stack not full- no elements added yet");
      
      
      //Store method 
      System.out.print("\n");
      System.out.println("Store method- Storing 9 elements: \n");
      stack1.storeStack();
      System.out.print("\n");
      
      //Print method
      stack1.printStack();
      
      //Search method
      System.out.println("\n\nSearch method- Select a value to search for: ");
         int target = keyboard.nextInt(); 
      
      if (stack1.searchStack(target) == true)
         System.out.println("Value found");
      else
         System.out.println("Value not found");
         
      //Number of Occurence 
      System.out.println("\nNumber of occurences method- Enter a value to search for: ");
         int target2 = keyboard.nextInt();
      System.out.println("Number of occurences: " + stack1.numOccr(target2));   
      stack1.printStack();
      
      //Print all multiples of 9 
      System.out.print("\n");
      stack1.printAll();
      
      //Increment elements by 2 
      stack1.incrementStack();
      System.out.print("\n\n");
      System.out.println("incrementStack method- All elements incremented by 2.\n");
      stack1.printStack();    
      
      //Add 3 numbers
      if (stack1.stackFull())
         System.out.println("Cannot add- stack full");
         
      else    
      {
         System.out.print("\n\n");
         System.out.println("add3Num method- Adding 3 numbers");
         stack1.add3Num(); 
      }  
         stack1.printStack();
      
      //Deleting 1 occurence of x
      System.out.print("\n");
      
      if (stack1.stackEmpty())
         System.out.println("\nCannot delete- stack empty");
         
      else
      {   
         System.out.println("\ndeleteStackOne method- Enter an element to delete one occurence of: ");
            int selection = keyboard.nextInt();
         stack1.deleteStackOne(selection);
         stack1.printStack();
      }
      
      //Deleting all occurences of x 
      System.out.print("\n");
      
      if (stack1.stackEmpty())
         System.out.println("\nCannot delete- stack empty");
         
      else
      {   
         System.out.println("\ndeleteStackAll method- Enter an element to delete all occurence of: ");
            int selection = keyboard.nextInt();
         stack1.deleteStackAll(selection);
         stack1.printStack();  
      }
      
      //Adding 1 element
      System.out.print("\n");
      
      System.out.println("\naddOneElement method- Enter one element to add to the stack: ");
      int myNum = keyboard.nextInt();
            
      if (stack1.stackFull())
         System.out.println("Cannot add- stack full");
      else 
      {
         stack1.addOneElement(myNum);
      }
      stack1.printStack();
      
      //Deleting Last 
      System.out.print("\n");
      
      if (stack1.stackEmpty())
         System.out.println("Cannot delete last- stack empty");
      
      else
      {
         System.out.println("\nDeleting last element added");
         stack1.deleteLast();
      }
      stack1.printStack();
      System.out.print("\n");
      
      //Find Largest
      System.out.print("\n");
      System.out.println("Largest element: " + stack1.findLargest());
      
      //Find Smallest
      System.out.println("Smallest element: " + stack1.findSmallest()); 
      System.out.print("\n");
      stack1.printStack();
      
      //Find Average
      System.out.print("\n\n");
      System.out.println("Average: " + stack1.findAverage());
      System.out.print("\n");
      stack1.printStack();
      
      //Take the sum of all multiples of x
      System.out.print("\n\n");
      System.out.println("Enter a value to find the sum of all multiples of that value: ");
         int value = keyboard.nextInt();
      System.out.println("Sum of all multiples of " + value + ": " + stack1.sumNum(value));
      System.out.print("\n");
      stack1.printStack();
      
      //Check if stack is empty
      System.out.print("\n\n");
      if (stack1.stackEmpty())
         System.out.println("Stack empty");
      else 
         System.out.println("Stack not empty");
      
      //Check if stack is empty   
      if (stack1.stackFull())
         System.out.println("Stack full");
      else
         System.out.println("Stack not full");
   }
}