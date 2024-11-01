class Npe
{
  String s=null;
  int l;
  void cal()
   {
     try
     {
       l=s.length();
     }
     catch(Exception e)
     {
      e.printStackTrace();
     }
   }
   void show()
   {
    System.out.println("length of string="+l);
   }
   public static void main(String arg[])
   {
    Npe ob=new Npe();
    ob.cal();
    ob.show();
   }
}
