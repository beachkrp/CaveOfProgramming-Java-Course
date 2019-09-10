//Declare a new class
class Person{
	private String name;
	private int id;
	//Constructor
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}




public class App {

	public static void main(String[] args) {
	
	//Create two instances of the person class	
	Person person1 = new Person ("Bob", 5);
	Person person2 = new Person ("Sue", 8);
	
	//Output  equality
	System.out.println(person1 == person2);
	// create a third object with the same values ahte first
	Person person3  = new Person("Bob", 5);
	System.out.println(person1 == person3);
	//still gives false
	
	System.out.println(person1.equals(person3));
	

	
	
	
	}

}
