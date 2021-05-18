package wrapperClasses;

// The method to convert a Wrapper class object into the their corresponding primitive data types.
// Automatic conversion of wrapper type into it's corresponding primitive type is known as Unboxing.
// Also known as Auto-Unboxing
public class Unboxing {
	
	public static void main(String[] args) {
		
		// creating a Integer class Object which holds int value
		Integer x = Integer.valueOf(10);
		
		// Fetching primitive from Integer class object
		// Converting a wrapper class object into the primitive data type
		int y = x.intValue();
		
		// Another way to convert the wrapper object type into the primitive type
		// here, in this case a Compiler will write x.intValue() internally.
		// x is an object 
		// But z is not an object
		int z = x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
