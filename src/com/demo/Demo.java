package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws SQLException {
		//load Driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the connection
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcTest","root" ,"password" );
			
			 Statement st =con.createStatement();
			  //st.execute("create database jdbctest;
			 //st.execute("create table AdvJava(day1 varchar(20),id int)");
			 
			 //st.execute("insert into advjava values('reg_driver',2),('mysql_connector',1),('establish_connection',3),('create_stat',4),('excecute_stat',5)");
			 //st.execute("update advjava set day1 ='exec_statement' where id=5");
			 
			 st.execute("alter table advjava  add column is_executed boolean default 1");
			 System.out.println("allll issss welll");
   		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
