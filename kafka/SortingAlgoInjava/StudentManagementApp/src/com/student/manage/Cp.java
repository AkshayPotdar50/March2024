package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Cp {
	static Connection con;
	public static Connection createC() {
		//load the driver//
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String user="root";
			String password ="Pass@1226";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			//create the connection
			con=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}

}
