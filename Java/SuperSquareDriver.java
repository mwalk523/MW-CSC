public class SuperSquareDriver
{
   public static void main (String args[])
   {
   
      SuperSquare ss1 = new SuperSquare(15, "red");
         ss1.setSide(20);
         
      System.out.print("Side: " + ss1.side);
      
      Pyramid p1 = new Pyramid(17, "yellow");
      
      System.out.print("\nCount: " + ss1.getCount() + "\nArea: " + p1.getArea());
   
   }
   
}