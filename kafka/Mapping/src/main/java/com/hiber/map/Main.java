package com.hiber.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction= session.beginTransaction();
		
		//Create Object of Customer
		User user = new User();
		user.setEname("ashish");
		user.setSalary("11000");
		Test test = new Test();
		test.setUsername("ashish@");
		test.setPassword("asji2369");
		
		
		user.setTest(test);
		
		session.save(user);
		System.out.println("Record is inserted");
		transaction.commit();
		session.close();
		sf.close();
	}

}