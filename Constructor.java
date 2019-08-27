class Machine {
	//Class variable
	private String name;
	private int code;
	// Class constuctor

	public Machine() {
		
		//calling default constructor
		this("Arnie", 0);
		System.out.println("Constructor running");
	}
	//  Constructer with a name input
	public Machine(String name) {
		//default constructor
		this(name, 0);
		System.out.println("Second Constructor running");
		
		 
	}
	//Constructor with a name input and a code input
	public Machine(String name, int code) {
		System.out.println("Third Constructor running");
		this.name = name;
		this.code = code;
		
	}

}

public class Constructor {

	public static void main(String[] args) {
		// Create a Machine instance
		Machine machine1 = new Machine();

		//Another machine instance.
		Machine machine2 = new Machine("Bertie");
		
		//Create another instance
		
		Machine machine3 = new Machine("Chalky", 7);
	}
}
