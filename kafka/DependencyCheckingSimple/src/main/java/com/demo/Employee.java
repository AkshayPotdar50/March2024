package com.demo;

public class Employee {

	private String firstName;

	private Address address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void getAllEmployee() {
		System.out.println("first name>>" + firstName);
		System.out.println("Address>>" + address.getAddressLine());
	}

}
