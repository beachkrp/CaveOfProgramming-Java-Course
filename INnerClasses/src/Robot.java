
public class Robot {

	private int id;

	// Declare an inner class
	private class Brain {
		public void think() {
			System.out.println("Robot "+id  + " is thinking");
		}
	}

	static class Battery{
		public void charge() {
			System.out.println("Battery charging ...");
		}
	}	
	// Declare a constructor
	public Robot(int id) {

		this.id = id;
	}

	public void start() {
	

	// Compose a brain
	Brain brain = new Brain();

	System.out.println("Starting  robot "+id);
	brain.think();
}

}
