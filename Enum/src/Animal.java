
public enum Animal {
	CAT("Tom"), DOG("Brutus"), MOUSE("Jerry"), DEER("Bambi");

	private String name;

	// Adding constructor to Enum type
	Animal(String name) {

		this.name = name;
	}

	//// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {

		return "This animal is called " + name;
	}

}
