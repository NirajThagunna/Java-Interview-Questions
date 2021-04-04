package methods;

/*
 * Interview Questions on Methods -2
 * A method can return primitives as well as an object type variable.
 */

class Double {
	public int x;
	
	public Double doubleIt() { // Double is object type variable
		Double temp = new Double();
		temp.x = 2 * x;
		return temp;
	}
}

public class Problem2 {
	
	public static void main(String[] args) {
		Double i = new Double();
		i.x = 10;
		Double d = i.doubleIt();
		System.out.println("d = " + d.x);
	}
}
