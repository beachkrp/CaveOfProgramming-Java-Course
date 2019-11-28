import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		
		System.out.println("Writing Objects....");
		
		Person mike = new Person(543, "Mike");
		Person sue  = new Person(123, "Sue");
		
		// Creating arrays of Object
		
		Person[] people = {new Person(1, "Anna"), new Person(99, "Candi"), new Person(14, "Bob")}; 
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		System.out.println(mike);
		System.out.println(sue);
		
		try (FileOutputStream fs = new FileOutputStream("people.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(mike);
			os.writeObject(sue);
			os.writeObject(people);
			os.writeObject(peopleList);
			
			os.writeInt(peopleList.size());
			
			for(Person person :peopleList) {
				os.writeObject(person);
			}
			
			os.close();
		}
		
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
