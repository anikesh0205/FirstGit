package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo {

	public static void main(String[] args) throws SQLException{
		String host = "localhost";
		String port = "3306";
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/DB","root","Anikesh");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(" select * from Employee");
		while(rs.next()) {
			
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
			//System.out.print(rs.getString(1));
			//s.close();
			//conn.close();
		}
		
	}

}
