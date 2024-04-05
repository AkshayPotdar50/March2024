package com.assign.problem_1;

public class Employee implements Comparable {
	private String name;
	private int id;
	private String city;

	public Employee(String string, int i,String string1) {
		this.name = string1;
		this.id = i;
		this.city=string1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int compareTo(Object o) {
		Employee employee = (Employee) o;
		String name = employee.name;
		return this.name.compareTo(name);
	}
}