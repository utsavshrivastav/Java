
import java.util.Scanner;
public class Salary {
    Scanner ip = new Scanner(System.in);
    double bs , gs , ta , da ;
    void set()
    {
        
        System.out.println("Enter base salary(bs)");
        bs = ip.nextDouble();
    }
    void show()
    {
        ta = (bs*10)/100;
        da = (bs*5)/100;
        gs = bs+ta+da;
        System.out.println("gross Salary = "+gs);
    }
    public static void main (String arg[])
    {
        Salary ob = new Salary();
        ob.set();
        ob.show();
   }
}
    

