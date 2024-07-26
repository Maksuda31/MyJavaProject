package Inheritance5;
//Write a Java program to create a class known as "BankAccount" 
//with methods called deposit() and withdraw(). 
//Create a subclass called SavingsAccount that overrides the withdraw() 
//method to prevent withdrawals if the account balance falls below 100.
public class SavingsAccount5 extends BankAccount{
	
	private int balance;
	
	public void deposit() {
		System.out.println("Any amount can be deposited");
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void withdraw() {
		
		if(getBalance()>=100) {
			System.out.println("Smooth Withdrawal");
		}
		else {
			System.out.println("Withdrawal is restricted");
		}
		
	}
	
}
