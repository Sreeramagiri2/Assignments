package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aug28th","root","pavani@123");
		Statement stmt=conn.createStatement();
		//boolean result=stmt.execute("create table social(sid int,sname varchar(30),sadd varchar(20))");
		//int result=stmt.executeUpdate("insert into social values(123,'pavani','hyd')");
		//int result=stmt.executeUpdate("update social set sadd='vizag' where sid=123");
		/*ResultSet result=stmt.executeQuery("select * from social");
		while(result.next()) {
		System.out.println(result .getInt(1)+" "+result.getString(2)+" "+result.getString(3));
	}*/
		int result=stmt.executeUpdate("delete from social where sid=123");
	conn.close();
	System.out.println("record deleted:"+result);

	}
}