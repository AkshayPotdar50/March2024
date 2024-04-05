package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		//step 1 creating configuration object
		Configuration config = new Configuration();
		
		//step 2 we have to configure
		config.configure("hibernate.cfg.xml");
		
		// step 3 creating object of session factory
		SessionFactory sf = config.buildSessionFactory();
		
		//step 4 creating object of session
		Session session =sf.openSession();
		
		// step 5 creating object of transaction
		Transaction tx=session.beginTransaction();
		
		//Typecasting
		Student student =(Student) session.get(Student.class, 1);
		System.out.println("student name is " +student.getName());
		
		//calling delete method from session 
		session.delete(student);
		
		//commiting and closing session
		tx.commit();
		System.out.println("record is deleted");
		session.close();
		sf.close();
		}

}
