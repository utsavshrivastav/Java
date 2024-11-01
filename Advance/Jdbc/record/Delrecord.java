package record;
import java.util.Scanner;

public class Delrecord{
Connect ob;
Scanner ip;
String name, city, rollno;
int age;

public Delrecord()
   {
	ob=new Connect();
    ob.connectdb();
    ip=new Scanner(System.in);
   }

void deleteRecord()
   {
     try 
     {
      System.out.println("Enter the rollno");
      rollno=ip.nextLine();

      String sql="delete from student where rollno='"+rollno+"'";
      int result=ob.stmt.executeUpdate(sql);
      
      if(result>0)
      {
      System.out.println("record deleted");
      }
      else
      {
      System.out.println("error in deletion");
      }
     }
      catch(Exception e)
      {
      e.printStackTrace();
      }
     }
   }