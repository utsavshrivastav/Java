import p.Ran;
import java.util.Scanner;
class Game
{
 int no,i,n,count=3;
 Scanner ip;
 public Game()
  {
   ip=new Scanner(System.in);
  }
 
  void cal()
   {
       Ran ob=new Ran();
       n=ob.genrate(10);
       for(i=1;i<=3;i++)
       {
     System.out.println("Enter the between 0 to 9");
    no=ip.nextInt();  
 
       if(no<n)
        {
         System.out.println("you guess small no");
        }
        else if(no>n)
        {
         System.out.println("you guess larger no");
        }
        else
         {
           System.out.println("correct");
           break;
         }
         System.out.println("chance left="+--count);
        }
        System.out.println("no is="+n);
   }
  
  public static void main(String arg[])
   {
     Game ob=new Game();
 
     ob.cal();    
      }
}
