//WAP to check whether a number entered by user is armstrong or not
import java.io.*;
class Armstrong
{
   public static void main(String args[])throws IOException
   {
       int x = 0, a = 0, sum = 0;
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       System.out.println("Enter a number");
       x = Integer.parseInt(br.readLine());
       for(int i = x; i > 0; i = i/10)
       {
          a = i % 10;
          sum = sum + (a * a * a);
        }
       if(sum == x)
       {
           System.out.println(x + " is Automorphic");
        }
       else
       {
           System.out.println(x + " is NOT Automorphic");
        }
    }
}
