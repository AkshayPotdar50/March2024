package com.velocity.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Insert the student data using statement
public class InsertData {

	public static void main(String[] args){

		try {
			String sql = "insert into user(lastName,firstName,Address,City,Salary)"
					+ "values('pawar','ram','sangavi','pune',5000)";
			Class.forName("com.mysql.jdbc.cj.Driver"); // load the driver
			// to establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay", "root", "Pass@1226");
/*: The object of Connection is created by using getConnection()
method of DriverManager class. DriverManager is the factory for connection.
*/
			// create the sql statement
			Statement statement = con.createStatement();
			/*The object of the Statement is created by using createStatement()
method of the Connection class. The Connection interface is the factory for
Statement*/

			// submit the sql statement to database..

			//statement.executeUpdate(sql);
		boolean rs=	statement.execute(sql);
			/*The ResultSet object maintains a cursor pointing to a table row. At
first, the cursor points before the first row. The executeQuery() method of the
Statement interface returns the object of ResultSet.
*/
System.out.println(rs);
			System.out.println("Insertion successfully...");

			// close the resources.
			con.close();
			statement.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

