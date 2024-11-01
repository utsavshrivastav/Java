package com.myDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectivityCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "12345678");
		    Statement stmt=con.createStatement();
		    ResultSet rs = stmt.executeQuery("Select * from emp");
		    
		    while(rs.next())
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		    con.close();
		}
		  catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
