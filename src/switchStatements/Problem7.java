package switchStatements;

/*
 * @Author : Niraj Thagunna
 * Problems on the switch statements
 * Java Frequently Asked Interview Questions on Switch Statements -7
 */
public class Problem7 {
	
	public static void main(String[] args) {
		
		int dayWeek = 2;
		switch( dayWeek ) {
		
		case 1:
			System.out.println("Sunday");
			break;
			
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thursday");
			break;
			
//		case "Friday":
//			System.out.println("Friday");
//			break;
			
		default:
			System.out.println("Weekend");
		}
	}
}

/*
 * Output : Compilation Error
 * 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 * Type mismatch: cannot convert from String to int
 * 
 * case label data type must match with the switch data type.
 */





