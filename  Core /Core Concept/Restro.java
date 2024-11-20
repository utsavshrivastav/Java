/*
import java.util.Scanner;
class Restro
{
  int r,q,bill;
  String dish;
  public void order()
   {
     r=250;
     q=1;
     bill=r*q;
     System.out.println("you order a one simple thali and bill amount="+bill);
   }
   public void order(int q)
   {
     r=250;
     this.q=q;
     bill=r*q;
     System.out.println("you order a "+q+" simple thali and bill amount="+bill);
   }
    public void order(String dish,int q)
   {
     if(dish.equals("pizza"))
       {
         r=550;
         bill=r*q;
         System.out.println("you order a dish= "+dish+" and bill amount="+bill);
       }
     else if(dish.equals("burger"))
      {
         r=50;
         bill=r*q;
         System.out.println("you order a dish= "+dish+" and bill amount="+bill);
      }  
   }
   public static void main(String arg[])
    {
      Restro ob=new Restro();
      int ch,q;
      String d;
      char choice;
      Scanner ip=new Scanner(System.in);
       do
       {
      System.out.println("press 1 to order 1 simple thali");
      System.out.println("press 2 to order multiple simple thali");      
      System.out.println("press 3 to order pizza or burger");
      ch=ip.nextInt();
       switch(ch)
        {
          case 1:
          ob.order();
          break;
          case 2:
           System.out.println("Enter the qnty of thali");
           q=ip.nextInt();
           ob.order(q);
           break;
           case 3:
  System.out.println("press 1 for pizza");          
  System.out.println("press 2 for burger");
  ch=ip.nextInt();
  System.out.println("Enter the qnty");
  q=ip.nextInt();
        if(ch==1)
         {
           ob.order("pizza",q);
         }
         else if(ch==2)
         {
          ob.order("burger",q);
         }
         else
         {
          System.out.println("invalid choice");
         }
          break;
          default:
    System.out.println("invalid choice");           
        }

        System.out.println("press y to continue...");
        choice=ip.next().charAt(0);
        }while(choice=='y' || choice=='Y');
    }
}
*/