/*
import java.util.Scanner;
class Bank
{
  int amt,bal;
   int ch;
   char choice;
    
  Scanner ip;
  public Bank()
   {
    bal=5000;
    ip=new Scanner(System.in);
   }
   void deposit()
    {
      System.out.println("Enter the amount to be deposited");
      amt=ip.nextInt();
      if(amt>0)
       {
        System.out.println("amount deposited="+amt);
        bal=bal+amt;       
       System.out.println("total balance="+bal);
        
       }
        else
        {
         System.out.println("invalid amount");
        }
    }
    void withdrawal()
    {
      System.out.println("Enter the amount to be withdrawal");
      amt=ip.nextInt();
      if(amt>0 && amt<=bal)
       {
        System.out.println("amount withdrwal="+amt);
        bal=bal-amt;       
       System.out.println("total balance="+bal);
        
       }
        else
        {
         System.out.println("invalid amount");
        }
    }
    void show()
    {
       System.out.println("total balance="+bal);
        
     }
    void menu()
     {
       do
     {
     System.out.println("press 1 for deposit");
  System.out.println("press 2 for withdrawal");
 System.out.println("press 3 for show balance");    
  ch=ip.nextInt();
    switch(ch)
     {
       case 1: 
       deposit();
       break;
       case 2:
     withdrawal();
       break;
       case 3:
     show();    
     break;
     default:
      System.out.println("invalid choice");
    }
    System.out.println("press y to continue...");
    choice=ip.next().charAt(0);
    }while(choice=='y' || choice=='Y');
     }
     void login(String u,String p)
      {
         String user="admin";
         String pass="admin123";
         if(user.equals(u) && pass.equals(p))
          {
           menu();
          }
          else
          {
System.out.println("invalid username and password");
          }
    
      }
    public static void main(String arg[])
    {
     Bank ob=new Bank();
     Scanner ip1=new Scanner(System.in);
     String u;
     String p;
     System.out.println("Enter the username");
     u=ip1.nextLine();
     System.out.println("Enter the password");
     p=ip1.nextLine();
     ob.login(u,p);

    
    }
}
*/