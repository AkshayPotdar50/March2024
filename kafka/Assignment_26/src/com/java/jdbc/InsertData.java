package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {

		try {
			String sql = "insert into user(id,firstName,lastName,City,mobileno)"
					+ "values('1','ram','patil','pune',2369877451)";
			Class.forName("com.mysql.jdbc.Driver"); // load the driver
			// to establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Pass@1226");

			// create the sql statement
			Statement statement = con.createStatement();

			// submit the sql statement to database..

			//statement.executeUpdate(sql);
			statement.execute(sql);

			System.out.println("Insertion successfully...");

			// close the resources.
			con.close();
			statement.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	}


