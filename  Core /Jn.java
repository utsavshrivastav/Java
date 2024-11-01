class Jn extends Thread
{
  static int total=0;
  int i;
  public void run()
   {
    for(i=10;i<=100;i=i+10)
     {
        total+=i;
         
     }
   }
   public static void main(String arg[])
   {
     Jn t=new Jn();
     t.start();
    try
    { 
     t.join();
     }
        catch(Exception e)
         {
           e.printStackTrace();
         }
  
   System.out.println(t.isAlive());  
     System.out.println("total="+total);
    
   }
}
