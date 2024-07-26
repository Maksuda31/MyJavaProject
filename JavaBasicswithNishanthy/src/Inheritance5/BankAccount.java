package Inheritance5;

//Write a Java program to create a class known as "BankAccount" 
//with methods called deposit() and withdraw(). 
//Create a subclass called SavingsAccount that overrides the withdraw() 
//method to prevent withdrawals if the account balance falls below 100.
public class BankAccount {
	
	public void deposit() {
		System.out.println("Any amount is allowed to deposit");
	}
	public void withdraw() {
		System.out.println("Withdrawal has some restriction");
	}
}
