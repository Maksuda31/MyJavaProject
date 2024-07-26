package encapsulationDemo;

public class Main extends facebook {

	public static void main(String[] args) {
		
		facebook f= new facebook();
		f.getAge();
		f.setAge(35);
		System.out.println("Age"+f.getAge());
		
		System.out.println(f.getEmail());
	
		
		

	}

}
