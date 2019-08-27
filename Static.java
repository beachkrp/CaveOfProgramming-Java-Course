
//Class definition
class Thing{
	public String name;
	public static String description;
}

public class Static {
	public static void main(String[] args) {
	
	//Set description
	Thing.description = "I am a thing";
	System.out.println(Thing.description);
	
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
	}
	

}
