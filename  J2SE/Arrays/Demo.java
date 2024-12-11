
import java.util.Scanner;
public class Demo {
    int a[] = new int[5];
    int i ;

    Scanner ip ;
    public Demo()
    {
       ip = new Scanner(System.in);
    }

    void set()
    {
        System.out.println("Enter Value in Arrays ");
        for(i = 0; i <= a.length; i++)
        {
           a[i] = ip.nextInt();
        }
    }

    void show()
    {
        for(i = 0; i<=a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
        public static void main(String arg[])
        {
            Demo ob = new Demo();
            ob.set();
            ob.show();
        }
    }
    
