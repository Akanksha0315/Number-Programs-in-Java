//Prgram to check if a number entered by user is an increasing or not
//Increasing Number is when digits are in ascending order eg. 12234
import java.io.*;
class Increasing
{
   public static void main(String args[])throws IOException
   {
      int num = 0, count = 0, temp = 0, flag = 0;
      //initializing variables
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number to check if it is increasing or not");
      num = Integer.parseInt(br.readLine());
      //taking input from user
      for(int i = num; i > 0; i = i/10)
      {
         count++;
        }
      int A[] = new int [count];  
      temp = count;
      for(int i = num; i > 0; i = i/10)
      {
         A[count-1] = i % 10;
         count--;
        }      
      for(int j = 0; j < (temp-1); j++)
      {
         if(A[j] > A[j+1])
         {
            flag = 1;
            break;
          }
      }
      if(flag != 1)
      {
         System.out.println(num + " is an Increasing Number"); 
        }
      else
      {
          System.out.println(num + " is NOT an Increasing Number"); 
        }
    }
} 