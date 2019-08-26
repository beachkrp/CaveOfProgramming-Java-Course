//New Class Robot
class Robot{
	
	// creating a method for demonstration
	public void speak(String text) {
		System.out.println(text);
	}
	  public void jump(int height) {
		  System.out.println("Jumping: "+ height);
		  
	  
	}
	
}

public class App {

	public static void main(String[] args) {
		
	//Creating a Robo instance
		Robot sam = new Robot();
		sam.speak("Hi, I'm Sam");
		sam.jump(7);
		
	}

}
