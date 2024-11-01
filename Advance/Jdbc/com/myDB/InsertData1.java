    // check connection established with database or not .

package com.myDB;

import java.sql.DriverManager;

public class InsertData1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB","root","12345678");
		System.out.println("sucess connection established");
		
		// agar KOI SPELLING MISTAKE HOGI TOH COMPLIATION KE WAKT ERROR SHOW HOGA IE.PROVIDE ACCESS DENIED 
		  // AISA MESSAGE PRINTK KR DEGA. IF ROOT-> ROT LIKH DIYA TOH YA GENEARALLY LOG  ROOT KE JAGH PE SYSTEM VI 
		// USE KRTE HAIN  AISE ME ERROR SHOW KR DNEGA 
		// AGR GALAT DATABSE KA NAAM ENTER KR DIYA CONNECTION KE WAKT FIR VI ERROR SHOW KR DNGA. 

	}

}
