package com.controller;

import java.sql.SQLException;

import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeController {

	EmployeeService service = new EmployeeService();
	
	public String insertEmployee(Employee employee) {
		String msg = service.insertEmployee(employee);
		return msg;
	}
	
	public String update(Employee employee) {
		String msg =service.update(employee);
		return msg;
	}
	public String delete(int id) {
		String msg= service.delete(id);
		 return msg;
	}
}
