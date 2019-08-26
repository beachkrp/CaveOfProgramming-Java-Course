class Frog {

	String name;
	int age;
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
		wb.age = 1;
		wb.name = "Bertie";

		System.out.println(wb.getName());

	}

}
