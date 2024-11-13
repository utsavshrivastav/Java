
import java.util.Scanner;
public class demo    /* Class name  */
{
    int a , b;
    Scanner ip ;

    public demo() /* Constructor */
    {
        ip = new Scanner(System.in); 
    }
    void set()  /* method 1st */
    {
     System.out.println("Enter tha value of a and b ");
     a = ip .nextInt();
     b = ip .nextInt();
    }
}
                   /*   ---------------------------------- */
    class index extends demo
    {
        int m;
        void Mean()  /* method 2nd */
        {
            m = (a+b)/2 ;
            System.out.println("Entered mean = "+m);
        }
    }

                       /*    ---------------------------------- */
    class Evenodd extends index
    {
       void cal()  /* method 3rd */
       {
        if(m % 2 == 0)
        {
           System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
       }
    }

                            /*  ----------------------------------- */
       class show
       {
         public static void main(String arg[])
         {
            Evenodd ob = new Evenodd();
            ob.set();
            ob.Mean();
            ob.cal();

         }
       }
   
