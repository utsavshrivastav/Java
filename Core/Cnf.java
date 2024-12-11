class Cnf
{
  public static void main(String arg[])
    {
     try
     {
      Class.forName("Iae23");
      Iae ob=new Iae();
      ob.set();
      ob.deposit();
      }
      catch(Exception e)
       {
        System.out.println(e);
       }
   }
}
