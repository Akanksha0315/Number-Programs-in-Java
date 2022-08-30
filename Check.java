/* Program to check if a number entered is a Pronic Number or a Happy Number as per users choice
 * Pronic Number - A numbers formed by the multiplication of any two consecutive numbers 
   Eg. 2 X 3 = 6  
 * Happy Number - A number for whose recurrsive sum of squares of digits gives 1
   Eg. 19 
   1^2 + 9^2 = 82
   8^2 + 2^2 = 68
   6^2 + 8^2 = 100
   1^2 + 0^2 + 0^2 = 1  */
import java.io.*; //importing java.io package
class Check //start of class
{
   public static void main(String args[])throws IOException //start of main method
   {
      int num = 0, ch = 0;
      //initializing variables
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a Number");
      num = Integer.parseInt(br.readLine());
      System.out.println("Enter 1 to check if number is Pronic");
      System.out.println("Enter 2 to check if number is Happy");
      ch = Integer.parseInt(br.readLine());
      //taking input from user 
      switch(ch) //start of Switch Case
      {
         case 1:  int sqrt = 0, prod = 0;  //initializing variable
         sqrt = (int)(Math.sqrt(num)); 
         //finding the closes whole number square root of the number entered by user
         prod = sqrt * (sqrt+1); //calculating product of two required consecutive numbers 
         if(prod == num) //checking condition for Pronic Number
         {
            System.out.println(num + " is a Pronic Number");
           }
         else
         {
           System.out.println(num + " is NOT a Pronic Number"); 
           }//end of if-else statement 
         break; //end of case 1
         case 2: int temp = 0, digit = 0, sum = 0; //initializing variables 
         temp = num; //storing original value in another variable
         while(temp > 9) 
         {               
           for(int i = temp; i > 0; i = i / 10)
           {
              digit = i % 10; //extracting digit
              sum = sum + (digit * digit); //calculating sum of squares of digits
             }//end of for loop
           temp = sum;
           sum = 0;
         }//end of while loop
         if(temp == 1) //checking condition for Happy Number
         {
            System.out.println(num + " is a Happy Number");
          }
         else
         {
            System.out.println(num + " is NOT a Happy Number");
          }//end of if-else statement
         break; //end of case 2
         default: System.out.println("INVALID CHOICE"); //displaying possible output
         break; //end of default case
      }//end of switch case statement
   }//end of main method
}//end of class
/**VDT
 VARIABLE   DATATYPE                     DESCRIPTION
 
   num        int                  to take input from user 
    ch        int                  to take input from user
   sqrt       int       to find square root of number entered by user
   prod       int    to find product of two required consecutive numbers
   temp       int                    temporary variable
  digit       int              to extract digits from a number
   sum        int              to find sum of square of digits  
    i         int               control variable to run loop 
 */
