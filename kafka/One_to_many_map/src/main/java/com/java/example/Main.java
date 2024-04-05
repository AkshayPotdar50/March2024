package com.java.example;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
			 Configuration cfg = getConfiguration();
			 SessionFactory sf= cfg.buildSessionFactory();
			 Session session = sf.openSession();
			 Transaction transaction= session.beginTransaction();
			 
			 User user = new User();
			 
			 Policy policy1 = new Policy("A1","Car Insuranc","Active",user);
			 Policy policy2 = new Policy("A2","Life Insurance","Active",user);
			 Policy policy3 = new Policy("A3","term Life Insurance","Active",user);
			 
			 
			 
			 user.setName("pranali");
			 user.setEmail("pran@gmail.com");
			 
			 Set<Policy> set = new HashSet<Policy>();
			 set.add(policy1);
			 set.add(policy2);
			 set.add(policy3);
			 
			 user.setPolicy(set);
			 
			 session.save(user);
			 session.save(policy1);
			 session.save(policy2);
			 session.save(policy3);
			 
			 transaction.commit();
			 session.close();
			 sf.close();

		}

		//Create method which return Configuration 
		public static Configuration getConfiguration()
		{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg;
		}
	}
