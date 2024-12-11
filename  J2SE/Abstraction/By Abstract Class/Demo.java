
  abstract class Demo{
    abstract void set();
    void show()
    {
         System.out.println(" Welcome to Abstract Class ");
    }
}

class index extends Demo{
    @Override
    void set()
    {
        System.out.println("Ok jaaanu ");
    }

    
public static void main(String arg[])
{
   index ob = new index();
   ob.show();
   ob.set();
}
}
