
public class App {

	public static void main(String[] args) {
		int value = 4;
		calculate(value);
	}
	
	public static void calculate(int value) {
		System.out.println(value);
		
		if (value == 1) {return ;}
		calculate(value-1);
	}

}
