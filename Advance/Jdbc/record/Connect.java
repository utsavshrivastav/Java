package record;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


 public class Connect {

 Connection con;
 Statement stmt;

 public void connectdb()
 {
 try
   {
     Class.forName("com.mysql.cj.jdbc.Driver");
     con =DriverManager.getConnection("jdbc:mysql://localhost:3306/j7", "root", "root");
     stmt=con.createStatement();
   }
 
   catch(Exception e)
 
    {
    e.printStackTrace();
    }
 }
}
