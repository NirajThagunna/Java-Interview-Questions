package methods;

/*
 * Interview Questions on Methods -1
 */

class Number {
	public int x;
}

public class Problem1 {
	
	public static void swap(Number a, Number b) {
		Number temp = new Number();
		temp.x = a.x;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		Number i = new Number();
		i.x = 10;
		Number j = new Number();
		j.x = 20;
		
		swap(i, j);
		System.out.println("i = " + i.x + ", j = " + j.x);
	}
}
