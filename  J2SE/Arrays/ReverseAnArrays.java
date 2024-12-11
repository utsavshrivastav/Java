
import java.util.Scanner;
public class ReverseAnArrays {
        int a[] = new int[5];
        int i , temp , l ;
    
        Scanner ip;
        public ReverseAnArrays()
        {
           ip = new Scanner(System.in);
        }
    
        void set()
        {
            System.out.println(" Enter Value in Arrays ");
            for(i = 0; i <= a.length; i++)
            {
               a[i] = ip.nextInt();
            }
        }

        void show()
        {
        for(i = 0; i<=a.length; i++)
        {
            temp = a[i];
            a[i] = a[l-i-1];
            a[l-i-1] = temp;
        }
        }

        public static void main(String arg[])
        {
            ReverseAnArrays ob = new ReverseAnArrays();
            ob .set();
            ob.show();
        }
    
}
