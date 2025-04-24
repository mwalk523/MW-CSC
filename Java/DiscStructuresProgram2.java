public class DiscStructuresProgram2
{
   public static void main(String args[])
   {
      System.out.println("Resolution Proofs");
      System.out.print("\n");
      
      System.out.println("If (p | q) and (!p | r) are both true,"
      + "\nthen (q | r) is true.");
      
      System.out.print("\n");
      
      //Declaration of Variables
      boolean p, q, r;
         
      System.out.println("p" + "\t\t" + "q" + "\t\t" + "r" 
      + "\t\t\t" + "p | q" + "\t\t" + "!p | r" + "\t\t" + "q | r");
      
      System.out.print("\n");
      //Table Row for true true true 
      p = true; q = true; r = true;
      System.out.println(p + "\t" + q + "\t" + r + "\t\t"
      + (p | q) + "\t\t" + (!p | r) + "\t\t\t" + (q | r));
      
      //Table Row for true true false 
      p = true; q = true; r = false;
      System.out.println(p + "\t" + q + "\t" + r + "\t\t"
      + (p | q) + "\t\t" + (!p | r) + "\t\t\t" + (q | r));
      
      //Table Row for true false true
      p = true; q = false; r = true;
      System.out.println(p + "\t" + q + "\t" + r + "\t\t"
      + (p | q) + "\t\t" + (!p | r) + "\t\t\t" + (q | r));
      
      //Table Row for true false false 
      p = true; q = false; r = false;
      System.out.println(p + "\t" + q + "\t" + r + "\t\t"
      + (p | q) + "\t\t" + (!p | r) + "\t\t\t" + (q | r));
      
      //Table Row for false true true  
      p = false; q = true; r = true;
      System.out.println(p + "\t" + q + "\t" + r + "\t\t"
      + (p | q) + "\t\t" + (!p | r) + "\t\t\t" + (q | r));
      
      //Table Row for false true false
      p = false; q = true; r = false;
      System.out.println(p + "\t" + q + "\t" + r + "\t\t"
      + (p | q) + "\t\t" + (!p | r) + "\t\t\t" + (q | r));
      
      //Table Row for false false true 
      p = false; q = false; r = true;
      System.out.println(p + "\t" + q + "\t" + r + "\t\t"
      + (p | q) + "\t\t" + (!p | r) + "\t\t\t" + (q | r));
      
      //Table Row for false false false 
      p = false; q = false; r = false;
      System.out.println(p + "\t" + q + "\t" + r + "\t\t"
      + (p | q) + "\t\t" + (!p | r) + "\t\t\t" + (q | r));
      
   }
}