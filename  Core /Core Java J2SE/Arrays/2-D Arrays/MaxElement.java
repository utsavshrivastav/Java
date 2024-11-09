/*  Finding Maximum Element in Array */
import java.util.Scanner;
public class MaxElement {
    int a[][] = new int[2][3];
    int i , j , max;
    Scanner ip = new Scanner(System.in);

    void set()
    {
        System.out.println("Enter the element");
        for(i = 0 ; i<=1 ; i++)
        {
            for(j = 0 ; j<=1 ; j++)
            {
                a[i][j] = ip.nextInt();
            }
       }
    }

    void cal(){
    for(i = 0 ; i<=1 ; i++)
    {
        for(j = 0 ; j<=1 ; j++)
        {
             if(a[i][j] > max)
             {
                max = a[i][j];
             }
        }
    }
    System.out.println("Max = +max");
}

public static void main(String arg[])
{
    MaxElement ob = new MaxElement();
    ob.set();
    ob.cal();
}
    
    
}
