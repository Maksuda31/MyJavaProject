package Polymorphism;

public class Main {

	public static void main(String[] args) {
		 Animal a= new Animal();
		 a.sound();
		 Bird b= new Bird();
		 b.sound();
		 Cat c= new Cat();
		 c.sound();
		 
		 //overriding
		 Animal aa= new Bird();
		 aa.sound();
		 //overriding
		 Animal ab= new Cat();
		 ab.sound();
	
	}

}
