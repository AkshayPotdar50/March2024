package com.constructor.chaining;
public class BankAccount {
    private String accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // 1st constructor
    public BankAccount(){
        this("2872", 0); // calls 2nd constructor
        System.out.println("1st constructor called!");
    }

    // 2nd constructor
    public BankAccount(String accountNumber, long balance) {
        this(accountNumber, balance, "NULL", "NULL", "NULL"); // calls 3rd constructor
        System.out.println("2nd constructor called!");
    }

    // 3rd constructor
    public BankAccount(String accountNumber, long balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("3rd constructor called!");
    }

    public void accountDetails(){
        System.out.println("Account Details:" +
                "\nCustomer Name: " + this.customerName +
                "\nAccount Number: " + this.accountNumber +
                "\nBalance: " + this.balance +
                "\nEmail: " + this.email +
                "\nPhone Number: " + this.phoneNumber + "\n\n");
    }
}