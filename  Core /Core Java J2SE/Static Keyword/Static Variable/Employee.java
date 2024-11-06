

/* Memory saving using Static - */
/* import java.util.Scanner;
public class Employee {
    String name ;
    int salary;
    static String cpname = "Google";
    public Employee(String name , int salary )
    {
        this.name = name ;
        this.salary = salary;
    }

    void show()
    {
        System.out.println("Employe name = "+name);
        System.out.println("Salary = "+salary);
        System.out.println("Company = "+cpname);
    }

    public static void main(String arg[])
    {
        String nm;
        int s1;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter name and salary");
        nm = ip.nextLine();
        s1 = ip.nextInt();

        Employee ob = new Employee(nm, s1);
        ob .show();

        System.out.println("Enter salary");
        ip.nextLine();  /*Buffer memory ie.. Exceptional handling issue */

        /*nm = ip.nextLine();
        s1 = ip.nextInt();

        Employee obj = new Employee(nm, s1);
        ob.show();
        obj.show();
    }
    }
    */
