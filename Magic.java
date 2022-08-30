//Write a program to check whether a number entered by user is a magic number or not
import java.io.*;
class Magic
{
    public static void main(String args[])throws IOException
    {
        int x = 0, a = 0, s = 0;
        //initializing variables
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter a number");
        x = Integer.parseInt(br.readLine());
        //taking input from user
        int t = x;
        //storing number entered by user in a teporary variable
        while( t > 9 )
        {
            for(int i = t; i > 0; i = i/10)
            {
                a = i % 10 ;
                s = s + a ;
            }//end of for loop
            t = s;
        }//end of while loop
        if(s == 1)
        {
            System.out.println(x + " is a magic number");
        }
        else
        {
            System.out.println(x + " is NOT a magic number");
        }//end of if-else statement
    }//end of main
}//end of class

