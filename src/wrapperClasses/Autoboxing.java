package wrapperClasses;

// Automatic conversion of primitive data types to the object of their corresponding wrapper classes is known as Autoboxing.
// e.g. conversion of int to Integer, float to Float, double to Double etc...

public class Autoboxing {
	
	public static void main(String[] args) {
		
		// primitive
		int x = 10;
		
		// Converting primitive into the corresponding wrapper classes
		Integer y = Integer.valueOf(x);
		
		// Another method
		// Autoboxing
		Integer z = x; // object is created
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
