package record;
import java.util.Scanner; 
public class insert{
Connect ob;
Scanner ip,ip1; 
String name,city,rollno;

    int age;
    public insert()
      {
        ob = new Connect();
        ob.connectdb();
        ip= new Scanner(System.in);
        ip1= new Scanner(System.in);
      }

      void insertrecord()
      {
       try
       {
     System.out.println("Enter the name");
     name=ip.nextLine();
     System.out.println(" enter the age ");
     age=ip1.nextInt();
     System.out.println(" enter the city");
     city=ip.nextLine();
     System.out.println("Enter the rollno");
     rollno=ip1.nextLine();
     
     String sql="insert into student value'"+name+"','"+age+"','"+city+"','"+rollno+"')";
     int result=ob.stmt.executeUpdate(sql);
     if (result>0)
     {
      System.out.println("record inserted");
     }
     else
     {
      System.out.println("error in insertion");
     }
       }
        catch(Exception e)
       {
	      e.printStackTrace();
       }
      }
}

