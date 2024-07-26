package Abstraction2;

public class Main2 {

	public static void main(String[] args) {
		
		Circle C= new Circle(3.4);
		C.calculateArea();
		C.calculatePerimeter();
		
		Triangle T= new Triangle(2,3,4);
		T.calculateArea();
		T.calculatePerimeter();

	}

}
