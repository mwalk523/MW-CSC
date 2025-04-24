import java.util.Scanner;
import java.math.BigInteger;

public class RSADriver 
{
   //Main Program 
   public static void main (String args[])
   {
      //define variables 
      final boolean forever = true;
      char[] character;
      int encryptedCharacter[] = new int[100];
      
      //Set the Public Key 
      BigInteger z = new BigInteger("713");
      BigInteger n = new BigInteger("29");
      RSAclass.setPublicKey(z, n);
      
      //Set the Private Key 
      BigInteger s = new BigInteger("569");
      RSAclass.setPrivateKey(z, s);
      
      //RSA Algorithm variables 
      char a;
      int c;
      
      //creates a scanner object 
      Scanner keyboard = new Scanner(System.in);
      
      while(forever)
      {
         //Prompt user for message 
         System.out.println("\n\nEnter Message: ");
         
         //Read Message 
         String msg = keyboard.nextLine();
         character = msg.toCharArray();
         
         //Print the clear text message 
         System.out.println("Clear Text Message");
         for (int i = 0; i < msg.length(); i++)
            System.out.print(character[i]);
            
         //Print the ecrypted message 
         System.out.println("\nEncrypted Message");
         
         //Loop thru the entire message encrypting the characters 
         for (int i = 0; i < msg.length(); i++)
         {
            //Get next character 
            a = character[i];
            
            //Encrypt the character using RSA
            c = RSAclass.encrypt((int)a);
            
            //Print the encrypted character
            System.out.print(c + " ");
            
            //Save the encrypted character
            encryptedCharacter[i] = c; 
         }
      
         //Print the decrypted character 
         System.out.println("\nDecrypted Message");
      
         //Loop through entire message decrypting characters
         for (int i = 0; i < msg.length(); i++)
         {
            //Get the next encrypted character 
            c = encryptedCharacter[i];
            
            //Decrypt the character using RSA 
            a = (char)RSAclass.decrypt(c);
            
            //Print the decrypted character
            System.out.print(a);
         }
      }
   }
}