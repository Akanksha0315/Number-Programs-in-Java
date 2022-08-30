//Program to check if number entered by user is a Keith Number or not
//series depends upon d digits used.. so 2 digits is Fibo, 3 is Tribo and so on
import java.io.*;
class Keith
{
   public static void main(String args[])throws IOException
   {
      int N = 0, a = 0, d = 0, j = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number");
      N = Integer.parseInt(br.readLine());
      for(int i = N; i > 0; i = i/10)
      {
         d++;
       }
      int A[] = new int [d];
      for(int i = N; i > 0; i = i/10)
      {
         a = i % 10;
         j = --d;
         A[j] = a;
        }
        
    }
}
        