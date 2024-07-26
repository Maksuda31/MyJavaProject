package Abstraction3;

public class SavingsAccount extends BankAccount {
	private double balance;
	double withdraw;
	double interestRate=0.02;	
	
	public void Interest() {
		double InterestAmount=
		getBalance()*interestRate;
		System.out.println("Interest amount is "+InterestAmount);
	}

	@Override
	public void deposit() {
		System.out.println("SavingAccount-Minimum Deposit is:"+balance);
		}

	@Override
	public void withdraw() {
				
		if(getBalance()>=5000) {
			System.out.println("SavingsAccount: Withdrawal is allowed");
		}
		else {
			System.out.println("SavingsAccount: Withdrawal is restricted");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


}
