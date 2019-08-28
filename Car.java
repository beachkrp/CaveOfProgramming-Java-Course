
public class Car extends Machine{
	//Creating new method
	public void wipeWindow() {
		//Output
		System.out.println("Wiping");
	}
	//Creating new method
	public void showInfo() {
		
		System.out.println("Car  name: "+ name);
	}
	//Overriding inherited method
	public void start() {
		System.out.println("Car Started");
	}

}
