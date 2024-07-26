package Inheritance4;

public class HRManager extends Employee {
	//Write a Java program to create a class called Employee 
	//with methods called work() and getSalary().
	// Create a subclass called HRManager that overrides the work() method and 
	//adds a new method called addEmployee().
	
	public void work() {
		System.out.println("HR Manager is also an employee");
	}
	public void addEmployee() {
		System.out.println("HR Manager wants to add employee too");
	}
}
