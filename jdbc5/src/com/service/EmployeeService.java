package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeService {
	//business logic

		EmployeeDao dao = new EmployeeDao();
		
		public String insertEmployee(Employee employee) {
			String msg= dao.insertEmployee(employee);
		return msg;
	}
		public String update(Employee employee) {
			
			String msg =dao.updateEmployee(employee);
			return msg;
		}
		public String delete(int id) {
			String msg = dao.delete(id);
			return msg;
		}
}
