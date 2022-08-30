//WAP to check if a number entered by user is a happy number or not
import java.io.*;
class Happy
{
   public static void main(String args[])throws IOException
   {
      int n = 0, t = 0, a = 0, s = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number");
      n = Integer.parseInt(br.readLine());
      t = n;
      while(t > 9)
      {               
         for(int i = t; i > 0; i = i / 10)
         {
            a = i % 10;
            s = s + (a * a);
           }
         t = s;
         System.out.println(t);
         s = 0;
        }
      if(t == 1)
      {
         System.out.println(n + " is a happy number");
        }
      else
      {
          System.out.println(n + " is NOT a happy number");
        }
    }
}


           