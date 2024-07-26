package Abstraction5;

public class Manager5 extends Employee5{

	String name;
	String Dept;
	int age;
	double salary;
	private int hourlyRate;
	private int totalHour;
	
	@Override
	public void calculateSalary() {
		System.out.println("Salary per week is "+hourlyRate*totalHour);
		
	}

	public void manager(String name, String Dept, int age) {
		this.name=name;
		this.Dept=Dept;
		this.age=age;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Display info: Name-"+name);
		System.out.println("Display info: Dept-"+Dept);
		System.out.println("Display info: Age-"+age);
		
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getTotalHour() {
		return totalHour;
	}

	public void setTotalHour(int totalHour) {
		this.totalHour = totalHour;
	}


}
