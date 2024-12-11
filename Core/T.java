interface I5
{
  private void show()
   {
    System.out.println("welcome to india");
   }
   default void show1()
    {
     show();
     System.out.println("welcome to indore");
    }
}
class T implements I5
{
 public static void main(String arg[])
  {
    T ob=new T();
    ob.show1();
  }
}
