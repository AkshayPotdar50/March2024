package com.map.many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sfg=cfg.buildSessionFactory();
		Session session =sfg.openSession();
		Transaction transaction= session.beginTransaction();
		//creating object of employee
		 Employee emp1 = new Employee();
		 emp1.setName("Ravan");
		 emp1.setEmail("Lankesh@lankagmail.com");
		 emp1.setSalary("1000000");
		 Employee emp2 = new Employee();
		 emp2.setName("Hanuman");
		 emp2.setEmail("Wayuputra@Kishkindhagmail.com");
		 emp2.setSalary("200000");
		 //here one address is assigned to many than one employee so//
		 Address address = new Address();
		 address.setCity("Pune");
		 address.setCountry("India");
		 address.setPincode("411236");
		 address.setState("Maharashtra");
		 
		 emp1.setAddress(address);
		 emp2.setAddress(address);
		 
		 session.save(emp1);
		 session.save(emp2);
		 transaction.commit();
		 
		 session.close();
		 sfg.close();
		 		 
	}



	}


