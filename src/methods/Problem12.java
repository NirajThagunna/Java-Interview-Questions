package methods;

/*
 * @Author : Niraj Thagunna
 * Interview Questions - Methods - Problem - 12
 */

class Sample3 {
	
	int n = 100;
	
	void display(int n) {
		System.out.print(n);
		n = n; // The assignment to variable n has no effect with the instance variable
		System.out.print(n);
	}
}

public class Problem12 {
	
	public static void main(String[] args) {
		
		Sample3 obj = new Sample3();
		System.out.print(obj.n);
		obj.display(30);
		System.out.print(obj.n);
	}
}
