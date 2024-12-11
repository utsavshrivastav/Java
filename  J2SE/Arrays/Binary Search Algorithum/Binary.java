
import java.util.Scanner;
public class Binary {
    int a[] = new int[5];
    int no , f , l , m , i ;

    Scanner ip ;

    public Binary(){
        ip = new Scanner(System.in);
        f = 0;
        l = a.length-1;
        m = (f+1)/2;
    }

    void set()
    {
        System.out.println("Enter the value of Array ");
        for(i = 0; i < a.length ; i++)
        {
            a[i] = ip.nextInt();
        }
        System.out.println("Enter no to be Searched");
        no = ip.nextInt();
        }

    void cal()
    {
        while (f <= l) {
            if(a[m] < no)
            {
               f = m + 1 ;
            }
            else if (a[m] == no) {
                System.out.println("Number Found");
                break;
                }
            else 
            {
                l = m-1;
            } 
            m = (f+1)/2;   
        }
        if(f > l)
        {
            System.out.println("Number not Found");
        }
    }
    public static void main(String arg[])
    {
        Binary ob = new Binary();
        ob.set();
        ob.cal();
    }
    }
