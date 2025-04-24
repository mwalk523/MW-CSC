import java.math.BigInteger;

public class RSAclass
{
   //Public Key Variables
   private static BigInteger Z;
   private static BigInteger N;
   
   //Private Key Variable 
   private static BigInteger S;
   
   //Set Public Keys 
   public static void setPublicKey(BigInteger z, BigInteger n)
   {
      Z = z;
      N = n;
   }
   
   //Set Private Keys
   public static void setPrivateKey(BigInteger z, BigInteger s)
   {
      Z = z;
      S = s;
   }
   
   //Returns encrypted character
   public static int encrypt (int a)
   {
      //RSA Algorithm Public-Key 
      BigInteger x;
      
      x = BigInteger.valueOf(a);
      x = x.modPow(N, Z);
      return x.intValue();
   }
   
   //Returns decrypted character 
   public static int decrypt(int c)
   {
      //RSA ALgorithm Private Key 
      BigInteger x;
      
      x = BigInteger.valueOf(c);
      x = x.modPow(S, Z);
      return x.intValue();
   }
}