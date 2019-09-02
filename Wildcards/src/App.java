import java.util.ArrayList;
// Create class
class Machine {

	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	
}
//Create child class
class Camera extends Machine {
	
	
}


public class App {
	@Override
	public String toString() {
		return "App [toString()=" + super.toString() + "]";
	}
	public static void main(String[] args) {
	//Create a generic variable
		ArrayList<Machine> list = new ArrayList();
		
		//populate the Arraylist
		list.add(new Machine());
		list.add(new Machine());
		
		//show list contents
		showList(list); 
		
		}
	//Declare another method
	public static void showList(ArrayList<Machine> list) {
		for(Machine value: list) {
			//output
			System.out.println(value);
		}
		
	}

}
