/* here we import Ran.java file  */

import p.Ran;
import java.util.Scanner;

class Game  /* this class name */
{
    int no , i , n , Count = 3 ;
    Scanner ip ;
    public Game()   /* this is Constructor  */
    {
        ip = new Scanner(System.in);
    }

    void cal()  /* this is Method or say method name  */
     {
        Ran ob = new Ran();
        n = ob.generate(10);
        for(i = 1; i <=3; i++)
        {
            System.out.println("Enter 0 to 9");
            no = ip.nextInt();

            if(no < n)
            {
                System.out.println("You Guess Small no ");
            }
            else if (no>n)
            {
                System.out.println("You Guess Large no ");
            }
            else{
                System.out.println("Correct");
                break;
            }
            System.out.println("Chance left = "+ --count);
        }
     }
     System.out.println("No is = "+n);
}

public static void main(String arg[])   /* Method name  */
{
    Game ob = new Game();
    ob.cal();
}

