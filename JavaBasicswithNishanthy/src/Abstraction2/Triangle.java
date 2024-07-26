package Abstraction2;

public class Triangle extends Shape {
	int side1;
	int side2;
	int side3;
 
 	public Triangle(int a, int b, int c) {
 		this.side1=a;
 		this.side2=b;
 		this.side3=c;	
 	}
 
	@Override
	public void calculateArea() {
		System.out.println("Area of a Triangle :"+(side1+side2+side3));
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of a Triangle : "+(side1+side2+side3)/2);
		
	}

}
