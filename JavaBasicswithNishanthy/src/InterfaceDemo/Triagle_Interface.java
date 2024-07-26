package InterfaceDemo;

public class Triagle_Interface implements DemoInterface, colour {

	@Override
	public void colour() {
		System.out.println("green");
		
	}

	@Override
	public void shape() {
		System.out.println("Square");
		
	}

}
