import java.util.Scanner;
class Iae
{
  int bal,amt;
  Scanner ip;
  public Iae()
   {
     bal=5000;
     ip=new Scanner(System.in);
   }
   void set()
   {
     System.out.println("Enter the amount");
     amt=ip.nextInt();
   }
   void deposit()throws IllegalArgumentException
    {
      if(amt<0)
       {
         throw new IllegalArgumentException();
       }
       else
       {
         bal=bal+amt;
         System.out.println("total balance="+bal);
       }
    }
  /*  public static void main(String arg[])
     {
        Iae ob=new Iae();
        ob.set();
        try
        {
         ob.deposit();             
        }
        catch(IllegalArgumentException e)
        {
          e.printStackTrace();
        } 
        finally
        {
         System.out.println("ok bye");
        }
        
     }*/
}
