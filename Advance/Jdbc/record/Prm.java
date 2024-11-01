
/*package record;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Prm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String name,city,rollno;
			int age;
			Scanner ip=new Scanner(System.in);
			System.out.println("Enter the name");
			name=ip.nextLine();
			System.out.println("Enter the Age");
			age=ip.nextInt();	
			System.out.println("Enter the city");
			city=ip.nextLine();
			System.out.println("Enter the Rollno");
			rollno=ip.nextLine();
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j7","root","12345678");
			Statement stmt=con.createStatement();
			int result=stmt.executeUpdate('"+name+"','"+age+"','"+city+"','"+rollno+"');
			if(result>0)
			{
				System.out.println("record inserted");
			}
			else
			{
				System.out.println("Error in Inserted");
			}
			con.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
*/
