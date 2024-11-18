

public class Demo {
    void show1 ()
    {
        System.out.println("Super ");
    }
    }

    class index extends Demo{
        void show()
        {
            System.out.println("Sub");
        }
}

class InnerDemo {
    public static void main(String arg[])
    {
        Demo ob = new index();
        ob.show1();
        index obj1 = new index();
        obj1.show();
    }
}

/*
Child Class Reference Cannot Store Object of Parent class  ( aise me ERROR generate hoga )
         ie .....
            index ob = new demo();
            ob.show();                  --> error dega aisa possible nhi hain . 

            

 */
