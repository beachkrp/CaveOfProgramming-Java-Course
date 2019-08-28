
public class Person implements Info{
	
	private String name;
	
	
// Constructor	
	public Person(String name) {
		this.name = name;
	}



	public void greet() {
		
		System.out.println("Hello");
	}



	@Override
	public void showInfo() {
		System.out.println("Person's name is: " + name);
		
	}

}
