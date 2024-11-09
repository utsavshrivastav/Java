
import java.util.Scanner;
public class AddTwoMatrix {
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    int c[][] = new int[2][2];

    Scanner ip = new Scanner(System.in);
    int i , j ;

    void set()
    {
        System.out.println("Enter Element a and b ");
        for(i = 0 ; i < 1; i++)
        {
            for(j = 0 ; j < 1 ; j++)
            {
                a[i][j] = ip.nextInt();
                b[i][j] = ip.nextInt();
            }
        }
    }

    void cal()
    {
        for(i = 0 ; i < 1; i++)
        {
            for(j = 0 ; j < 1 ; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        System.out.println(c[i][j]);    
    }
}
    
    public static void main(String arg[])
    {
        AddTwoMatrix ob = new AddTwoMatrix();
        ob.set();
        ob.cal();
    }
}

