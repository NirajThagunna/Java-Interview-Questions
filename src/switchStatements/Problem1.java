package switchStatements;

/*
 * @Author : Niraj Thagunna
 * Problems on the switch statements
 * Java Frequently Asked Interview Questions on Switch Statements -1
 */
public class Problem1 {
	
	public static void main(String[] args) {
		
		int gateMarks = 50;
		switch( gateMarks ) {
		
//		case 50:
//			System.out.println("Scored 50 Marks");
//			break;
		
		case 60:
			System.out.println("Scored 60 Marks");
			break;
			
		case 70:
			System.out.println("Scored 70 Marks");
			break;
			
//		case 50:
//			System.out.println("Scored 50 Marks again");
//			break;
			
		default:
			System.out.println("Marks not received");
		}
	}
}


/*
 * Output : Compilation Error -> Compile time error
 * 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
 * Duplicate case
 * Duplicate case
 * 
 * Conclusion : We can't have duplicate case labels in switch cases.
 */




