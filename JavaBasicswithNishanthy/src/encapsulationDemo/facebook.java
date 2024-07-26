package encapsulationDemo;

public class facebook {
	
	public String name= "Maksuda";
	private int age=25;
	protected String status="My friends and friends of friend can see my status";
	private String email="mak@gmail.com";
		
	private void Upload() {
		System.out.println("I am not going to share my age");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void name() {
		System.out.println("Maksuda");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	}

	

