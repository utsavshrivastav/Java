/* Program to find Sum of n - argument input by Command line argument */
public class sum {
    public static void main(String arg[])
    {
        int i ;
        int sum = 0;
        for(i = 0; i <= arg.length; i++)
        {
          sum = sum + Integer.parseInt(arg[i]);
        }
        System.out.println("Sum = "+sum);
    }
    }
