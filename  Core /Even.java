import java.util.Scanner;
class Even
{
  int no,ch;
  Scanner ip=new Scanner(System.in);
  void set()
   {
     System.out.println("Enter the no");
     no=ip.nextInt();
   }
   void cal()
   {
    ch=no%2;
    switch(ch)
     {
       case 0: 
        System.out.println("even");
        break;
       default:
        System.out.println("odd"); 
     }
   }
   public static void main(String arg[])
    {
      Even ob=new Even();
      ob.set();
      ob.cal();    
    }
}
