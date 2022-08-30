import java.io.*;
class Patterns
{
    public static void main (String args[]) throws IOException
    {
    int ch=0;
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
    System.out.println("Enter 1 for Flyod's triangle and 2 for a pattern");
    
    ch=Integer.parseInt(br.readLine());
    
    switch (ch)
    {
        case 1: int n=0, sum=0;
        
        System.out.println("Enter a number");
        n=Integer.parseInt(br.readLine());
        
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
            {
                sum=sum+1;
                System.out.print(sum + " ");
            }
                System.out.println(" ");
            }
            break;

        case 2: String s =" ";
        
        System.out.println("Enter a word");
        
        s = br.readLine ();
        
        s = s.toUpperCase();
        int l = s.length();
        for (int i=0; i<l; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(s.charAt(j)+" ");
            }
                System.out.println(" ");
            }
        break;
        
        default: System.out.println("INVALID CHOICE");
        break;
    }
}
}
            
