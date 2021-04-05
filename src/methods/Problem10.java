package methods;

/*
 * @Author : Niraj Thagunna
 * Interview Questions - Methods - 10
 * When you create the two objects then they will have different copy of memory location.
 * If the one object change will affects the other one.
 */

class Sample1 {
	
	int x = 10;
	
	void display() {
		System.out.print(x);
	}
}

public class Problem10 {
	
	public static void main(String[] args) {
		
		Sample1 obj1, obj2;
//		++obj1.x;
//		++obj2.x;
//		
//		obj1.display();
//		obj2.display();
	}
}

// Output : Compilation error -> The local variables obj1 and obj2 might not have been initialized


