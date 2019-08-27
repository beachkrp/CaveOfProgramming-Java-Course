class Machine {
	//Class variable
	private String name;
	// Class constuctor

	public Machine() {
		System.out.println("Constructor running");

		name = "Arnie";
	}
	
	public Machine(String name) {
		
		this.name = name; 
	}

}

public class Constructor {

	public static void main(String[] args) {
		// Create a Machine instance
		Machine machine1 = new Machine();

		//Another machine instance.
		Machine machine2 = new Machine("Bertie");
	}
}
