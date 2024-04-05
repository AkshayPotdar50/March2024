package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		ResultSet rs = null;
		//Loading Driver	
				Class.forName("com.mysql.cj.jdbc.Driver");
				//creating Connection 
				 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Pass@1226");
				  //Single update values
				// 
				  //Multiple update values
				 PreparedStatement preparedStatement= connection.prepareStatement("select * from user");
				 rs=preparedStatement.executeQuery();
				  System.out.println("id\t\tfirstName\t\tlastName\t\tCity\t\tmobileno");
				  /*here we use escape sequesence to display the results*/
				  while(rs.next()) {
					  String id=rs.getString("id");
					  String firstName=rs.getNString("firstName");
					  String lastName = rs.getNString("lastName");
					  String City =rs.getNString("City");
					  String mobileno =rs.getNString("mobileno");
					  System.out.println(id + "\t\t"+ firstName +"\t\t\t" + lastName +"\t\t\t" + City +"\t\t"+ mobileno);
				  }
				  connection.close();
				  preparedStatement.close();
			}
	}


