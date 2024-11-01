class Vr
{
  int sum=0;
  void add(int ...x)
   {
     for(int i:x)
      {
        sum=sum+i;
      }
      System.out.println("sum="+sum);
      sum=0;
   }
   public static void main(String arg[])
    {
      Vr ob=new Vr();
      ob.add(2,3);
      ob.add(4,5,7);
    }
}
