
public class InheritanceApp {

	public static void main(String[] args) {
		//Creating a Machine instance.
		Machine mach1 = new Machine();
		
		mach1.start();
		mach1.stop();
		
		//Create Car object
		Car car1 = new Car();
	
		car1.start();
	
		car1.stop();
		//wiping
		car1.wipeWindow();
		
		

	}

}
