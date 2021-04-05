package methods;

public class Main {
	
	public static void main(String[] args) {
		
		Problem3 obj = new Problem3();
		
		int result = obj.calculator(10, 5, '+');
		System.out.println(result);
		
		result = obj.calculator(10, 5, '-');
		System.out.println(result);

		result = obj.calculator(10, 5, '*');
		System.out.println(result);
		
		result = obj.calculator(10, 5, '/');
		System.out.println(result);
		
		result = obj.calculator(10, 5, '=');
		System.out.println(result);
	}
}
