package com.elearn;
import java.sql.SQLException;
import java.util.Scanner;
import com.elearn.StudentSignUP;
public class  Main{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		System.out.println("-----Welcome to E-Learning PlatForm------");
		System.out.println("Choose  Options");
		System.out.println(" 1. SignUp          2.Logins");
		System.out.println("Enter your Choice");
		int n=sc.nextInt();
		switch(n)
		{
		case 1: System.out.println("1.Student SignUp         2.Staff SignUp");
		         System.out.println("Enter Your Choice");
		         int m=sc.nextInt();
		         if(m==1)
		         {
		        	 System.out.println("Enter Username");
		        	 String name=sc.next();
		        	 System.out.println("Enter Email address");
		        	 String eam=sc.next();
		        	 System.out.println("Enter password");
		        	 String pass=sc.next();
		        	 System.out.println("Enter ConfirmPassword");
		        	 String con = sc.next();
				     StudentSignUP s=new StudentSignUP(name,eam,pass,con);
				     s.process();
		         }
		         else if(m==2)
		         {
		        	 System.out.println("Enter Username");
		        	 String name=sc.next();
		        	 System.out.println("Enter Email address");
		        	 String eam=sc.next();
		        	 System.out.println("Enter password");
		        	 String pass=sc.next();
		        	 System.out.println("Enter ConfirmPassword");
		        	 String con = sc.next();
		        	 StaffSignUp s=new StaffSignUp(name,eam,pass,con);
				     s.process();
		         }
		        break;
		case 2: System.out.println("1.Student Login        2.Staff Login");
		        int m1=sc.nextInt();
		        if(m1==1)
		        {
		        	System.out.println("Enter registered email id");
		        	String id=sc.next();
		        	System.out.println("Enter your Password");
		        	String pass=sc.next();
		        	StudentLogin s = new StudentLogin(id,pass);
		        	s.process();
		        }
		        if(m1==2)
		        {
		        	System.out.println("Enter registered email id");
		        	String id=sc.next();
		        	System.out.println("Enter your Password");
		        	String pass=sc.next();
		        	StaffLogin s = new StaffLogin(id,pass);
		        	s.process();
		        }
		        break;
		}
		

	}

}
