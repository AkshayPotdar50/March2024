package com.assign12.Insurance;
import java.util.Scanner;
public class Insurance {
	int id;
	String personName;
	String insuranceCompany;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public void getInsuranceDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of insurance id>>");
		id=scanner.nextInt();
		System.out.println("enter the name of the person>>");
		personName=scanner.next();
		System.out.println("enter the name of insurance company>>");
		insuranceCompany=scanner.next();
		//Encapsulation wrapping data and code together
		//we make global variable private and access them with help of
		//getters and setters to achieve security of data
		Insurance insurance =new Insurance();
		insurance.setId(id);
		insurance.setPersonName(personName);
		insurance.setInsuranceCompany(insuranceCompany);
		
		
}
	private void getInsuranceInformation(Insurance insurance) 
	{
		System.out.println("insurance id>>"+insurance.getId());
		System.out.println("person name>>"+insurance.getPersonName());
		System.out.println("get comapany name"+insurance.getInsuranceCompany());
	}


}