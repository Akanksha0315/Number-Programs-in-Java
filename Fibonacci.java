//WAP to display Fibonacci numbers
import java.io.* ; 
class Fibonacci 
{
    public static void main (String args []) throws IOException 
    {
        int a = 0 , b = 1 , c = 0, n = 0 ;
        InputStreamReader isr = new InputStreamReader (System.in) ; 
        BufferedReader br = new BufferedReader (isr) ;
        System.out.println ("Enter a number") ;
        n = Integer.parseInt (br.readLine()) ; 
        for (int i = 0 ; i <= n; i++)
        { 
            c = a+b ;
            a = b;
            b = c;
            System.out.println (a + "") ; 
        }
    }//end of main 
}// emd of class
        
