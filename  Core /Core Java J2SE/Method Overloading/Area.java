 /* Method Overloading or Function Overloading (both are same) */
public class Area {
    Double pi , r , l , b , a ;

    void area(double r)
    {
        a = pi*r*r;
        System.out.println(a);
    }
    public Area()
    {
        pi = 3.14 ;
    }

    void area(double l , double b)
    {
       a = l*b;
       System.out.println("a");
    }

    public static void main(String arg[])
    {
        Area ob = new Area();
        ob.area(5);
        ob.area(1, 2);
    }
    
    }
