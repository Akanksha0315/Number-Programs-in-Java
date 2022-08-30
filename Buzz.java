//WAP to check if a number entered by user is a BUZZ number
import java.io.*;
class Buzz
{
   public static void main(String args[])throws IOException
   {
      int x = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number");
      x = Integer.parseInt(br.readLine());
      if((x % 7) == 0 || (x % 10) == 7)
      {
         System.out.println(x + " is a BUZZ number");
      }
      else
      {
         System.out.println("It ain't BUZZ");
      }
   }
}
        