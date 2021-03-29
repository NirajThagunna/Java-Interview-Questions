package ifElseStatements;

import java.util.Scanner;

/**
 * if-else Statements
 * Java Frequently Asked Interview Question -4
 * Java program to check the floating number.
 */
public class FloatingNumberCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any floating point number : ");
		float num = scan.nextFloat();
		
		if (num == 0.0f) 
			System.out.println("Zero");
		else if (num > 0.0f)
			System.out.println("Positive");
		else if (num < 0.0f)
			System.out.println("Negative");
		else if (num < 1)
			System.out.println("small");
		else
			System.out.println("large");
		
		scan.close();
	}
}
