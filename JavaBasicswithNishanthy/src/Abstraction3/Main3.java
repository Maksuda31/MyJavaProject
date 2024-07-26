package Abstraction3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) throws ParseException {
	
		SavingsAccount SA= new SavingsAccount();
			SA.setBalance(6000);
			SA.deposit();
			SA.withdraw();	
			SA.Interest();
		
		CurrentAccount CA= new CurrentAccount();
			CA.deposit();
			CA.withdraw();
		

	}

}
