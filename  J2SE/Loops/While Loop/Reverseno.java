import java.util.Scanner;
public class Reverseno {
    Scanner ip = new Scanner(System.in);
    int no , r , sum = 0;
    void set()
    {
        System.out.println("Enter no ");
        no = ip.nextInt();
    }
    void show()
    {
        while (no>0) {
            no = no%10;
            sum = sum*10+r;
            no = no/10;
        }
    }
    public static void main(String arg[])
    {
        Reverseno ob = new Reverseno();
        ob.set();
        ob.show();
    }

    
    
}
