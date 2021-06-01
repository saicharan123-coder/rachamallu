package com.elearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StaffSignUp {
	private String userName;
	private String emailId;
	private String passwor;
	private String conPassword;
	public StaffSignUp (String name,String email,String pass,String conPass)
	{
		userName = name;
		emailId = email;
		passwor = pass;
		conPassword =conPass;  
	}
	public void process() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		if(passwor.equals(conPassword))
		{
			String username="root";
		    String password ="1234";
		   String url="jdbc:mysql://localhost:3306/ELearn?autoReconnect=true&useSSL=false";
		   Class.forName("com.mysql.jdbc.Driver").newInstance();
		   Connection con = DriverManager.getConnection(url,username,password);
		   String query = " insert into StaffDetails(userName,emailId,password)"
			        + " values (?, ?, ?)";
		   PreparedStatement stmt = con.prepareStatement(query);
		   stmt.setString(1,userName);
		   stmt.setString(2,emailId);
		   stmt.setString(3, passwor);
		   stmt.execute();
		   con.close();
	       System.out.print("Success");
		}
		else
		{
			System.out.println("invalid details");
		}
		
	}

}
