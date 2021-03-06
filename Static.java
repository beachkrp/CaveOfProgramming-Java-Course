
//Class definition
class Thing{
	
	public final static int LUCKY_NUMBER = 318765;
	
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		
		//set id
		id = count;
		//Increment
		count++;
	}
	//Create a method to show the name
	public void showName() {
		System.out.println("Object id "  + id  + ", " + description + " :"+  name);
	}
	//creating a static method
	public static void showInfo() {
		System.out.println(description);
	}
}

public class Static {
	public static void main(String[] args) {
	
	//Set description
	Thing.description = "I am a thing";
	System.out.println(Thing.description);
	
	//Output the number of things
	System.out.println("Before creating anything count is   "+ Thing.count);
	
	//using static method showInfo
	Thing.showInfo();
	//Create Thing objects
	
	Thing thing1 = new Thing();
	Thing thing2 = new Thing();
	
	//initlaize names for Things.
	thing1.name = "Bob";
	thing2.name = "Sue";
	
	
	
	//Output
	System.out.println(thing1.name);
	System.out.println(thing2.name);
	
	System.out.println(thing1.description);
	
	//show names
	 
	thing1.showName();
	thing2.showName();
	
	//
	System.out.println(Math.PI);
	
	System.out.println(Thing.LUCKY_NUMBER);
	
	//Output the number of things
	System.out.println("The number of thing creat " + Thing.count);
	
	}
	

}
