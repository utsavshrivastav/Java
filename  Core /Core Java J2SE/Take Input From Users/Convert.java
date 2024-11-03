import java.util.Scanner;

public class Convert {
    Scanner ip = new Scanner(System.in);
    int f , c ;
    void set()
    {
      
      System.out.println("Enter the value of f");
      f = ip.nextInt();
    }
    void cal()
    {
        c = (f-32)*5%9;
        System.out.println("c = "+c);
    }
    public static void main(String arg[])
    {
        Convert ob = new Convert();
        ob.set();
        ob.cal();
    }
    
}
