package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Loading Driver	
				Class.forName("com.mysql.cj.jdbc.Driver");
				//creating Connection 
				 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Pass@1226");
				  //Single update values
				// PreparedStatement preparedStatement= connection.prepareStatement("update user set city = ? where id=?");
				  //Multiple update values
				 PreparedStatement preparedStatement= connection.prepareStatement("update user set firstName =? ,lastName =? where id=?");
				  preparedStatement.setString(1, "Shital"); //firstName
				  preparedStatement.setString(2, "Mane"); //LastName
				  preparedStatement.setString(3, "2"); //id 
				  int i =preparedStatement.executeUpdate();
				  System.out.println("Record is updated : "+i);
				  connection.close();
				  preparedStatement.close();
			}

	}


