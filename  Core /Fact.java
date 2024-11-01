class Fact
{
  public static void main(String arg[])
   {
     int f=1,i,no;
     no=Integer.parseInt(arg[0]);
      for(i=1;i<=no;i++)
        {
          f=f*i;
        }
        System.out.println("fact="+f);
   }
}
