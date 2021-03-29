package ifElseStatements;

/**
 * if-else Statements
 * Java Frequently Asked Interview Question -1
 */
public class Problem1 {

	// Runtime Error -> main method is declared as private 
	// main method must be public always
	private static void main(String[] args) {
	// code here	
		{
			if (1 > 2) {
				System.out.println(" 1 is greater than 2");
			}
			else
				System.out.println(" 2 is greater than 1");
		}
	}

}

/*
 * A.) 1 is greater than 2
 * B.) 2 is greater than 1
 * C.) Compilation Error
 * D.) Runtime Error
*/

// Answer :- D.) Runtime Error -> main method is declared as private

/*
 * Error: Main method not found in class ifElseStatements.Problem1, please define the main method as:
 * public static void main(String[] args)
 * or a JavaFX application class must extend javafx.application.Application
 */





