//WAP to check if a number entered by user in a NIVEN number or not
import java.io.*;
class Niven
{
   public static void main(String args[])throws IOException
   {
      int x = 0, a = 0, sum = 0 ;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number");
      x = Integer.parseInt(br.readLine());
      for(int i = x; i > 0; i = i/10)
      {
         a = i % 10;
         sum = sum + a;
       }
      if((x % sum) == 0) 
      {
         System.out.println(x + " is a NIVEN number");
        }
      else
      {
         System.out.println(x + " is NOT a NIVEN number"); 
        }
    }
}
      