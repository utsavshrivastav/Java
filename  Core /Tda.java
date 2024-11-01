import java.util.Scanner;
class Tda
{
  int a[][]=new int[2][2];
  int i,j;
  Scanner ip=new Scanner(System.in);
  void set()
   {
     System.out.println("Enter the array element");
     for(i=0;i<2;i++)
      {
       for(j=0;j<2;j++)
        {
         a[i][j]=ip.nextInt();
        }
      }
   }
   void cal()
    {
      System.out.println(" the array element");
     for(i=0;i<2;i++)
      {
       for(j=0;j<2;j++)
        {
         System.out.print(a[i][j]+"\t");
        }
        System.out.println();
      }
    }
    public static void main(String arg[]) 
    {
      Tda ob=new Tda();
      ob.set();
      ob.cal();    
    }
}
