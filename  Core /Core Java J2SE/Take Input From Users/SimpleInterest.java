import java.util.Scanner;
class SimpleInterest
{
  Scanner ip = new Scanner(System.in);
  double p , r , t , si ;
  void set()
  {
    
    System.out.println("Enter the value of p , r , t");
    p = ip.nextDouble();
    r = ip.nextDouble();
    t = ip.nextDouble();
 }
 void cal()
 {
    si = (p*r*t)/100;
    System.out.println("si = "+si);
 }
 public static void main (String arg[])
 {
    SimpleInterest ob = new SimpleInterest();
    ob.set();
    ob.cal();
 }
}
