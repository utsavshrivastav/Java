/*
class Mth1 extends Thread
{
  public Mth1(String name)
   {
     super(name);
   }
  public void run()
   {
    System.out.println("Thread Name="+Thread.currentThread().getName()+" Thread Id="+Thread.currentThread().getId()+" Thread Priority="+getPriority());
  
  }
   public static void main(String arg[]) 
    { Mth1 t=new Mth1("mehul");
      t.setPriority(2);
      t.start(); 
      Mth1 t1=new Mth1("sumit");
      t1.setPriority(10);
      t1.start(); 
    System.out.println("Thread Name="+Thread.currentThread().getName());  
    }
}
*/