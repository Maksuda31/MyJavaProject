package EncapsulationHomeWork;

//5. Write a Java program to create a class called Circle with a 
//private instance variable radius. Provide public getter and setter methods
//to access and modify the radius variable. 
//provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
public class Circle {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void calculateArea() {
		System.out.println("area: "+3.14*radius*radius);
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter :"+2*3.14*radius);
	}
	

	public static void main(String[] args) {
		Circle cc= new Circle();
		cc.setRadius(6.7);
		cc.calculateArea();
		cc.calculatePerimeter();
	}
}
