import java.util.Scanner;
class Bin
{
  int a[]=new int[5];
  int no,f,l,m,i;
  Scanner ip;
  public Bin()
   {
     ip=new Scanner(System.in);
     f=0;
     l=a.length-1;
     m=(f+l)/2; 
   }
   void set()
    {
      System.out.println("Enter the value of array");
      for(i=0;i<a.length;i++)
       {
         a[i]=ip.nextInt();
       }
       System.out.println("Enter the no to be search");
       no=ip.nextInt();
    }
    void cal()
     {
       while(f<=l)
        {
          if(a[m]<no)
           {
            f=m+1;
           }
           else if(a[m]==no)
            {
              System.out.println("no found");
              break;
            }
            else
            {
             l=m-1;
            }
            m=(f+l)/2;
        }
        if(f>l)
         {
          System.out.println("no not found");
         }
     }
    
 public static void main(String arg[])
  {
    Bin ob=new Bin();
    ob.set();
    ob.cal();
  }  
}
