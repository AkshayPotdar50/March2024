package com.velocity.java;
import java.util.Scanner;

public class Employeeinformation {
	
	public void getuserinput() {
		Employee employee = new Employee();
		//creating scanner class object for user input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the firstname>>");
		employee.firstname = scanner.nextLine();
		
		System.out.println("enter the lastname>>");
		employee.lastname = scanner.nextLine();
		
		System.out.println("enter the city>>");
		employee.city = scanner.nextLine();
		
		System.out.println("enter the mobilenumber>>");
		employee.mobilenumber = scanner.nextLong();
		
		
		getstudentinformation(employee.firstname , employee.lastname, employee.city, employee.mobilenumber, Employee.country );
		
	
		
		
	}

	
	public void getstudentinformation(String fname, String lname, String city, long mobnum,
			String country) {
		System.out.println("Student Information:");
		System.out.println("************************************");
		System.out.println("First Name: " + fname);
		System.out.println("************************************");
		System.out.println("Last Name: " + lname);
		System.out.println("************************************");
		System.out.println("City: " + city);
		System.out.println("************************************");
		System.out.println("Mobile number: " + mobnum);
		System.out.println("************************************");
		System.out.println("Country: " + country);
		}
	public static void main(String[] args) {
		Employeeinformation employeeInformation = new Employeeinformation();
		System.out.println("enter the number of student>>\") ");
				
				Scanner input = new Scanner(System.in);
				int count = input.nextInt();
				for (int i = 1; i <= count; i++) {
				System.out.println("Enter the Student details>>\");");
				
				employeeInformation.getuserinput();
				}
	}
	}
				


		
	

		
	


