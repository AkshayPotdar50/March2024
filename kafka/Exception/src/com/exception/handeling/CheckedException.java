package com.exception.handeling;

import java.awt.dnd.DropTargetDragEvent;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckedException {

	public static void main(String[] args) {
		/*IOException*/
		try {
			FileReader fileReader= new FileReader("myfile.txt");
			fileReader.close();
		}catch(IOException e) {
			System.out.println("an i/o exception occured:"+e.getMessage());
		}
System.out.println("*********************************************");

/*SQLException*/
try {
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
	connection.close();
}catch(SQLException e){
	System.out.println("a database error is occured:"+e.getMessage());
}
System.out.println("****************************************");

/*classNotFoundException*/
try {
	Class<Integer>  clazz = (Class<Integer>) Class.forName("com.example.Myclass");
	}catch(ClassNotFoundException e){
		System.out.println("the specified class is not found:"+e.getMessage());
	}
System.out.println("**********************************************************");

/*Interrupted Exception*/
try {
	Thread.sleep(1000);
	
}catch(InterruptedException e) {
	System.out.println("the thread was interrupted:"+e.getMessage());
	}
System.out.println("*********************************************************");

/*ParseException*/
try {
	SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-mm-dd");
	Date date=(Date) dateFormat.parse("2023-05-28");
}catch (ParseException e) {
	System.out.println("an error occurd while parsing the date:"+e.getMessage());
	}
System.out.println("******************************************************");

/*NoSuchMethodException*/

	}

}
