import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		/////Before Java 5 /////
		//Declare an arraylist 
		ArrayList list = new ArrayList();
		
		//building array list
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		//retriece item from the ArrayList
		String fruit = (String)list.get(1);
		//Output
		System.out.println(fruit);
		
		////Modern Style
		//Create an ArrayList
		ArrayList<String> strings = new ArrayList();
		//build the list
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		//Retrieve data
		
		String animal = strings.get(1);
		
		//Output 
		System.out.println(animal);
	}

}
	