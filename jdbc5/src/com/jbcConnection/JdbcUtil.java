package com.jbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
		
	private static final String url ="jdbc:mysql://localhost:3306/27march";
	private static final String username ="root";
	private static final String password = "password";

		public static Connection createConnection() {
			Connection con = null;
			try {		
	Class.forName("com.mysql.cj.jdbc.Driver");		
			 con = DriverManager.getConnection(url,username,password);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return con;
	   }
	}

