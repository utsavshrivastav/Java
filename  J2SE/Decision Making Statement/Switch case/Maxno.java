
import java.util.Scanner;
public class Maxno {
    int a , b , ch ;
    Scanner ip = new Scanner(System.in);
    
    void set()
    {
        System.out.println("Enter the value of a and b ");
        a = ip.nextInt();
        b = ip.nextInt();
    }
    void cal()
    {
        ch = a>b ? 1:0;
        switch (ch) {
            case 1:
            System.out.println("a is max");
              break;
            case 0:
            ch = a == b ? 1:0;
            
         switch (ch) {
            case 1:
            System.out.println(" a & b ");
            break;
            case 0:
            System.out.println("b is max");
            break;
         
            default:
                break;
         }   
        }
    }
    public static void main(String arg[])
    {
        Maxno ob = new Maxno();
        ob.set();
        ob.cal();
    }
}
