package wrapperClasses;

// Java program to convert a primitive data type into the Wrapper Class object
// A primitive data type is allocated in the Stack memory where as 
// The Wrapper class Object will be allocated in the Heap memory because an object is created in the case of Wrapper Class.

// Primitive data types are more efficient than the Object type

public class Problem1 {

	public static void main(String[] args) {
		
		int num = 50;
		
		// Converting the primitive data type into the wrapper class object
		Integer wrapperObj = Integer.valueOf(num);
		
		// Another method to convert a primitive type into the Wrapper
//		Integer wrapperObj = new Integer(num);
		
		System.out.println(num);
		System.out.println(wrapperObj);
		
		// checks the data type of a variable
		// for the reference data type variable we use the instanceOf operator
		if (wrapperObj instanceof Integer)
			System.out.println("True");
		else 
			System.out.println("False");
		
		// for the primitive data type we can use var_name.getClass().getName();
		// but this method is callable by objects only. so at first we need to convert a primitive data type into the Object
		System.out.println(((Object)num).getClass().getName());
	}

}
