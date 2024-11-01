/*
import java.util.Scanner;
class Bnk extends Blogin
{
  int amt,bal,f,ch;
  int c=1;
  String u;
  String p;
  Scanner ip;
  public Bnk()
  {
    bal=5000;

    ip=new Scanner(System.in);
  }
  void deposit()
   {
     System.out.println("Enter the amount");
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
     System.out.println("Enter the amount");
     amt=ip.nextInt();
     if(amt>0 && amt<=bal)
     {
       System.out.println("amount withdrawal="+amt);
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
       Blogin ob=new Blogin();
       System.out.println("Enter the username and apassword");
       u=ip.nextLine();
       p=ip.nextLine();
       f=checklogin(u,p);
       if(f==1)
        {
          System.out.println("press 1 for deposit amount");
          System.out.println("press 2 for withdrawal amount");
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
        }  
        else
         {
          System.out.println("invalid password");
          
          if(c<3)
           {
            c++;
            menu();
            }
            else
            {
             System.out.println("lock id");
            }
         }    
    }

public static void main(String arg[])
 {
  Bnk ob=new Bnk();
  ob.menu();
 }
}
*/
