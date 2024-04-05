package com.map.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		 cfg.configure("Hibernate.cfg.xml");
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session session = sf.openSession();
		 Transaction transaction= session.beginTransaction();
		 
		 User user1 = new User();
		 user1.setName("Rohit");
		 user1.setEmail("rohit2331@gmail.com");
		
		 User user2 = new User();
		 user2.setName("Shita");
		 user2.setEmail("shital@122gmail.com");

		 Nominee nominee1 = new Nominee();
		 nominee1.setName("Yash");
		 
		 Nominee nominee2 = new Nominee();
		 nominee2.setName("Sneha");
		 
		 Nominee nominee3 = new Nominee();
		 nominee3.setName("Ram");
		 
		 user1.getNomineeList().add(nominee1);
		 user1.getNomineeList().add(nominee2);
		 user1.getNomineeList().add(nominee3);
		 
		 nominee1.getUserList().add(user1);
		 nominee2.getUserList().add(user1);
		 nominee3.getUserList().add(user1);
		 
		 
		 user2.getNomineeList().add(nominee2);
		 user2.getNomineeList().add(nominee3);
		 
		 nominee2.getUserList().add(user2);
		 nominee3.getUserList().add(user2);
		 
		 session.save(user1);
		 session.save(user2);
		 transaction.commit();
		 
		 
		 session.close();
		 
	}

}