package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	   System.out.println("Project started!..");
           
           Configuration cfg=new Configuration();
           cfg.configure();
           SessionFactory factory=cfg.buildSessionFactory();
    	 
           
           /*Either we can take input from Scanner or by BufferedReader
           BufferedReader is class in java where we can take input from user by using 
           input stream reader*/
           
           
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 System.out.println("Enter the ID, name, city, mobile ");
    	 
    	 int id=Integer.parseInt(br.readLine());
    	 //bufferedReader accept input from user in string 
    	//hence conevrting in integer is required to store ID
    	 String name=br.readLine();
    	 String city=br.readLine();
    	 String mobile = br.readLine();
    	 Student student=new Student();
    	 
    	 student.setId(id);
    	 student.setName(name);
student.setCity(city);
    	 
    	 System.out.println("Student has : "+student);
   
       /* student.setId(1);
        student.setName("Ram");
        student.setCity("Nagpur");	*/

       Session session=factory.openSession();
       
       Transaction tx= session.beginTransaction();
       session.save(student);
       session.getTransaction().commit();
       System.out.println("Record Inserted!.. ");
       
       //tx.commit();
    
       session.close();
        
}
}
