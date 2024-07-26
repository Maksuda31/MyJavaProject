package Abstraction5;

public class Programmer extends Employee5 {
	String name;
	int yearofExperience;
	int numberofProject;
	private int rate;
	
	
	@Override
	public void calculateSalary() {
		System.out.println("Programmer's salary is "+numberofProject*rate);
		
	}
	public Programmer(String name, int yearofExperience, int numberofProject) {
		this.name= name;
		this.yearofExperience=yearofExperience;
		this.numberofProject=numberofProject;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Display info: name-"+name);
		System.out.println("Display info: years of Experience-"+yearofExperience);
		System.out.println("Display info: Number of project done-"+numberofProject);
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}

}
