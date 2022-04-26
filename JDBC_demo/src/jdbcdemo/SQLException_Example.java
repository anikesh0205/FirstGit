package jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLException_Example {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String dburl = "jdbc:mysql://localhost/DB";	   
	   static final String dbuser = "root";
	   static final String dbpass = "Anikesh";


	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		
		try 
		{
		    //Step 1 : Connecting to server and database
		    con = DriverManager.getConnection(dburl, dbuser, dbpass);	    
		    //Step 2 : Initialize Statement
		    stmt=con.createStatement();
		    //Step 3 : SQL Query
		    String query="SELECT * FROM Employee";
		    
		    //Step 4 : Run Query In ResultSet
		    ResultSet rset = stmt.executeQuery(query);
		    while(rset.next())
		    {
		    	System.out.print("E_ID: " + rset.getInt(1));
		    	System.out.print(" E_name : "+rset.getString(2));
		    	System.out.println("E_Age : "+rset.getString(3));
		    }
		} 
		
		catch (SQLException e) 
		{
		    System.err.println("Cannot connect ! ");
		    e.printStackTrace();
		}
		
		finally {
		    System.out.println("Closing the connection.");
		    if (con != null) try { con.close(); } catch (SQLException ignore) {}
		}
		
	}
	}