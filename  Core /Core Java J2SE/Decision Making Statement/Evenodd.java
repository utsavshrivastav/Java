import java.util.Scanner;

public class Evenodd {
    Scanner ip = new Scanner(System.in);
    int no ;
    void set()
    {
        System.out.println("Enter no");
        no = ip.nextInt();
    }
    void check()
    {
      if(no%2 == 0)
      {
         System.out.println("even");
      }
      else{
        System.out.println("odd");
      }
    }
    public static void main(String arg[])
    {
        Evenodd ob = new Evenodd();
        ob.set();
        ob.check();
    }
    }
