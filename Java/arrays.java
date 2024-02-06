public class arrays
   {
      public static void main(String args[])
      {
      char c[] = {'A', 'B', 'C'};
      System.out.println(c[2]); //Remember the characters in the arrays are numbered starting from 0
      
      char[][] x = {
         {'A', 'B', 'C'}, //0
         {'D', 'E', 'F'}, //1
         {'X', 'Y', 'Z'}, //2
      };
      System.out.println(x[1][1]);
      
      for (int i = 0; i < x.length; i++) //c.length is 3
      {
         char cx[] = x[i];
         for (int j = 0; j < cx.length; j++)
         {
            System.out.print(cx[j]);
         }
         System.out.println();
      }  

      }
   }