package com.hib.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory= cfg.buildSessionFactory();
		Session session= sessionfactory.openSession();
		Transaction Transaction = session.beginTransaction();
		//Transient state
		Student student = new Student();
		student.setFirstName("akshay");
		student.setLastName("pawer");
		student.setCity("latur");
		
		
		
		//Persisatnce state 
		session.save(student);
		Transaction.commit();
		
		// Detached state
		session.evict(student);
		
		session.close();
	}

}