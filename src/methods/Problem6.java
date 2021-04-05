package methods;

/*
 * @Author : Niraj Thagunna
 * Interview Questions - Methods - 6
 */

public class Problem6 {
	
	int i;
	
	public int print() {
		return i++; 
	}
	
	public static void main(String[] args) {
		
		Problem6 obj = new Problem6();
		
		System.out.print(obj.print()); // Post-Increment - at first return the value and after that assign the value
		System.out.print(obj.i); // After value assigned
	}
}

// Output : 01

