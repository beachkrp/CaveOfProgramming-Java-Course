import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// Set the path to the file
		String fileName = "C:\\spamalot.txt";
		
		//Create a file object		
		File textFile = new File(fileName);
		
		//Create a Scanner object
		Scanner in = new Scanner(textFile);
		
		//Close the Scanner object
		in.close();
		
	}

}
