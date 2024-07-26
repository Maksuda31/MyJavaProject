package Abstraction3;

public class CurrentAccount extends BankAccount {

	@Override
	public void deposit() {
		System.out.println("Current Account: Any amount can be deposited");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Current Account: Any amount can be withdrawn");
		
	}

}
