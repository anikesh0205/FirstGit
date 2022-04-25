package service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

import InvalidException.InvalidIDexception;

public class ServiceImp implements Service
{
static Scanner sc=new Scanner(System.in);
static String host="jdbc:mysql://localhost: 3306/";
//static String port="3306";
static String dbname="DB";
static String username="root";
static String password="Anikesh";
static Statement st=null;
static ResultSet rs=null;
@Override
public void dbConnection() {
// TODO Auto-generated method stub

	try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection(host+dbname,username,password);
st=con.createStatement();
rs=st.executeQuery("select * from Employee");
System.out.println("----Employee Details----");
System.out.println("E_ID\tE_name\tE_age\tE_salary\t\n");
while(rs.next()) {
if(rs.getInt(4)>20000) {
System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+" "+rs.getInt(3)+ "\t"+rs.getInt(4));
    }
  }
}
catch(ClassNotFoundException e) {
e.printStackTrace();
 }
catch(SQLException e) {
e.printStackTrace();
  }

}
@Override

 public void updateSalary() {
// TODO Auto-generated method stub
System.out.println("\nUpdate Employee salary by ID");
System.out.println("Enter ID: ");
int update_id=sc.nextInt();
try{
Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/DB","root","Anikesh");
	Connection con=DriverManager.getConnection(host+dbname,username,password);
	st=con.createStatement();
rs=st.executeQuery("select * from Employee" );
int id=0;
while(rs.next()) {
if(rs.getInt(1)==update_id) {
id=rs.getInt(1);
break;
}
}
try {
	System.out.print("Enter salary: ");



	int empSal=sc.nextInt();



	st.executeUpdate("UPDATE Employee SET E_salary='"+empSal+"' WHERE E_ID = '"+update_id+"'");
if(id==0) {
throw new InvalidIDexception("invalid id");
}
else {
System.out.println("\n Salary updated Successfully!!!!!!");
dbConnection();
  }

}
catch(InvalidIDexception e) {
	System.out.println(e);
}
}
catch(Exception e) {
System.out.println(e);
}

}
}


