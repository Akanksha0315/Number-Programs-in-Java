//Program to check if a number entered by user is Pronic or not
//Pronic number is a number which is a multiple of two consecutive numbers
import java.io.*;
class Pronic
{
   public static void main(String args[])throws IOException
   {
      int num = 0, sqrt = 0, prod = 0;
      //Initializing variable
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number to check if it is Pronic Number or not");
      num = Integer.parseInt(br.readLine());
      //taking input from user
      sqrt = (int)(Math.sqrt(num)); //finding the closes whole number square root of the number entered by user
      prod = sqrt * (sqrt+1);
      if(prod == num)
      {
         System.out.println(num + " is a Pronic number");
        }
      else
      {
         System.out.println(num + " is not a Pronic number"); 
        }
    }
}
