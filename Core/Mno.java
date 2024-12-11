class Mno
{
   public static void main()
    {
     System.out.println("overloaded main method");
    }
    public static void main(int a)
     {
      System.out.println("value of a="+a);
     }
    public static void main(String arg[])
     {

      System.out.println("main method");
             main(5);
             main();
     }
}
