package ifElseStatements;

/**
 * if-else Statements
 * Java Frequently Asked Interview Question -2
 */
public class Problem2 {
	
	public static void main(String[] args) {
		
		boolean flag = true;
		if( flag ) {
			System.out.println("Flag is set to true");
		}
		else
			System.out.println("Flag is set to false"); // Only this line is the part of else statements
		    System.out.println("Printing Flag variable"); // Not the part of the else block even if we used indentation.
		    // It will treats as a new separate line.
		    // If we had used {} with else block then only both the statements are the part of the else statement
	}
}


/*
 * Output : 
 * Flag is set to true
 * Printing Flag variable
*/





