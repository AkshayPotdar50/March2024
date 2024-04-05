package com.assign12.problem2;

import java.util.Scanner;

public class ICICIBank extends Bank {
	void getICICIBankDeatils() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the details of icici bank ");
		System.out.println("enter the principle amount>>");
		principleAmount=scanner.nextDouble();
		System.out.println("enter the value of tenure>>");
		tenure=scanner.nextInt();
		System.out.println("enter the value of rate of interest>>");
		rateOfInterest=scanner.nextFloat();
		System.out.println("the total amount of simple interest is>>" + getCalculateInterest( principleAmount, tenure, rateOfInterest)); 
				 
	}
	 
	private double getCalculateInterest(double principleAmount, int
					tenure, float rateOfInterest) {
					return ((principleAmount * tenure * rateOfInterest) / 100);

			
			}  

}
