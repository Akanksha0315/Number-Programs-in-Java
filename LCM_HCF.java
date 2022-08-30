//WAP to find the LCM and HCF of 2 numbers 
import java.io.*;
class LCM_HCF
{
    public static void main(String args[])throws IOException
    {
        int x = 0, y = 0, lcm = 0, hcf = 0, a = 0, b = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter 2 numbers");
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        for(int i = 1; i <= x; i++)
        {
            a = (x % i);
            b = (y % i);
            if(a == 0 && b == 0)
            {
                hcf = i;
            }
        }
        lcm = (x * y)/hcf;
        System.out.println("The LCM of " + x + " and " + y + " is " +lcm);
        System.out.println("The HCF of " + x + " and " + y + " is " +hcf);
    }
}

