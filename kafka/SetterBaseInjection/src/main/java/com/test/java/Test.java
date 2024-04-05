package com.test.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//applicationcontext interface//
		ApplicationContext applicationcontext =new ClassPathXmlApplicationContext("Spring.xml");
		//creating bean of student//
		Student student = (Student) applicationcontext.getBean("s");
		System.out.println("student object is"+student);
		System.out.println("**********************************");
		Student student1=(Student) applicationcontext.getBean("a");
		System.out.println("student object is"+student1);
		
		

	}

}
