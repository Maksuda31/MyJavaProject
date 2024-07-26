package Inheritance4;
//Write a Java program to create a class called Employee 
//with methods called work() and getSalary().
//Create a subclass called HRManager that overrides the work() method and 
//adds a new method called addEmployee().
public class Employee {
	private int salary;
	
	
	public void work() {
		System.out.println("Employee works");
	}

	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	


}
