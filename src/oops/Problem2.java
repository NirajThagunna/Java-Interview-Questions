package oops;

/*
 * Java OOPs Interview Questions -1
 * All the instance or member variables are loaded into the heap memory. And they are initialized when an instance of a 
 * class is created.
 */
class Default_values {
	
	public int x;
}

public class Problem2 {
	
	public static void main(String[] args) {
		
		Default_values obj = new Default_values();
		System.out.println("Output = " + obj.x);
	}
}
