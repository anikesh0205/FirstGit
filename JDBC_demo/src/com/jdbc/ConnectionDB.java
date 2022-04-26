package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionDB 
{
	static Connection connection=null;
	static String databaseName="DB";
	String host = "localhost";
	String port = "3306";
	//Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/DB","root","Anikesh");
	static String url="jdbc:mqsql://localhost:3306/+DB";
	static String username="root";
	static String password="Anikesh";
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InstantiationException,IllegalAccessException,ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		DriverManager.getConnection(url,username,password);
		PreparedStatement ps= connection.prepareStatement("INSERT INTO DB.Employee(E_ID,E_name,E_Age,E_salary)values (12,'Ram',28,89000);");
		int status=ps.executeUpdate();
		{
			if (status!=0) {
				System.out.println("Database connected");
				System.out.println("Record inserted");
			}
		}
	}
	

}
