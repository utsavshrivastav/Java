import java.util.Scanner;
class Rbi
{
  double si;
  Scanner ip;
  public Rbi()
   {
    ip=new Scanner(System.in);
   }
  double simple(double p,double r,double t)
   {
     si=(p*r*t)/100;
     return si;
   }
}
class Sbi extends Rbi
{
  double p1,r1,t1,s;
  
  public void getLoanSbi()
   {
     System.out.println("Enter the value of p,t");
     p1=ip.nextDouble();   
     r1=6;
     t1=ip.nextDouble();   
     s=simple(p1,r1,t1);
     System.out.println("Simple Interest="+s);
   }
}
class Hdfc extends Rbi
{
  double p1,r1,t1,s;
  
  public void getLoanHdfc()
   {
     System.out.println("Enter the value of p,t");
     p1=ip.nextDouble();   
     r1=9;
     t1=ip.nextDouble();   
     s=simple(p1,r1,t1);
     System.out.println("Simple Interest="+s);
   }
}
class Bl
{
 public static void main(String arg[])
  {
    Sbi ob=new Sbi();
    ob.getLoanSbi();
    Hdfc obj=new Hdfc();
    obj.getLoanHdfc();
  }
}
