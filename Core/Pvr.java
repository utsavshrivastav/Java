/*
class Mba
{
  int ts=10;
  void bookT(int seats)
  {
 System.out.println("Welcome");
    synchronized(this)
    {
   
    if(ts>=seats)
     {
    
     System.out.println("Seat booked Successfully="+seats);
           ts=ts-seats;
     System.out.println("seats left="+ts);
     }
     else
     {
     System.out.println("cant booked seats because seat left="+ts);
      
     }
     }
     System.out.println("bye");
  }
}
class Pvr extends Thread
{
   static Mba b;
   int seats;
    @Override
   public void run()
    {
     b.bookT(seats);
    }    
    public static void main(String arg[])
     {
      b=new Mba();
      int seats;
      Pvr Lokesh=new Pvr();
      Lokesh.seats=7;
      Lokesh.start();
      Pvr Govind=new Pvr();
      Govind.seats=8;
      Govind.start();     
     }
}
*/