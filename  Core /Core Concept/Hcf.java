/*
import java.util.Scanner;
class Hcf
{
  int no1,no2,i,min,hcf;
  public Hcf()
    {
      no1=1;
      no2=1;
    }
  public Hcf(int no1,int no2)
   {
     this.no1=no1;
     this.no2=no2;
   }  
   void cal()
    {
      min=no1<no2?no1:no2;
      for(i=1;i<=min;i++)
       {
         if(no1%i==0 && no2%i==0)
          {
            hcf=i;
          } 
       }
       System.out.println("hcf="+hcf);
    }
    public static void main(String arg[])
     {
       Hcf ob=new Hcf();
        ob.cal();
        int no1,no2;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the value of no1 and no2");
        no1=ip.nextInt();
        no2=ip.nextInt();
        
       Hcf obj=new Hcf(no1,no2);
       obj.cal();     
     }
}
*/