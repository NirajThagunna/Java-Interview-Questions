package switchStatements;

/*
 * @Author : Niraj Thagunna
 * Problems on the switch statements
 * Java Frequently Asked Interview Questions on Switch Statements -3
 */
public class Problem3 {

	public static void main(String[] args) {
		
		int gateMarks = 50;
		int myMarks = 50;
		switch( gateMarks ) {
		
//		case myMarks: // we can't use a variable as an expressions in any switch cases because the variable value is changeable
//			System.out.println("Scored 50 marks");
//			break;
			
		case 60:
			System.out.println("Scored 60 marks");
			break;
			
		case 70:
			System.out.println("Scored 70 marks");
			break;
			
		default:
			System.out.println("Marks not received");
		}
	}
}

/*
 * Output : Compilation Error 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 * case expressions must be constant expressions
 * 
 * The compiler builds switch cases as a very fast look-up table as COMPILE TIME
 * And variable value can change when a program runs, hence it is not allowed
 * 
 * If you do need them to be a variable, not constant, we should USE if/else statements instead of switch statements.
 * In switch statements we can't pass the conditions as an expressions
 * 
 * Switch cases make the more readability than if-else statements
 * 
 * The value for a case must be a constant(10) or a literal(are the characters - 'A').
 */







