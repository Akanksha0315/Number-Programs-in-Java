import java.io.*;
class Perfect
{
    public static void main (String args[]) throws IOException
    {
        int n=0, s=0;
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader (isr);
        
        System.out.println("Enter a numbers");
        n=Integer.parseInt(br.readLine());
        
        for (int i=1; i < n; i++)
        {
            if ((n%i) == 0 )
            {
                s=s+i;
            }
        }
        if (s==n)
        {
            System.out.println(n + " is a perfect number");
        }
        else
        {
            System.out.println(n + " is not a perfect number");
        }
    }
}
