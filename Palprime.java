//WAP to check if a number is a palprime number or not
import java.io.*;
class Palprime 
{
   public static void main(String args[])throws IOException
   {
      int x = 0, a = 0,b = 0, d = 0, flag = 0;
      double c = 0.0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number to check if it is palprime or not");
      x = Integer.parseInt(br.readLine());
      for(int i = 1; i <= x; i++)
      {
         if((x % i) == 0)
         {
            a = a + 1;
          }
       }
      if(a == 2)
      {
          flag = flag + 1;
        }
      for(int i = x; i > 0; i = i/10)
      {
          d = d + 1;
        }
      for(int i = x; i > 0; i = i/10)
      {
         b = i % 10;
         c = (double)(c + (b * Math.pow(10,(d-1))));
         d = d - 1;
        }
      if(c == x)
      {
          flag = flag + 1;
        }
      if(flag == 2)
      {
          System.out.println(x + " is a Palprime number");
        }
      else
      {
          System.out.println(x + " is NOT a Palprime number");
        }
    }
}

          