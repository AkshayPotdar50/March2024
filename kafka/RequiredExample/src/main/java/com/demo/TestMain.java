package com.demo;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Creating object of ApplicationContext
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Required.xml");
		 Driver driver = (Driver) applicationContext.getBean("s");
		 System.out.println("driver Object is : "+driver);
		 driver.getConnection();
	}

}
