
//Class definition
class Thing{
	public String name;
	public static String description;
}

public class Static {
	public static void main(String[] args) {
		
	
	//Create Thing objects
	
	Thing thing1 = new Thing();
	Thing thing2 = new Thing();
	
	//initlaize names for Things.
	thing1.name = "Bob";
	thing2.name = "Sue";
	
	//Output
	System.out.println(thing1.name);
	System.out.println(thing2.name);
	}
}
