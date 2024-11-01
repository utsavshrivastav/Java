import java.util.Scanner;
class InvalidAge extends Exception
{
   public InvalidAge(String msg)
     {
       super(msg);
     }
}
class Ag
{
  int age;
  Scanner ip=new Scanner (System.in);
  void set()throws InvalidAge
  {
  System.out.println("Enter the age");
  age=ip.nextInt();
  if(age<18)
   {
     throw new InvalidAge("Teri umar kam hai vote nahi de sakta ghar ja");
   }
   else
    {
     System.out.println("you can vote");
    }
    }
 public static void main(String arg[])
 {
   Ag ob=new Ag();
   try
   {
   
   ob.set();   
   }
   catch(Exception e)
    {
     e.printStackTrace();
    }
 }   
}
