package EncapsulationHomeWork;

//3.Write a Java program to create a class called Rectangle with 
//private instance variables length and width. 
//Provide public getter and setter methods to access and modify these variables.

public class Rectangle3 {
	private double length;
	private double width;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public static void main(String[] args) {
		
		Rectangle3 r= new Rectangle3();
			r.setLength(34.5);
			r.setWidth(20.5);
			System.out.println("Length: "+r.getLength());
			System.out.println("Width: "+r.getWidth());
		
	}
}
