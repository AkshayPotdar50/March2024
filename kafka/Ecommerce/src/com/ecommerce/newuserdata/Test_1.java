package com.ecommerce.newuserdata;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.w3c.dom.css.RGBColor;

import com.ecommerce.connection.Cp;
import com.ecommerce.userdata.Registration;
import com.ecommerce.userlogin.Register;

public class Test_1 {
	public boolean InsertUserToDb(Registration reg) {
		//jdbc code here
		boolean f = false;
		try {
			Connection con = Cp.createC();
			String q = "insert into user(userId, uName, email, password, userName) value(?, ?, ?, ?, ?)";
			//preapared statement//
			PreparedStatement pstmt = con.prepareStatement(q);
			Register rg = new Register();
			pstmt.setLong(1, rg.getUserId());
			pstmt.setString(2, rg.getuName());
			pstmt.setString(3, rg.getEmail());
			pstmt.setString(4, rg.getPassword());
			pstmt.setString(5, rg.getUserName());
			//execute
			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteuser(int userId) {
		//jdbc code here
		boolean f = false;
		try {
			Connection con = Cp.createC();
			String q = "delete from user where sid=?";
			//preapared statement//
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1,userId);
			
			
			//execute
			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllusers() {
		//jdbc code here
			boolean f = false;
			try {
				Connection con = Cp.createC();
				String q = "select * from users;";
				//preapare statement//
				Statement stmt = con.createStatement();
				ResultSet set = stmt.executeQuery(q);
				while(set.next()) {
					int userId = set.getInt(1);
					String uName = set.getString(2);
					String email = set.getString(3);
					String password = set.getString(4);
					String userName=set.getString(5);
					
					System.out.println("ID" +userId);
					System.out.println("Name" +uName);
					System.out.println("email" +email);
					System.out.println("password" +password);
					System.out.println("Username" +userName );
					System.out.println("*****************************");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		
	}



