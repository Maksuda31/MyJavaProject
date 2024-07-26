package Abstraction5;

public class Main5 {

	public static void main(String[] args) {
		Manager5 m= new Manager5();
			
			m.setHourlyRate(150);
			m.setTotalHour(40);
			m.calculateSalary();
			m.manager("John", "Functional Tester", 36);
			m.displayInfo();
	
		Programmer p= new Programmer("Max", 20, 14);
		
			p.setRate(1000);
			p.calculateSalary();
			p.displayInfo();
	}

}
