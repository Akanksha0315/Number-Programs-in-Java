/*
 Program to check if a number entered by user is a Smith number or not

 Smith Number - A composite number for which, the sum of its digits is equal to the sum of its digits 
  in its prime factorization
  Eg.378 
 */
import java.io.*;
class Smith
{
   public static void main(String args[])throws IOException
   {
      int x = 0, a = 0, b = 0, z = 0, t = 0, s = 0, sum1 = 0, sum2 = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number");
      x = Integer.parseInt(br.readLine());
      for(int i = x; i > 0; i = i/10)
      {
         a = i % 10;
         sum1 = sum1 + a;
      }
      for(int i = 1; i < x; i++)
      {
         if((x % i) == 0)
         {
             z++;
         }
       }
      if(z > 2)
      {
         for(int i = 1; i < x; i++)
         {
            t = 0; 
            for(int j = 1; j < i; j++)
            {
               if((i % j) == 0)
               {
                  t++;
               }
            }
            if(t == 2)
            {
               if(t < 9)
               {
                  sum2 = sum2 + i;
               }
               if(t > 9)
               {
                  s = 0;
                  for(int k = x; k > 0; k++)
                  {
                     b = k % 10;
                     s = s + b;
                   }
                   sum2 = sum2 + s;
                }
            }
         }
         if(sum1 == sum2)
         {
            System.out.println( x + " is a Smith number");
         }
         else
         {
            System.out.println( x + " is NOT a Smith number");
         }
      }
      else
      {
         System.out.println( x + " is a Smith number");
      }
   }
}
         