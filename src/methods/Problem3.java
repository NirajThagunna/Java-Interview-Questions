package methods;

// Design a calculator and expose one API(method) to add/subtract/multiply/divide 2 numbers.
public class Problem3 {
	
	// calculator() -> It acts as an API.
	public int calculator(int num1, int num2, char op) {
		
		int result = 0;
		
		switch( op ) {
		
		case '+':
			result = add(num1, num2);
			break;
			
		case '-':
			result = num1 - num2;
			break;
			
		case '*':
			result = num1 * num2;
			break;
			
		case '/':
			if (num2 != 0) {
				result = num1/num2;
			}
			break;
			
		default:
			System.out.println("Invalid input!");
		}
		
		return result;
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
