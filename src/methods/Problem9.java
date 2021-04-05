package methods;

/*
 * @Author : Niraj Thagunna
 * Interview Questions - Methods - 9
 * When you create the two objects then they will have different copy of memory location.
 * If the one object change will affects the other one.
 */

class Sample {
	
	int x = 10;
	
	void display() {
		System.out.print(x);
	}
}

public class Problem9 {
	
	public static void main(String[] args) {
		
		Sample obj1 = new Sample();
		Sample obj2 = new Sample();
		
		++obj1.x;
		
		obj1.display();
		obj2.display();
	}
}
