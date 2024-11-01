
                //SIMPLE INSERT DATA IN TABLE "REGIISTER"
                // 1 way to insert the value
package com.myDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData2 {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB","root","12345678");
		
		PreparedStatement ps = con.prepareStatement("Insert into register value('vikita','vikita@gamil.com','vikita123','Female','Bholaram')");
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
