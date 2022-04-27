package com.Projectmaven.Maven_Demo.service;
import java.sql.ResultSet;

import com.Projectmaven.Maven_Demo.myException.ServiceException;

public interface EmployeeService
{
public void createConnection() throws ServiceException;
public void showAll() throws ServiceException;
public ResultSet display() throws ServiceException;//displaying employee details whose salary>20000
public void invalidId(int empId) throws ServiceException;
public void updateSalary(int empId, int empSal) throws ServiceException;
}

