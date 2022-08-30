//Write a program to check if a number is automorphic or not
import java.io.*;
class Automorphic
{
   public static void main(String args[])throws IOException
   {
      int n = 0, t = 0, z = 0, a = 0;
      double b = 0.0, c = 0.0;
      //initializing variables
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number to check if it is automorphic");
      n = Integer.parseInt(br.readLine());
      //taking input from user
      t = n * n;
      //squaring the number entered by user
      for(int i = n; i > 0; i = i/10)
      {
         a = i % 10;
         z++;
       }//end of for loop
      b = Math.pow(10,z);
      c = t % b;
      if(c == n)//checking if the number entered by user is automorphic or not
      {
         System.out.println(n + " is an Automorphic number");
      }
      else
      {
         System.out.println(n + " is NOT an Automorphic number");
      }//end of if-else statement
   }//end of main
}//end of class
/**VDT
   Variable    Datatype             Description
      n          int          to take input from user       
      t          int    to square the number entered by user       
      z          int        to count the number of digits       
      a          int             to exstract digits
      b          int              to store a value
      c          int             to exstract digits
      i          int        control variable to run loop           
 */