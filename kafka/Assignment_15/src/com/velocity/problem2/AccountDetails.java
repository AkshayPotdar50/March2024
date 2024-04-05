package com.velocity.problem2;
import java.util.Scanner;
public class AccountDetails extends Account {
 public void getAccountDetails() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("enter the customer id");
	  CustomerId= scanner.nextInt();
	  System.out.println("Enter the account details");
	  AccountNumber= scanner.nextLong();
	  System.out.println("Enter the account balance details");
	  AccountBalance= scanner.nextLong();
	 Account account = new Account();
	 account.setCustomerId(CustomerId);
	 account.setAccountNumber(AccountNumber);
	 account.setAccountBalance(AccountBalance);
	 getWithdrawDetails(account);
	 }
public int getWithdrawDetails(Account account) {
	int currentBalance=0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("enetr the amount you want to withdraw");
	long withdrawAmount=scanner.nextLong();
	currentBalance=(int)(account.getAccountBalance()-withdrawAmount);
	System.out.println("your current account balance is :" +currentBalance);
	return currentBalance;
	
	  
  }
  
}
