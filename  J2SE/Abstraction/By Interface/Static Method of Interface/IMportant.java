 /*  Interface par Private usski Default se Accesss karenge */

public interface IMportant {
   private void show()
   {
    System.out.println("Welcome");
   }
   default void show1()
   {
    show();
    System.out.println("Indore");
   }
}

class Message implements IMportant
{
    public static void main (String arg[])
    {
        Message ob = new Message();
        ob.show1();
    }
}
