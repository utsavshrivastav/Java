/*
 If you pass An Argument not According to Specific Condition then Illegal Argument Exception will be Thrown
 Caller method me throw hota he - handle bhi wohi hoga .
 */
import java.util.Scanner;
public class Illegal {
    int bal , amt;
    Scanner ip ;
    public Illegal()
    {
        bal = 5000;
        ip = new Scanner(System.in);
    }

     void set(){
        System.out.println("Enter Amount");
        amt = ip.nextInt();
     }

     void deposit() throws IllegalArgumentException
      {
        if(amt<0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            bal = bal + amt ;
            System.out.println("Total bal"+bal);
        }

      }

      public static void main(String arg[])
      {
        Illegal ob = new Illegal();
        ob.set();
        try{
            ob.deposit();
        }
        catch(IllegalArgumentException e)
        {
            e.printStackTrace();
        }
      }
    
}
