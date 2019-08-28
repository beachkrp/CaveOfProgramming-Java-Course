
public class Interfaces {
	
	public static void main(String[] args) {
		// Create a machine instance
		Machine mach1 = new Machine();
		mach1.start();
		
		//Create a Person instance
		
		Person person1 =  new Person("Bob");
		person1.greet();
		
		//Show interface usage
		
		mach1.showInfo();
		person1.showInfo();
		
		//Create info object
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 =  person1;
		info2.showInfo();
		
		//
		outputInfo(mach1);
	}




private static void outputInfo(Info info) {
	
 info.showInfo();	
}

}