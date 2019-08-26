//New Class Robot
class Robot{
	
	// creating a method for demonstration
	public void speak(String text) {
		System.out.println(text);
	}
	// Creating another method for Robot class
	  public void jump(int height) {
		  System.out.println("Jumping: "+ height);
		    
	}
	  //Adding anothing method with multiple parameters
	  public void move (String direction, double distance) {
		  System.out.println("Moving: "+ distance + " in direction " + direction);
		  
	  }
	
}

public class App {

	public static void main(String[] args) {
		
	//Creating a Robo instance
		Robot sam = new Robot();
		// calling methods for robot class
		sam.speak("Hi, I'm Sam");
		// Demonstrating Jump method
		sam.jump(7);
		//Demonstrating move method
		sam.move("West", 12.2);
		
	}

}
