package com.elearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaffLogin {
	private String emailId;
	private String passwor;
	
	public StaffLogin (String email,String pass)
	{
	
		emailId = email;
		passwor = pass;
	}
	public void process() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		
			int f=1;
			String username="root";
		    String password ="1234";
		    String url="jdbc:mysql://localhost:3306/ELearn?autoReconnect=true&useSSL=false";
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
		   Connection con = DriverManager.getConnection(url,username,password);
		    Statement stmt = con.createStatement();
		    ResultSet res = stmt.executeQuery("select * FROM StaffDetails");
			while(res.next())
			{
			  if(emailId.equals(res.getString(2))  && passwor.equals(res.getString(3)))
			  {
				  f=0; break;
			  }
			}
		   con.close();
		   if(f==0)
		   {
	       System.out.println("Successfully login into your Account");
	      // System.out.println("1.profile   2.courses     3.Books      4.logout");
		   }
		}

}
