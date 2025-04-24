public class Timing3
{
   public static final int NUM_TIMINGS = 5;
   public static void main (String args[])
   {
      for(int timing = 0; timing < NUM_TIMINGS; ++timing) 
        {
            int n = 0, i, j, sum;
            String type = "int";
            
            if (args.length > 0) 
            {
                try {
                    n = Integer.parseInt(args[0]);
                } catch (NumberFormatException e) {
                    System.err.println("Argument" + args[0] + " must be an integer.");
                    System.exit(1);
                }
            }   
   
            System.out.println("The type is " + type + " and the value of n is " + args[0]);
      
            long startTime = System.nanoTime();
         
            sum = 0; 
            for (i = 0; i < n; i++)
            {
               for(j = 0; j < i; j++)
               {
                  sum++;
               }
            }
      
      
            long endTime = System.nanoTime();
            
            long elapsedTime = endTime - startTime;
               
            // 1 second = 1000000000 (10^9) nanoseconds.
            System.out.println(elapsedTime + " nanoseconds or " + elapsedTime/(1000000000.0) + " seconds elapsed");
        }    
   }
}