 package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		// step-1
		System.out.println("line 1");
		Configuration configuration = new Configuration() ; // creating configuration object
	
		System.out.println("line 2");
		  configuration.configure("hibernate.cfg.xml"); // this method is used to load cfg file

			// step-2
			System.out.println("line 3");
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			// step-3
			System.out.println("Line-4");
			Session session = sessionFactory.openSession();

			// step-4
			System.out.println("Line-5");
			Transaction transaction =  session.beginTransaction();

			// insert data into database
			System.out.println("Line no -6");
			Student student = new Student();

			// how to set the value into object student
			student.setFirstName("Rohit");
			student.setLastName("Pawar");
			student.setCity("Mumbai");

			session.save(student);
			transaction.commit();

			session.close();
			System.out.println("Record saved successfully...");



	
	}

}
