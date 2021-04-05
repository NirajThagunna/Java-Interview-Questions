package methods;

/*
 * @Author : Niraj Thagunna
 * Interview Questions - Methods - Problem - 13
 */

class Sample4 {
	
	int n = 100;
	
	void display(int n) {
		System.out.print(n);
		this.n = n;
		System.out.print(n);
	}
}

public class Problem13 {
	
	public static void main(String[] args) {
		
		Sample3 obj = new Sample3();
		System.out.print(obj.n);
		obj.display(30);
		System.out.print(obj.n);
	}
}
