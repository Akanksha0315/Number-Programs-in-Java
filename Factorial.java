//WAP to print the factorial of a number entered by user
import java.io.*; 
class Factorial
{
   public static void main(String args[])throws IOException
   {
      int x = 0, a = 1;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number");
      x = Integer.parseInt(br.readLine());
      for(int i = 1; i<= x; i++)
      {
         a = a * i; 
        }
      System.out.println("The factorial of " + x + " is " + a);
    }
}
 