//WAP to print all the factors of a number entered by the user
import java.io.*;
class Factors
{
   public static void main(String args[])throws IOException
   {
      int x = 0, a = 0;
      InputStreamReader  isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number");
      x = Integer.parseInt(br.readLine());
      for(int i = 1; i <= x; i++)
      {
         a = 0;
         a = x % i;
         if( a == 0)
         {
            System.out.print(i + " ");
            }
         }
      }
   }
              