package methods;

/*
 * @Author : Niraj Thagunna
 * Interview Questions - Methods - 11
 */

class Sample2 {
	
	void display() {
		return; // What after you write the return statement that will not be reachable
//		System.out.println("Java Course"); // Unreachable Code or Statement
	}
}

public class Problem11 {
	
	public static void main(String[] args) {
		
		Sample2 obj = new Sample2();
		obj.display();
		System.out.println("MongoDB Course");
	}
}

// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
// Unreachable code



