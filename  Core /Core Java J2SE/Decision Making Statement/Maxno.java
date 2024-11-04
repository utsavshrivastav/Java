import java.util.Scanner;
public class Maxno {
    Scanner ip = new Scanner(System.in);
    int a , b , c ;
    
    void set()
    {
        System.out.println("Enter a ,b , c");
        a = ip.nextInt();
        b = ip.nextInt();
        c = ip.nextInt();
    }
    void check()
    {
        if((a>b)&&(a>c))
        {
            System.out.println("A is max");
        }
        else if((b>a)&&(b>c))
        {
            System.out.println("B is max");
        }
        else if((c>a)&&(c>b))
        {
            System.out.println("c is max");
        }
    }
    public static void main(String arg[])
    {
        Maxno ob = new Maxno();
        ob.set();
        ob.check();
    }
    
    
}
