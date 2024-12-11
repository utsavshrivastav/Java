import java.util.Scanner;
class Temp
 {
   double c,f;
   Scanner ip=new Scanner(System.in);
   void set()
    {
      System.out.println("Enter the value of f");
      f=ip.nextDouble();
    }
    void cal()
     {
       c=(f-32)*5/9;
       System.out.println("temp in c="+c);
     }
     public static void main(String arg[])
      {
        Temp ob=new Temp();
        ob.set();
        ob.cal();      
      }
 }
