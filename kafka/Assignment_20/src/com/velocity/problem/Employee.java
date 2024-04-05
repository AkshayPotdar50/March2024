package com.velocity.problem;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
//3. Design the method for ArrayList<Employee> which returns
	//the list of employee and print that data.
	private int id;
	private String employeename;
	private int empage;
	
	public Employee() {}
	


	public Employee(int id, String employeename, int empage) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.empage = empage;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmployeename() {
		return employeename;
	}


	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}


	public int getEmpage() {
		return empage;
	}


	public void setEmpage(int empage) {
		this.empage = empage;
	}
	


	@Override
	public String toString() {
		return "Problem_3 [id=" + id + ", employeename=" + employeename + ", empage=" + empage + "]";
	}
	
	}