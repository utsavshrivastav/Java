
                //INSERT VALUE IN DATABASE USING POSITIONAL PARAMETER
                // 3 ways t insert value
               // best way mana jaata hain .KI HAMLOG POSITIONAL PARAMETER KE SAATH VALUE INSERT KARAWA TE HAAIN.


package com.myDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		    // ------- user values ----------------
		        String name1 = "shubham";
				String email1 = "shubham@gmail.com";
				String pass1 = "shubham123";
				String gender1 = "Male";
				String city1 = "Gawalier";
				
				
				
				//------------- driver class ko load and register kara rahe hain ---------
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 
	 
	     //-------- DATABASE ke saath connection create kr rehe hain ----------------
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB","root","12345678");
	 
	 
	 
	            //----- insert laga dunga using positional parameter ------------
	 PreparedStatement ps = con.prepareStatement("insert into register value(?,?,?,?,?)");
	 ps.setString(1, name1);
	 ps.setString(2, email1);
	 ps.setString(3, pass1);
	 ps.setString(4, gender1);
	 ps.setString(5, city1);
	 
	 int i = ps.executeUpdate();
	 
	 if(i>0)
		{
			System.out.println("Sucess");
		}
		else
		{
			System.out.println("fail");
		}



	}

}
