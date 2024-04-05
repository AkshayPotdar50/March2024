package com.cache.hiber;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import java.util.List;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {
	  Configuration cfg = new Configuration();	
	  cfg.configure("Hibernate.cfg.xml");
	 SessionFactory sf= cfg.buildSessionFactory();
	  Session session  = sf.openSession();
	   //Session level Cache
	  // Single object from database
	  //Fetch data from databas
	  Student s = (Student) session.get(Student.class, 1);
	    
	    System.out.println("Student id is : " +s.getId());
	    System.out.println("Student First name is : " +s.getFirstName());
	    System.out.println("Student LastName is : "+ s.getLastName());
	    System.out.println("Student city is : "+ s.getCity());
	    
	    System.out.println("****************************************************");
	    
	     Student s1 = (Student) session.get(Student.class, 1);
	     
	     System.out.println("Student id is : "+s1.getId());
	     System.out.println("Student FirstName is : "+s1.getFirstName());
	     System.out.println("Student LastName is : " +s1.getLastName());
	     System.out.println("Student city is : "+s1.getCity()); 
	  
	     //Query level Cache
	       /*Query query= session.createQuery("from Student"); // From PojoClass
	       query.setCacheable(true);
	        List<Student> list= query.list();
	        for(Student s:list)
	        {
	        	System.out.println("Student id is : "+s.getId());
	        	System.out.println("Student FirstName is : "+s.getFirstName());
	        	System.out.println("Student LastName is : "+s.getLastName());
	        	System.out.println("Student city is : "+s.getCity());
	        }*/
	        
	       session.close();
	    
	}

}
