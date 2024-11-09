
import java.util.Scanner;
public class Linear {
    int a[] = new int[5];
    int i , no;
    Scanner ip ;
    
    public Linear()
    {
        ip = new Scanner(System.in);
    }

    void set()
    {
        System.out.println("Enter array Element");
        for(i = 0; i<=a.length; i++)
        {
            a[i] = ip.nextInt();
        }
        System.out.println("Enter the no to be Search");
        no = ip.nextInt();
    }

    void Show()
    {
        for(i = 0; i<a.length; i++)
         {
            if(a[i] == no);
         }
        System.out.println("no found");
        

        if(i == a.length)
          {
            System.out.println("not found");
          }
        }

    public static void main(String arg[])
    {
        Linear ob = new Linear();
        ob.set();
        ob.Show();
    }
    }


