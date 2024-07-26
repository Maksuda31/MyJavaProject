package Inheritance4;

public class Main {
	//Write a Java program to create a class called Employee 
	//with methods called work() and getSalary().
	// Create a subclass called HRManager that overrides the work() method and 
	//adds a new method called addEmployee().
	
	public static void main(String[] args) {
		Employee e= new Employee();
			e.setSalary(8000);
			System.out.println("Employee Salary: "+e.getSalary());
		
		
		HRManager hrm= new HRManager();
			hrm.addEmployee();
			hrm.work();

	}

}
