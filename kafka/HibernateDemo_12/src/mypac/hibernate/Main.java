package mypac.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		// step-1
		System.out.println("line 1");
		Configuration configuration = new Configuration() ; // creating configuration object
	
		System.out.println("line 2");
		  configuration.configure("Hibernate.config.xml"); // this method is used to load cfg file

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
			User user = new User();

			// how to set the value into object student
			user.setUsername("akshay");
			user.setPassword("pass@2369");

			session.save(user);
			transaction.commit();

			session.close();
			System.out.println("Record saved successfully...");



	
	}

}
