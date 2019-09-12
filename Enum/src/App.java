
public class App {
	
	
	public static void main(String[] args) {
		
		//Declaring a variable of an enum type
		Animal animal = Animal.CAT;
		
		// Estabilsh switch structure.
		switch (animal) {
		
		case DOG:
			System.out.println("DOG");
			break;

		case CAT:
			System.out.println("CAT");
			break;

		case MOUSE:
			System.out.println("MOUSE");
			break;
		case DEER:
			System.out.println("DEER");
			break;
		default:
			break;
		
		}
		
		System.out.println(Animal.DOG.getClass());
	}

}
