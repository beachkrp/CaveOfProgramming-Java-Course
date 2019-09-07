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
		
		//Read in the first line
		int value = in.nextInt();
		System.out.println("The value is:"  + value);
		//Discard carriage return
		in.nextLine();
		
		//
		int lineNumber = 2;
		//read in the file contents
		while(in.hasNextLine()) {
			
			String line = in.nextLine();
			
			System.out.println(lineNumber +" : " + line);
			lineNumber++;
		}
		
		//Close the Scanner object
		in.close();
		
	}

}
