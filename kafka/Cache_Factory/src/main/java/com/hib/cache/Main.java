package com.hib.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
	 Configuration cfg = new Configuration();
	 cfg.configure("Hibernate.cfg.xml");
	 SessionFactory sf= cfg.buildSessionFactory();
	 Session session = sf.openSession();
	 //Fetch data from DB
	 Student student = (Student) session.get(Student.class, 1);
	 System.out.println("Student Id is : "+student.getId());
	 System.out.println("Student Name is : "+ student.getCity());
	 System.out.println("Student Mobile number is : "+student.getFirstName());
	 System.out.println("Student city is : "+student.getLastName());
	 
	 System.out.println("*******************************************************");
	 
	 Student s1 = (Student) session.get(Student.class, 2);
	 System.out.println("Student id is :" +s1.getId());
	 System.out.println("Student name is :" +s1.getCity());
	 System.out.println("Student city :"+s1.getFirstName());
	 System.out.println("Student mobile is : "+s1.getLastName());
		
	}

}