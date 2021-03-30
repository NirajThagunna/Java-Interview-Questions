package switchStatements;

/*
 * @Author : Niraj Thagunna
 * Problems on the switch statements
 * Java Frequently Asked Interview Questions on Switch Statements -2
 */
public class Problem2 {

	public static void main(String[] args) {
		
		int gateMarks = 50;
		switch( gateMarks ) {
		
		case 50:
			System.out.println("Scored 50 marks");
			break;
			
		case 60:
			System.out.println("Scored 60 marks");
			break;
			
//		case "Seventy": // This expression value is of String type, so we can't covert a string into int
//			System.out.println("Scored 70 marks");
//			break;
			
		default:
			System.out.println("Marks not received");
		}
	}
}

/*
 * Output : Compilation Error -> Compile time error
 * 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 * Type mismatch: cannot convert from String to int
 * 
 * Conclusion :- The value for a case must be of the same data type as the variable in the switch.
 */




