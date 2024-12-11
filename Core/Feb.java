import java.util.Scanner;
class Feb implements I1,I2
{
  int f1,f2,f,no,i;
  Scanner ip;
  Feb()
   {
    f1=-1;
    f2=1;
    ip=new Scanner(System.in);
   }
  @Override
  public void set()
   {
     System.out.println("Enter the no of terms");
     no=ip.nextInt();
   }
   @Override
   public void febo()
   {
    for(i=1;i<=no;i++)
     {
       f=f1+f2;
       if(i<no)
        {
         System.out.print(f+",");
        } 
        else
        {
        System.out.print(f+"\n");
        }
       f1=f2;
       f2=f;
     }
   }
   public static void main(String arg[])
    {
      Feb ob=new Feb();
      ob.set();
      ob.febo();    
    }
}
