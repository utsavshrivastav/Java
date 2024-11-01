class Mt implements Runnable
{
 int i;
  public void run()
   { 
      int no=5;
          for(i=1;i<=10;i++)
         {
          System.out.println(no+"X"+i+"="+(no*i));             
           try
           {
             Thread.sleep(2000);    
           }
           catch(Exception e)
           {
             e.printStackTrace();
           }
         } }
      
   public static void main(String arg[])
    {
     Mt ob=new Mt();
     Thread t=new Thread(ob);
     t.start();
    }
}
