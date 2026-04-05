package com.main;

import com.controller.EmployeeController;
import com.entity.Employee;

public class EmployeeMain {
	
public static void main(String[] args) {
	
	EmployeeController controller = new EmployeeController();
//	
//	Employee e = new Employee(3,"arati","UIUX",900000,"female");
//	
//	String msg = controller.insertEmployee(e);
//	System.out.println(msg);
//	
//	Employee e = new Employee(1,"geetanjali",810000,"UIUX","female");
//	String msg =controller.update(e);
//	System.out.println(msg);
	try {
	System.out.println(controller.delete(4));
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
