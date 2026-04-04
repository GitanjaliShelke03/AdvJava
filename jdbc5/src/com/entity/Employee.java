package com.entity;

public class Employee {

	private int id ;
	private String name;
	private double salary;
	private String dept;
	
	private String gender;
	
	
	
	public Employee(int id, String name,double salary,String dept,String gender) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.dept=dept;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
