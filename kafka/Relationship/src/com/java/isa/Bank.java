package com.java.isa;

import java.util.Set;

class Bank{
	// Attributes of bank
    private String name;
     
      private Set<Employee> employees;
      
    public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	// Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }
   
    
}