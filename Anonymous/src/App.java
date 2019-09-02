//Create parent class
class Machine{
	//creating class method
	public void start() {
		//Output
		System.out.println("Starting machine....");
		
	}
	
}
//Create interface
interface Plant {
	//Declaring method
	public void grow();
}

public class App {

	public static void main(String[] args) {
		//Create a class instance
		Machine machine1 = new Machine() {
			@Override
			public void start() {
				//Output
				System.out.println("Camera starting");
			}
		};
		//
		machine1.start();
		//Anonymous class from interface
		Plant plant1 = new Plant() {
			public void grow() {
				System.out.println("Growing......");
				
			}
			
		};
		plant1.grow();
	}

}
