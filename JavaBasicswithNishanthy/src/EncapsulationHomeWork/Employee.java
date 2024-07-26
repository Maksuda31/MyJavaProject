package EncapsulationHomeWork;
//Write a Java program to create a class called Employee with 
//private instance variables employee_id, employee_name, and employee_salary. 
//Provide public getter and setter methods to access and modify the id and name variables, 
//but provide a getter method for the salary variable that returns a formatted string.

public class Employee {
	private String employee_id;
	private String employee_name;
	private double employee_salary;
	
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public double getFormattedEmployee_salary() {
		return employee_salary;
	}
	public void setFormattedEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}
	
	public static void main(String[] args) {
		
		Employee ee= new Employee();
			ee.setEmployee_id("24AA01");
			ee.setEmployee_name("Jennifer");
			ee.setFormattedEmployee_salary(65000.67);
		
		System.out.println("Employee_ID: "+ee.getEmployee_id());
		System.out.println("Employee_Name: "+ee.employee_name);
		System.out.println("Employee_ID: "+ee.getFormattedEmployee_salary());
	}
}
