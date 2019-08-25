class Person {
	//
	String name;
	int age;
	
	
	
}

public class Application {

	public static void main(String[] args) {
	Person person1= new Person();
	
	person1.name = "Joe";
	person1.age = 37;
	
	Person person2 = new Person();
	person2.name = "Sarah";
	person2.age = 20;
	
	System.out.println(person1.name);
	

	}

}
