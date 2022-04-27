package com.Projectmaven.Maven_Demo.DBUtil;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil
{
static Connection con=null;

public static Connection getConnection()
{
try {
Class.forName("com.mysql.cj.jdbc.Driver"); //load the driver

con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DB","root","Anikesh");

}
catch (Exception e) {
System.out.println(e);
}
return con;
}
}