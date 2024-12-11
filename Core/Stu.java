import java.util.Scanner;
class Univ
{
  String c1;
  String c2;
  String c3;
  public Univ()
   {
    c1="Btech";
    c2="Bca";
    c3="Bba";
   }
}
class Clg extends Univ
{
  int cf1,cf2,cf3;
  public Clg()
   {
     cf1=180000;
     cf2=40000;
     cf3=50000;
   }
  
}
class Stu extends Clg
{
  int per;
  Scanner ip;
  public Stu()
   {
    ip=new Scanner(System.in);
   } 
   void set()
    {
      System.out.println("Enter the per");
      per=ip.nextInt();
      admission();
    }
    void admission()
    {
      if(per>=45 && per<60) 
       {
         System.out.println("you got the course "+c3+" and fees is "+cf3);
       }
       else if(per>=60 && per<80) 
       {
         System.out.println("you got the course "+c2+" and fees is "+cf2);
       }
       else if(per>=80 && per<100) 
       {
         System.out.println("you got the course "+c1+" and fees is "+cf1);
       }
       else
       {
        System.out.println("not get admission");
       }
    }
  public static void main(String arg[])
  {
    Stu ob=new Stu();
    ob.set(); 
  }  
}
