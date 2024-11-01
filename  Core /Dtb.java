/*
import java.util.Scanner;
abstract class Bin1
{
  abstract void convert();
  Scanner ip;
  public Bin1()
   {
    ip=new Scanner(System.in);
   }
}
class Dtb extends Bin1
{
  int no,i;
  int a[]=new int[5];
  void set()
   {
     System.out.println("Enter the no");
     no=ip.nextInt();
   }
   @Override
   void convert()
    {
      for(i=0;no>0;i++)
       {
        a[i]=no%2;
        no=no/2;
       }
       for(i=i;i>=0;i--)
        {
         System.out.print(a[i]);
        }
    }
    public static void main(String arg[])
    {
      Dtb ob=new Dtb();
      ob.set();
      ob.convert();    
    }
}
*/