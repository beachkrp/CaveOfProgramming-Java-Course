
public class App {

	public static void main(String[] args) {
		
		//Declare an integer value
		short shortValue = 335;
		int intValue = 888;
		byte byteValue = 20;
		long longValue = 23456;
		
		float floatValue  = 88834.9f;
		double doubleValue = 32.4;
		
		//Check MAX_VALUE
		System.out.println(Byte.MAX_VALUE);
		
		//casting
		intValue = (int)longValue;
		
		System.out.println("The intValue is " + intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		byteValue = (byte)129;
		System.out.println(byteValue);
		
	}

}
