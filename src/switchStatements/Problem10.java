package switchStatements;

/*
 * @Author : Niraj Thagunna
 * Problems on the switch statements
 * Java Frequently Asked Interview Questions on Switch Statements -10
 * Given two numbers, write a nested switch program to print values of these two numbers. Suppose numbers will be
 * one of the possible values(1,2,3).
 */
public class Problem10 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		switch( a ) {
		
		case 1:
			System.out.println("Value of a is 1");
			
			switch( b ) {
			
			case 1:
				System.out.println("Value of b is 1");
				break;
			case 2:
				System.out.println("Value of b is 2");
				break;
			case 3:
				System.out.println("Value of b is 3");
				break;
			default:
				System.out.println("invalid value for b!");
				break;
			}
			break;
			
		case 2:
			System.out.println("Value of a is 2");
			break;
			
		case 3:
			System.out.println("Value of a is 3");
			break;
			
		default:
			System.out.println("Invalid Number!");
		}
	}
}
