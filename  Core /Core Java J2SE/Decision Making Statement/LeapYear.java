import java.util.Scanner;
public class LeapYear {
    Scanner ip = new Scanner(System.in);
    int Y ;
    void set()
        {
          System.out.println("Enter year");
          Y = ip.nextInt();
        }
        void cal()
        {
            if((Y%4 == 0)&&(Y%400 ==0))
            {
                System.out.println("Leap year");
            }
            else{
                System.out.println("not a leap year");
            }
        }
        public static void main(String arg[])
        {
          LeapYear ob = new LeapYear();
          ob.set();
          ob.cal();
        }
    }
