
public enum Animal {
   CAT("Tom"), DOG("Brutus"), MOUSE("Jerry"), DEER("Bambi");
	
	private String name;

	Animal(String name){
		
		this.name  = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
