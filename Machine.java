
public class Machine implements Info {
	//class variables
	private int id =7;
	
	//class method
	public void start() {
		System.out.println("Machine Started");
	}

	//Interface methods
	public void showInfo() {
		
		System.out.println("Machine ID is: "+id);
		
		
	}

}
