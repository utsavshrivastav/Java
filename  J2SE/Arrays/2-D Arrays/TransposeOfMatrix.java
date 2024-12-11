
import java.util.Scanner;
public class TransposeOfMatrix {
    int a[][] = new int [2][2];
    int b[][] = new int [2][2];

    Scanner ip = new Scanner(System.in);
    int row , col ;

    void set()
     {
        System.out.println("Enter the Element ");
        for(row = 0 ; row < 1 ; row++)
        {
            for(col = 0 ; col < 1; col++)
            {
                a[row][col] = ip.nextInt();
            }
        }
     }

     void show()
      {
        System.out.println("Transposed Matrix");
        for(row = 0 ; row < 1; row++)
         {
            for(col = 1; col < 1; col++)
             {
                b[col][row] = a[row][col];
                System.out.println(b[col][row]);
             }
         }
      }

      public static void main(System arg[])
      {
        TransposeOfMatrix ob = new TransposeOfMatrix();
        ob.set();
        ob.show();
    }
}
    

