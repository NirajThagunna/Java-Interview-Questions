package ifElseStatements;

/**
 * if-else Statements
 * Java Frequently Asked Interview Question -3
 */
public class Problem3 {

	public static void main(String args[]) {
		
		int x = 1;
		// if( x ) // you are trying to use boolean i.e. if x is 1 but x is integer
			System.out.println("True");
		// else
			System.out.println("False");
	}
}

/*
 * Output :
 * 1) True
 * 2) False
 * 3) Error
 */

// Answer :- 3) Error -> Compilation Error -> Compile time error

/*
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 * Type mismatch: cannot convert from int to boolean
 * at JavaInterviewQuestions/ifElseStatements.Problem3.main(Problem3.java:12)
*/





