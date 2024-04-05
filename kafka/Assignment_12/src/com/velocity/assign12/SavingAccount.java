package com.velocity.assign12;

import java.util.Scanner;

public class SavingAccount extends Account {
	String  accountType;
	long balance;
	void getSavingAccountDetails()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your type of account>>");
		scanner.next();
		System.out.println("enter account balance details>>");
		scanner.nextLong();
		
	}
	private void getSavingAccountInformation(String  accountType,long balance)
	{
		System.out.println("Account type"+accountType);
		System.out.println("Account balance"+balance);
	}

}
