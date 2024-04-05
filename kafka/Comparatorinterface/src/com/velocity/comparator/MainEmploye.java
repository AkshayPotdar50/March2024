package com.velocity.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MainEmploye {

	public static void main(String[] args) {
	 //List of employee
	ArrayList<Employe> al = new ArrayList<Employe>();
	al.add(new Employe(101,"Ram",90000));
	al.add(new Employe(102,"Yash",100000));
	al.add(new Employe(103,"Sneha",300000));
	al.add(new Employe(104,"Vimal",1000));
	al.add(new Employe(105,"Aditya",800));
	
	Employe emp = new Employe();
	emp.setId(100);
	emp.setName("Anurag");
	emp.setSalary(500000);
	
	al.add(emp);
	
	//Collections.sort(al); This will not allowed
	
	//Based on salary you want to sort it
	Collections.sort(al,new SalaryCompaartor());
	
	for(Employe emp1 :al)
	{
		System.out.println("Id " +emp1.getId() +" " +"name" + " "+ emp1.getName()
		+ " " +emp1.getSalary());
		
	}
	System.out.println("*************************************");
	
	Collections.sort(al,new NameComparator());
	
	Iterator<Employe> itr=al.iterator();
	
	while(itr.hasNext())
	{
		Employe emp1 =itr.next();
		System.out.println("Employe Name is : " +emp1.getName()
		 + " " + emp1.getSalary() +" " +emp1.getId());	
	}
	
	
	
	
	
	
	}

}
