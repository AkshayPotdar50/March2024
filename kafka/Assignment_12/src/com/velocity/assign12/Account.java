package com.velocity.assign12;

import java.util.Scanner;

public class Account {
	int  accountNumber;
	String accountName;
	void getAccountDetails()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your account number>>");
		scanner.nextInt();
		System.out.println("enter account holder name");
		scanner.next();
	}
	private void getaccountinformation(int  accountNumber,String accountName )
	{
		System.out.println("Account number"+accountNumber);
		System.out.println("account holder" +accountName);
	}


}
