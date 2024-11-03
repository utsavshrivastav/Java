import java.util.Scanner;


public class Area {
   Scanner ip = new Scanner(System.in);
   double l , b , a;
   void set()
   {
    ;
    System.out.println("Enter the value l and b");
    l = ip.nextDouble();
    b = ip.nextDouble();

   }
   void show()
   {
    a= l*b;
    System.out.println("area = "+a);
   }
   public static void main (String arg[])
   {
    Area ob = new Area();
    ob.set();
    ob.show();

   }
}
