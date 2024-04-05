package com.java.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prepared {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.cj.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Pass@1226");
				/*The PreparedStatement object is created by using
	prepareStatement() method of Connection class. It is used for executing the
	parameterized query.*/
				PreparedStatement pstmt = con.prepareStatement("update user set Name=? , salary=?  , where Id=?");
				pstmt.setString(1, "potdar");
				pstmt.setString(2, "32369");
				pstmt.setInt(3, 2);
				int i=pstmt.executeUpdate();
				System.out.println("record updated:"+i);
				con.close();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				}
			

		}
}
