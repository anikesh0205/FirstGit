package com.Projectmaven.Maven_Demo.service.serviceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.Projectmaven.Maven_Demo.DBUtil.DBUtil;
import com.Projectmaven.Maven_Demo.myException.*;
//import com.Projectmaven.Maven_Demo.myException.InvalidIdException;
import com.Projectmaven.Maven_Demo.myException.ServiceException;
//import com.Projectmaven.Maven_Demo.EmployeeService;
import com.Projectmaven.Maven_Demo.service.*;
public class EmployeeServiceImpl implements EmployeeService
{
	Statement stmt =null;
	ResultSet rs =null;
	Connection cn =null;

	public void showAll() throws ServiceException
	{
		try {
			cn = DBUtil.getConnection();
			if(cn!=null)
			{
				stmt=cn.createStatement();
			}
			rs=stmt.executeQuery("select * from Employee");
			System.out.println("=========Displaying Employee Details=========\n");
			System.out.println("E_ID"+ "\t" + "E_name" + "\t" + "E_age" + "\t" + "E_salary");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t  "+rs.getInt(3)+"\t"+rs.getInt(4));
			}
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}
	public ResultSet display() throws ServiceException
	{
		try {
			rs=stmt.executeQuery("select * from Employee where E_salary > 20000");
		}catch (Exception e) {
			throw new ServiceException(e);
		}
		return rs;
	}
	public void invalidId(int empId) throws ServiceException
	{
		try {
			rs=stmt.executeQuery("select * from Employee where E_ID= '"+empId+"'");
			if(rs.next())
			{
				do
				{	
					System.out.println("\n====Displaying Employee Details=====");
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t  "+rs.getInt(3)+"\t"+rs.getInt(4));
				}while(rs.next());
			}
			else
			{
				throw new InvalidIDException("Employee id " +empId+" not present in the database");
			}
		}catch (InvalidIDException e) {
			throw new ServiceException(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public void updateSalary(int empId,int empSal) throws ServiceException
	{
		try {
			rs=stmt.executeQuery("select E_ID from Employee");
			while(rs.next())
			{
				if(rs.getInt("E_ID") == empId)
				{
					System.out.println("Update salary for employee id: "+empId);
					stmt.executeUpdate("UPDATE Employee SET E_salary='"+empSal+"' WHERE E_ID = '"+empId+"'");
					System.out.println("Salary Updated successfully!!");
					showAll();
				}
			}
		}
		catch(Exception e) {
			throw new ServiceException(e);
		}
		finally
		{
			try {
					rs.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			try {
					stmt.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			try {
					cn.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}	
	}
	public void createConnection() throws ServiceException {
		// TODO Auto-generated method stub
		
	}
}


