//WAP to find the GCD and the HCF of 2 numbers entered by user
import java.io.*;
class GCD
{
   public static void main(String args[])throws IOException
   {
      int x = 0, y = 0, gcd = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter 2 numbers");
      x = Integer.parseInt(br.readLine());
      y = Integer.parseInt(br.readLine());
      for(int i = 1; i <= x; i++)
      {
         if((x % i) == 0  && (y % i) == 0)
         { 
             gcd = i;
            }
        }
      System.out.println("The GCD of the 2 numbers is " + gcd);
    }
}
            