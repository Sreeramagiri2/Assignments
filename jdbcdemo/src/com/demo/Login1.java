package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter username... ");
	    String uname=sc.next();
	    System.out.println("enter password...");
	    String pass=sc.next();
		//loading the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//get the connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aug28th","root","pavani@123");
		//preparing the statement
		PreparedStatement psmt=conn.prepareStatement("select * from login1 where username=? and password=?");
		psmt.setString(1, uname);
		psmt.setString(2,pass);
		ResultSet rs=psmt.executeQuery();

		
		if(rs.next())
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("oops....login denied");
		}
		conn.close();
	}

}

