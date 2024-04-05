package com.assign12.LifeInsurance;

import java.util.Scanner;

import com.assign12.Insurance.Insurance;

public class LifeInsurance extends Insurance {
	int premiumAmount;
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public void getLifeInsuranceDetails()
	{   Scanner scanner = new Scanner(System.in);
	System.out.println("enter the life insurance details>>");
		System.out.println("enter the value of premium amount>>");
	premiumAmount=scanner.nextInt();
	LifeInsurance lifeInsurance = new LifeInsurance();
	lifeInsurance.setPremiumAmount(premiumAmount);
	
	}
	private void getLifeInsuranceInformation(LifeInsurance lifeInsurance)
	{
		System.out.println("premium amount"+lifeInsurance.getPremiumAmount());
	}

}