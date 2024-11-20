import java.util.Scanner;
import java.util.InputMismatchException;
class Excp
{
  int a,b,c;
  Scanner ip;
  public Excp()
   {
    ip=new Scanner(System.in);
   }
   void div()
    {
      try
      {
       System.out.println("Enter the value of a,b");
       a=ip.nextInt();
       b=ip.nextInt();
       c=a/b;
       }
       catch(ArithmeticException e)
        {
         e.printStackTrace();
        }
        catch(InputMismatchException e)
        {
         e.printStackTrace();
        }
      System.out.println("div="+c);
    }
    public static void main(String arg[])
     {
      new Excp().div();
          
     }
}
