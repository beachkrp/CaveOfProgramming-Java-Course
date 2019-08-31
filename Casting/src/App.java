//Create a class
class Machine{
	//Create a method
	public void start() {
		System.out.println("Machine started");	
	}
}
//Create a child class
class Camera extends Machine{
	//Override the method
	public void start() {
	System.out.println("Camera started");	
	}
	//Create another method
	public void snap() {
		System.out.println("Photo taken");
	}
}



public class App {

	public static void main(String[] args) {
		
		//Declare an integer value
		short shortValue = 335;
		int intValue = 888;
		byte byteValue = 20;
		long longValue = 23456;
		
		float floatValue  = 88834.9f;
		double doubleValue = 32.4;
		
		//Check MAX_VALUE
		System.out.println(Byte.MAX_VALUE);
		
		//casting
		intValue = (int)longValue;
		
		System.out.println("The intValue is " + intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		byteValue = (byte)129;
		System.out.println(byteValue);
		
		//Create instances of the classes
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		//Demostrate the methodds.
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//Upcasting
		Machine machine2 = new Camera();
		machine2 = camera1;
		machine2.start();
		
		//Downcasting
		
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.snap();
		
		
		
	}

}
