package com.velocity.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test_1 {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay", "root", "Pass@1226");
			/*The PreparedStatement object is created by using
prepareStatement() method of Connection class. It is used for executing the
parameterized query.*/
			PreparedStatement pstmt = con.prepareStatement("update studentdata set name=? , marks=? , city=? , where id=?");
			pstmt.setString(1, "potdar");
			pstmt.setInt(2, 32);
			pstmt.setString(3, "pune");
			pstmt.setInt(4, 2);
			int i=pstmt.executeUpdate();
			System.out.println("record updated:"+i);
			con.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			}
		

	}

}
