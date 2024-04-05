package com.velocity.comparator;
public class Employe {
	
	 int id ;
	 String name;
	 int salary;
	//generate getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Employe(int salary) {
		super();
		this.salary = salary;
	}
	@Override //override to string method
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public Employe(int id, String name, int salary) {
		super();
		this.id = id; // parameterized constructor
		this.name = name;
		this.salary = salary;
	}
	public Employe() {
		super(); //parameterless constuctor
	}
	
	
	

}
