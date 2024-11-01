import java.util.Scanner;
class Array
{
  int a[]=new int[5];
  int i,no;
  Scanner ip;
  public Array()
   {
     ip=new Scanner(System.in);
    
   }
   void set()
    {
      System.out.println("Enter the array element");
      for(i=0;i<a.length;i++)
       {
         a[i]=ip.nextInt();
       }
       System.out.println("Enter the no to be search");
       no=ip.nextInt();
    }
    void show()
     {
       for(i=0;i<a.length;i++)
        {
         if(a[i]==no)
          {
            System.out.println("no found");
            break;
          }
        }
        if(i==a.length)
         {
 System.out.println("no notfound");                            
         }
     }
     public static void main(String arg[])
      {
        Array ob=new Array();
        ob.set();
        ob.show();       
      }
}
