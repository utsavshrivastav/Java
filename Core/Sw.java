import java.util.Scanner;
class Sw
{
  int a,b,ch;
  Scanner ip=new Scanner(System.in);
  void set()
   {
     System.out.println("Enter the value of a,b");
     a=ip.nextInt();
     b=ip.nextInt();
   }
   void cal()
   {
   ch=a>b?1:0;
    switch(ch)
    {
      case 1:
       System.out.println("a is max");
       break;
      case 0:
       ch=a==b?1:0;
       
       switch(ch)
        {
          case 1:
           System.out.println("a and b are equal");
           break;
          case 0:
           System.out.println("b is max"); 
        } 
    }
    }
    public static void main(String arg[])
     {
      Sw ob=new Sw();
      ob.set();
      ob.cal();
     }
}
