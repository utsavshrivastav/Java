
import java.util.Scanner;
public class Addmision 
{
    String c1; 
    String c2;
    String c3;

    public Addmision()
    {
        c1 = "B.tech";
        c2 = "BCA";
        c3 = "BBA";
    }
}

class Collage extends Addmision
{
    int cf1 , cf2 , cf3 ;

    public Collage()
    {
        cf1 = 180000;
        cf2 = 40000;
        cf3 = 50000;
    }
}

class Student extends Collage
{
    int per ; 
    Scanner ip ;

    public Student()
    {
        ip = new Scanner(System.in);
    }
    void set()
    {
        System.out.println("Enter percentage");
        per = ip.nextInt();
        varification();
    }
    void varification()
    {
        if(per >= 45 && per <= 60)
        {
            System.out.println(" You got the Course "+c3+" and fee is " +cf3);
        }
        else if(per >=60 && per <80)
        {
            System.out.println(" You Got Course "+c2+" and Fee is " +cf2);
        }
        else if (per >= 80 && per >= 10)
        {
            System.out.println(" You got Course "+c1+" and Fee is "+cf1);
        }
        else {
            System.out.println("You got Addmission");
        }
    }

        class show{
        public static void main(String arg[])
        {
            Student ob = new Student();
            ob.set();
        }
    }
}
   

