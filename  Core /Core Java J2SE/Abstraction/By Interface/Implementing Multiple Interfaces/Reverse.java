
import java.util.Scanner;
public interface Reverse  /*  phela interface ka naam class file ke naam pr he hoga . */
{ 
    public abstract void set();
}

interface demo extends Reverse
 {
    public abstract void cal();
 }

class rev implements demo {
    int no , r , sum ;
    Scanner ip ;
    public rev()    /*  This is Constructor  */
    {
        sum = 0 ;
        ip = new Scanner(System.in);
    }
    @Override
    public void set()  /* this is method */
    {
        System.out.println("Enter no ");
        no = ip.nextInt();
    }
    @Override
    public void cal() /* This is also Method */
    {
        while(no>0)
        {
            r = no%10;
            sum = sum*10+r;
            no = no/10;
        }
        System.out.println(sum);
    }

    public static void main(String arg[]) /* This is main method  */
    {
        rev ob = new rev();
        ob.set();
        ob.cal();
    }
}
