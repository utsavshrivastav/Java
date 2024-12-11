
@FunctionalInterface
public interface Example {
       public abstract void show();
       default void show1()
       {
        System.out.println("Welcome to indore");
       }
         }

    class Index implements Example 
    {
        @Override
        public void show()
        {
            System.out.println("Welcome India");
        }

        public static void main(String arg[])
        {
            Index ob = new Index();
            ob.show();
            ob.show1();
        }
    }    
