package Inheritance5;

public class Main5 {
	//Write a Java program to create a class known as "BankAccount" 
	//with methods called deposit() and withdraw(). 
	//Create a subclass called SavingsAccount that overrides the withdraw() 
	//method to prevent withdrawals if the account balance falls below 100.
	public static void main(String[] args) {
		
		SavingsAccount5 saa= new SavingsAccount5();
			saa.setBalance(40);
			saa.withdraw();
	}

}
