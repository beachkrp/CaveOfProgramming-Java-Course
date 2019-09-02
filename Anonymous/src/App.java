class Machine{
	public void start() {
		
		System.out.println("Starting machine....");
		
	}
	
}

public class App {

	public static void main(String[] args) {
		//Create a class instance
		Machine machine1 = new Machine() {
			@Override
			public void start() {
				
				System.out.println("Camera starting");
			}
		};
		//
		machine1.start();
		

	}

}
