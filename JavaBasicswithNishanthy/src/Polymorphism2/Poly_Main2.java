package Polymorphism2;

public class Poly_Main2 {

	public static void main(String[] args) {
		
		//overriding
		Vehicle2 v3= new Car2();
		v3.speedUp();
		Vehicle2 v4= new Bicycle2();
		v4.speedUp();

	}

}
