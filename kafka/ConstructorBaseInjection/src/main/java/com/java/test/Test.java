package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// Creating object of applicationContext 
	ApplicationContext ap = new ClassPathXmlApplicationContext("Spring.xml");
     Student student  = (Student) ap.getBean("s");
      System.out.println("Student object is : " +student);
	}

}
