
public class Demo {
    int a = 5 ; 

    void show()
    {
        System.out.println("Super");
    }
    }

    class Index extends Demo{
        /*@Override    -- Concept --> error if override nhi hue toh ...*/ 
        int a = 10 ;
        void show (){
            super.show();
            System.out.println("sub");
            System.out.println("a");
            System.out.println("Super.a");
        }
        public static void main(String arg[]){
            Index ob = new Index();
            ob.show();
        }
    } 
