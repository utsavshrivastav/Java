import java.util.Scanner;
class Max
{
  int a,b,c;
  Scanner ip=new Scanner(System.in);
  void set()
   {
     System.out.println("Enter the value of a,b,c");
     a=ip.nextInt();
     b=ip.nextInt();
     c=ip.nextInt();
   }
   void cal()
    {
      if(a>b && a>c)
       {
         System.out.println("a is max");
       }
       else if(b>a && b>c)
        {
         System.out.println("b is max");
        }
        else if(c>a && c>b)
        {
         System.out.println("c is max");
        }
        else
        {
         System.out.println("a b c are equal");
        }
    }
    public static void main(String arg[])
     {
      Max ob=new Max();
      ob.set();
      ob.cal();
     }
}
