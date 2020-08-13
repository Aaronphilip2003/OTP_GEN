import java.io.*;
import java.util.*;
public class Main
 {
   public static void main(String[] args)throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String otp1="";
      char otp[]=generateOTP(10);
      String s1=String.valueOf(otp);
      System.out.println("OTP:"+s1);
      System.out.println("Enter the OTP");
      otp1=br.readLine();
      if(s1.equals(otp1))
      {
        System.out.println("Correct OTP");        
      }
      else
      System.out.println("ERROR! Generate another OTP");
   }

     static char[] generateOTP(int length)
      {
      String numbers = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
      Random random = new Random();
      char[] otp = new char[length];

      for(int i = 0; i< length ; i++) {
         otp[i] = numbers.charAt(random.nextInt(numbers.length()));
      }
      return otp;
   }
}