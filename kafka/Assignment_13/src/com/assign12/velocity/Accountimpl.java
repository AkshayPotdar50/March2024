package com.assign12.velocity;

import java.util.Scanner;

public class Accountimpl implements Example_1 {

	@Override
	public void getSavingAccount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the user name");
		String name=scanner.next();
		System.out.println("enter the account balance");
		float balance=scanner.nextFloat();
		Accountimpl accountimpl = new Accountimpl();
		accountimpl.getUserDetail(name,balance);
		
	}//as here name and balance are loacal variables so no need that var
	//in both methods will be same
	@Override
	public void getUserDetail(String name, float balance) {
		System.out.println("the user name is" +name);
		System.out.println("the account balance is"+balance);
		
		
	}

}
