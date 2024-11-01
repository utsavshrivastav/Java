
                     //INSERT DATA IN TABLE "REGISTER" USING TYPECAST METHOD
                     // 2 way to insert value

package com.myDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String name1 = "hitesh";
		String email1 = "hitesh@gmail.com";
		String pass1 = "kamal123";
		String gender1 = "Male";
		String city1 = "Mumbai";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB","root","12345678");
		
		PreparedStatement ps = con.prepareStatement("Insert into register value('"+name1+"','"+email1+"','"+pass1+"','"+gender1+"','"+city1+"')");
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
