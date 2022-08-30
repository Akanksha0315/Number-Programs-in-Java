import java.io.*;
class Special
{
    public static void main (String args[]) throws IOException
    {
        int x= 0, s = 0,p=1,sum=0,a=0;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        
        System.out.println("Enter a two digital number");
        x = Integer.parseInt(br.readLine());
        
        int A=2, B=9, C=3;
        
        //String str = new String("ICSE Examination 2013");
 
        //        System.out.println(Integer.parseInt(str.substring(str.length()-3))+str.length());
        
        for (int i=x; i>0; i=i/10)
        {
            a = i % 10;
            s =s +a ;
            p=p*a;
        }
        
        sum = s + p;
        
        if (sum == x )
        {
            System.out.println(x + " is a special 2 digit number ");
        }
        else
        {
               System.out.println(x + " is a NOT special 2 digit number ");
        }
    }
}
