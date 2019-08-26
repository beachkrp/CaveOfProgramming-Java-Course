class Frog {

	private String name;
	private int age;
	// Create setters
	public void setName(String newName) {
		name = newName;
	}
	public void setAge(int newAge) {
		
		age= newAge;
	}
	
	
	// Create getters for example
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class App {

	public static void main(String[] args) {
		// initiaze Frog
		Frog wb = new Frog();
		//wb.age = 1;
		wb.setAge(1);
		wb.setName("Bertie");

		System.out.println(wb.getName());

	}

}
