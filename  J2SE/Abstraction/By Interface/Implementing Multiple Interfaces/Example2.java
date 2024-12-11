/*  Implementing multiple Interfaceses */
import java.util.Scanner;
@FunctionalInterface
 interface Example 
 {
   public abstract void set();
}

@FunctionalInterface
 interface Example1 
 {
    public abstract void febo();
}

class Feb implements Example , Example1
{
 int f1 , f2 , f , no , i ;
 Scanner ip ; 
  Feb() 
     {
        f1 = -1;
        f2 = 1 ;
        ip = new Scanner(System.in);
     }

     @Override
     public void set()
     {
        System.out.println("Enter no of terms ");
        no = ip.nextInt();
     }

     @Override
     public void febo()
     {
        for(i = 1; i <=no; i++)
        {
            f= f1+f2;
            System.out.println("febonanaic"+f);
            f1 = f2 ;
            f2 = f1 ;
        }
    }
        public static void main(String arg[])
        {
            Feb ob = new Feb();
            ob.set();
            ob.febo();
        }
     }
 
 