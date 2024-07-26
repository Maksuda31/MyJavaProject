package EncapsulationHomeWork;
//2. Write a Java program to create a class called BankAccount 
//with private instance variables accountNumber and balance. 
//Provide public getter and setter methods to access and modify these variables.

public class BankAccount2 {

	private String accountNumber;
	private double balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		BankAccount2 BA= new BankAccount2();
		BA.setAccountNumber("123AB");
		BA.setBalance(120000.23);
		System.out.println("Bank Account Number: "+BA.accountNumber);
		System.out.println("Balance : "+BA.balance);
	}

















}
