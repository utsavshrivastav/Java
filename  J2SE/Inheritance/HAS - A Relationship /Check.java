
import java.util.Scanner;

class Evenodd {
    void check(int no)
    {
        if(no % 2 == 0)
        {
            System.out.println("Even no");
        }
        else{
            System.out.println("Odd no ");
        }
    }
}

 class Check {
    int no ; 
    Scanner ip ;
     public Check()
     {
        ip = new Scanner(System.in);
     }

    void set()
        {
            System.out.println("Enter the no");
            no = ip.nextInt();
            /*   Main Concept here to understand */
            Evenodd ob = new Evenodd();
            ob.check(10);
        }

    public static void main ()
         {
            Check ob = new Check ();
            ob.set();
         }
     }
    
