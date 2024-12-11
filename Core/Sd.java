class Sd extends Thread
{
  public void run()
   {
   System.out.println("daemon thread="+isDaemon());
   }
   public static void main(String arg[])
   {
     Sd t=new Sd();
     t.setDaemon(true);
     t.start();
     System.out.println("welcome to java");
   }
}
