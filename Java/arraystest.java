import java.util.Scanner;
public class arraystest
{

   public static void main (String args[])
   {    Scanner keyboard = new Scanner (System.in);
        
        int test[] = {1, 2, 3}; //< Array Initialization, the series of values inside the braces is called an initialization list 
        System.out.print(test[1]); //subscripts always start at 0 and can only be positive
        System.out.print("\n");
        test[2] = 25;
        System.out.print(test[2]);   
        System.out.print("\n");
        //Lets you quickly create an array as well as define its entries (best for shorter arrays)
        
        //Creating an array 
        int[] range = new int[6]; //Creates the array with 6 entries, however, all entries are 0 until manually changed
        range[2] = 3; //Assigns 3 to the third entry (assignd to the subscript6 2)
        System.out.println(range[2]);
        System.out.println("Enter a number for the fourth entry: ");
        range[3] = keyboard.nextInt();
        System.out.printf("Fourth entry is %d", range[3]);
        //Lets you create an array of a certain length, and then assign values to each of its entries manually
        
        int[] range2 = new int[50]; 
        range2[0] = keyboard.nextInt();
        System.out.print(range2[0] + "\n");
        for (int i = 1; i <= 49; i++)
        {
            range2[i] = range2[i - 1] + 2;
            System.out.print(range2[i]);
            System.out.print("\n");
        }
        
        System.out.print("\n");
        
        System.out.println("Enter a number of entries: ");
        int entries = keyboard.nextInt();
        int[] entry = new int[entries];
        int index;
        for (index = 0; index < entries; index++);
        {
            System.out.print("Entry " + (index + 1) + ": ");
            entry[index] = keyboard.nextInt();
        }
        
        //When Java tries to execute an array with an invalid subscript, the program throws an exception and terminates (instead of an error message)    
        int[] exception = new int[3];
        System.out.println(exception[3]);
        
        //Multi-line array 
        int multi[][] = {
                      {2, 4, 5}, //0
                      {3, 10, 4}, //1
                      {15, 3, 20}, //2
                      {13, 22, 24},
                        };
        System.out.println(multi[1][1]); //First set of brackets is the line, second set is the entry within that line     
        
        
        int[] numbers, entries; //< with this version, both numbers and entries are int arrays 
        //int numbers[], entries; < with this version, only numbers[] is an int array, entries is just a normal int variable
          
        System.out.print("\n");
        int multi1 = multi[1][1] * 2; //you can use aritmetic operators with array entries just like a regular int, can also be used with boolean expressions and loops 
        System.out.println(multi1);   
        
        int size = multi.length; //how to pull the length (numbers of entries) from an array (This pulls the number of lines, not the number of individual numbers
        System.out.println("\n" + size);       
        
        range = new int[10]; //assigning range variable to a new array 
       
        //Array reference copies
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = array1; //Assigning two variables to the same array
        array1[1] = 10;
        array2[3] = 500;
        
        System.out.print("\n");
        for (int value : array1) //Enhanced for loop that will print out each entry in an array
        {
         System.out.print(value + " ");
        }
        
        System.out.print("\n");
        
         for (int value : array2)
        {
         System.out.print(value + " ");
        }
        //The print statements are the same because both array1 and array2 are assigned to the same array, rather than making two identical copies.
        //In other words, a change in array2 also changes array1, and vice versa
        */

        
        
        
              
   }
}