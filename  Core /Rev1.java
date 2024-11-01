import java.util.Scanner;
interface I3
{
  public abstract void set();
}
interface I4 extends I3
{
 public abstract void cal();
}
class Rev1 implements I4
{
  int no,r,sum;
  Scanner ip;
  public Rev1()
  {
    sum=0;
    ip=new Scanner(System.in);
  }
  @Override
  public void set()
   {
    System.out.println("Enter the no");
    no=ip.nextInt();
   }  
   @Override
   public void cal()
    {
      while(no>0)
       {
        r=no%10;
        sum=sum*10+r;
        no=no/10;
       }
       System.out.println(sum);
    }
    public static void main(String arg[])
    {
      Rev1 ob=new Rev1();
      ob.set();
      ob.cal();    
    }
}
