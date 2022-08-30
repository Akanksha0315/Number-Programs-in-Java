//Prgram to check if a number entered by user is a bouncy number or not
//Bouncy Number is when digits are neither in ascending order nor in decending order eg. 969463
import java.io.*;
class Bouncy
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
         if(A[j] < A[j+1])
         {
            flag++;
            break;
          } 
      }
      for(int j = 0; j < (temp-1); j++)
      {
         if(A[j] > A[j+1])
         {
            flag++;
            break;
          } 
      }
      if(flag == 2)
      {
         System.out.println(num + " is a Bouncy Number"); 
        }
      else
      {
          System.out.println(num + " is NOT an Bouncy Number"); 
        }
    }
} 