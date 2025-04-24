import java.util.Scanner;
public class MW_ArrayQuiz
{
      Scanner keyboard = new Scanner(System.in);
      public 
      /*
      1. 
         Properties of an Array 
         1. An array is a collection of like values that are indexed
         2. Can store any type of data 
         3. Can only hold one data type at a time
         4. An array has a fixed size, does not grow or shrink
         5. Sequential collection of elements 
         6. An array takes up one continuous block of memory
      */
      
      /*2. Define an array of size 15 that will hold integers. You must define SIZE
           as a final constant. You must SIZE when needed in your program. */
      
      final int SIZE = 15;
      int count = 0;
      int[] MW_array = new int[SIZE];
      
      //3. store array method, multiples of 6, 7 total numbers, 
      public void storearray()
      {
         int num;
         count = 0;
         while (count < 7)
         {
            System.out.println("Enter a multiple of 6: ");
            num = keyboard.nextInt();
            while (num % 6 != 0)
            {
               System.out.println("Number is not a multiple of 6. Try again: ");
               num = keyboard.nextInt();
            }
            MW_array[count] = num;
            count++;
         }
      }
      
      //4. findLessTen() method, find all less than 10
      public int findLessTen()
      {
         int elements = 0;
         for (int i = 0; i < count; i++)
         {
            if (MW_array[i] < 10)
            {
               elements++;
            } 
         } return elements;
      } 
      
      //5. add3elements method 
      public void add3Elements()
      {
         int num = 1;
         int entry;
         
         for (int i = 0; i < 3; i++)
         {
            if (count < SIZE)
            {
               System.out.println("Enter another integer to be added (" + num + "/3): ");
               entry = keyboard.nextInt();
               MW_array[count] = entry;
               count++;
               num++;
            }
               
            else if (count >= SIZE) 
            {
               System.out.println("Array at capacity.");
               break;
            }
         }
      } 
      
      //6. deleteLast method, delete last element added 
      public void deleteLast()
      {
         if (count != 0)
         {
            MW_array[count - 1] = 0;
            count--;
         }
         
         else
         {
            System.out.println("Array empty, cannot delete.");
         }
      }  
      
      //7. searchAtLeast4 method 
      public boolean searchAtLeast4(int x)
      {
         boolean found = false;
         int instance = 0;
         for (int i = 0; i < count; i++)
         {
              if (MW_array[i] == x)
              {
                  instance++;
              }
         }
         if (instance >= 4)
         {
            found = true;
         }
         return found; 
      }
      
      //8. Method to increment multiples of 3
      public int incrementMultiples3()
      {
         int increment = 0;
         for (int i = 0; i < count; i++)
         {
            if (MW_array[i] % 3 == 0)
            {
               MW_array[i]++;
               increment++;
            }
         }
         return increment;
      }  
  
      //9. Print Range Even method, all numbers between 15-46 and are even
      public void printRangeEven()
      {
         System.out.println("All even numbers between 15 and 46: ");
         System.out.print("\n");
         for (int i = 0; i < count; i++)
         {
            if (MW_array[i] >= 15 && MW_array[i] <= 46 && MW_array[i] % 2 == 0)
            {
               System.out.print(MW_array[i] + ", ");
            }
         }
      }
}