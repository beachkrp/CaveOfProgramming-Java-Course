package world;

public class Plant {
	//Bad practice
	//Declare instance variable
	public String name;
	
	//Acceptable practice
	//Static Instance variable
	public final static int ID = 8;
	//private variable
	private String type;
	
	protected String size;
	// Create a constructor
	
	int height;
	
	public Plant() {
		name = "Ficus";
		type = "plant";
		size = "large";
		height = 7;
	}
	
}
