import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("reading objects ....  ");
		
		try (FileInputStream fi =  new FileInputStream("people.bin")){
			
			ObjectInputStream  oi = new ObjectInputStream(fi);
			
			Person person1 = (Person)oi.readObject(); 
			System.out.println(person1);
			
			Person person2 = (Person)oi.readObject(); 
			System.out.println(person2);
			
			Person[] people =  (Person[])oi.readObject();
			
			
			
			for (Person person : people) {
				System.out.println(person);
			}
	
			ArrayList<Person> peopleList = (ArrayList<Person>)oi.readObject();
			
			for (Person person : peopleList) {
				System.out.println(person);}
			
			int num = oi.readInt();
			
			for (int i = 0; i<num; i++) {
				
				Person person = (Person)oi.readObject();
				System.out.println(i +"    "  +person);
				
			}
			
		
			
			
			
			oi.close();
		}
		
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
