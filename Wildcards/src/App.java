import java.util.ArrayList;
// Create class
class Machine {
	
	
}
//Create child class
class Camera extends Machine {
	
	
}


public class App {
	public static void main(String[] args) {
	//Create a generic variable
		ArrayList<String> list = new ArrayList();
		
		//populate the Arraylist
		list.add("one");
		list.add("two");
		
		//show list contents
		showList(list);
		
		}
	//Declare another method
	public static void showList(ArrayList<String> list) {
		for(String value: list) {
			//output
			System.out.println(value);
		}
		
	}

}
