import java.util.ArrayList;

// Create class
class Machine {
	// Create a method
	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	public void  start() {
		System.out.println("Machine starting");
	}

}


// Create child class
class Camera extends Machine {
	
	
//Overriding method
	@Override
	public void start() {
	
		System.out.println("Camera Started");
	}
	// Override an inherited method
	@Override
	public String toString() {
		return "I am a Camera";
	}
	public void snap() {
		System.out.println("Photo taken");
	}
	
}

public class App {

	public static void main(String[] args) {
	//Create a generic variable
		ArrayList<Machine> list1 = new ArrayList();
		
		//populate the Arraylist
		list1.add(new Machine());
		list1.add(new Machine());
		
		//Create a generic variable
		ArrayList<Machine> list2 = new ArrayList();
				
				//populate the Arraylist
		list2.add(new Camera());
		list2.add(new Camera());

		//show list contents
		showList(list1);
		showList(list2);
		
		}
	//Declare another method
	public static void showList(ArrayList<? extends Machine> list0) {
		for(Machine value: list0) {
			//output
			System.out.println(value);
			//
			value.start();
		}
		
	}
	//Lower bound	
	public static void showList2(ArrayList<? super Camera> list0) {
		for(Object value: list0) {
			//output
			System.out.println(value);
			//
			
		}
		
	}

}	
