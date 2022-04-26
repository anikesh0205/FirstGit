package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Sample {

	public static void main(String[] args) throws SQLException{
		String host = "localhost";
		String port = "3306";
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/EMPManagement","root","Anikesh");
		Statement s = conn.createStatement();
	
		
		ResultSet rs = s.executeQuery("select * from EMP");
		while(rs.next()) {
			String data ="";
			for(int i=1;i<=4;i++)
			{
				data+=rs.getString(i)+ " ";
			}
			System.out.println(data);
			
			//System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
			//System.out.print(rs.getString(1));
			//s.close();
			//conn.close();
		}
		
	}

}
