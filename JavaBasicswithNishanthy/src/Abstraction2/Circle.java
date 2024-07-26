package Abstraction2;

public class Circle extends Shape {
	//Area=p*radius square, Perimeter=2*p*radious; pi=3.14              
	
	double radious;
	double pi=3.14;
	
	public Circle(double r) {
		this.radious=r;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of Circle : "+pi*radious*radious);
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of a circle: "+2*pi*radious);
		
	}
	
}
