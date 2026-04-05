package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Employee;
import com.jbcConnection.JdbcUtil;

public class EmployeeDao {

	Connection con=JdbcUtil.createConnection();	
public String insertEmployee(Employee employee) {
		
	
		try {
		//Statement st  = con.createStatement();
		 PreparedStatement pst= con.prepareStatement("insert into employees values(?,?,?,?,?)");
		  
		  pst.setInt(1, employee.getId());
		  pst.setString(2, employee.getName());
		  pst.setDouble(3,employee.getSalary());
		  pst.setString(4,employee.getGender());
		  pst.setString(5,employee.getDept());
		  pst.execute();
				}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "employee inserted successfully";
}



//update 
public String updateEmployee(Employee employee) {
	try {
	PreparedStatement pst =con.prepareStatement("update employees set salary=?,dept=?,gender=?, name =? where id=?");
	
	//pst.setString(1,employee.getName());
	pst.setDouble(1, employee.getSalary());
	pst.setString(2,employee.getDept());
	pst.setString(3,employee.getGender());
    pst.setString(4,employee.getName());
    pst.setInt(5, employee.getId());

	
	int value = pst.executeUpdate();
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	return "employee updated";
}

public String delete(int id)  {
	try {
		PreparedStatement pst = con.prepareStatement("delete from employees where id =?");
	pst.setInt(1, id);
	pst.execute();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return "employee deleted successfully";
}

//
}
