//program to check if 2 numbers entered by user are twin prime or not
import java.io.*;
class Twin_Prime
{
   public static void main (String args[])throws IOException
   {
      int num1 = 0, num2 = 0, count = 0, z = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter 2 numbers to check if they are twin prie numbers or not");
      num1 = Integer.parseInt(br.readLine());
      num2 = Integer.parseInt(br.readLine());
      if ( Math.abs(num1 - num2) == 2)
      {
         for(int i = 1; i < num1; i++)
         {
            if(num1 % i == 0)
            {
               count++; 
            }
            if(count == 2)
            {
               z++; 
            }
         }
         count = 0;
         for(int i = 1; i < num2; i++)
         {
            if(num2 % i == 0)
            {
               count++; 
            }
            if(count == 2)
            {
               z++; 
            }
         }
         if(z == 2)
         {
            System.out.println("Twin Prime"); 
            }
         else
         {
             System.out.println("Not twin prime numbers");
            }
      }
      else 
      {
         System.out.println("Not twin prime numbers");
      }
    }
}


