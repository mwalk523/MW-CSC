/*
Author: Miles Walker
Date: 9/8/23 
Instructor: Dr.B and Mr. McAdams 
Program Name: WalkerM_HW1_Ch2_Part1
Description: CSC 151 Assignment 
*/

public class WalkerM_HW1_Ch2_Part1

{
   public static void main (String args[])
      {  
      
        //9/8/23
        System.out.println("My name is Miles");
        
        //Date: 9/8/23

        System.out.println("Name: Miles");
        System.out.println("Street Address: 100 Cemetery Road");
        System.out.println("Hampton, VA 23669");
        System.out.println("Phone #: (804) 217-1204");
        
        char letter = 'A';
        System.out.println("letter is " + letter);
        
        int v1 = 5 + 19 % 3 - 1;
        int v2 = 14 / (11 - 4);
        int v3 = 9 + 12 * (8 - 3);
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        
        double x = 48;
        int v4 = (int)x + 7;
        
        System.out.println(v4);
      
        short basePay = 500, bonus = 1000;
        int totalPay;
        totalPay = basePay + bonus;
        
        
        String value = "number";
        int length = "number".length();
        
        System.out.println(length);
        
        String upper = "number".toUpperCase();
        System.out.println(upper);
        
        String city;
        city = "San Fran";
        char oneChar = city.charAt(0);
        System.out.println(oneChar);
        String upperCity = city.toUpperCase();
        System.out.println(upperCity);
        int stringLength = city.length();
        System.out.println(stringLength);

         
       // A single comment looks like this // 
       
      /* A multiline comment 
     looks like this */
     
      /** A documentation comment 
       would look like this */

      int amount;
      amount = 72;

      System.out.print("Be careful\n");
      System.out.print("This might/n be a trick ");
      System.out.println("question.");
      
      String name = "Miles Walker";
      int age = 19; 
      double annualPay = 300000.0;
      
      System.out.printf("My name is " + name + ", my age is %d and I hope to earn %.1f per year.", age, annualPay);
      
      String firstName = "Miles", middleName = "Isaiah", lastName = "Walker";
      char firstInitial = 'M', middleInitial = 'I', lastInitial = 'W';
      
      System.out.println("\nFirst name: " + firstName + 
      "\nMiddle name: " + middleName +
      "\nLast name: " + lastName +
      "\nFirst initial: " + firstInitial +
      "\nMiddle initial: " + middleInitial +
      "\nLast initial: " + lastInitial);
      
      short f = 4; 
      int g = 16;
      g = f;
      
      
      }
      
}
