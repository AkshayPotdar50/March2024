package com.java.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			String sql = "create table user( id varchar(10) ,firstName varchar(250) , lastName varchar(250) ,City varchar(100) , mobileno varchar(250))";
					
			Class.forName("com.mysql.jdbc.Driver"); // load the driver
			// to establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Pass@1226");

			// create the sql statement
			Statement statement = con.createStatement();

			// submit the sql statement to database..

			//statement.executeUpdate(sql);
			statement.execute(sql);

			System.out.println("creation successfully...");

			// close the resources.
			con.close();
			statement.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	}


