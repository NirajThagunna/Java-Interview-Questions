package ifElseStatements;

import java.util.Scanner;

/**
 * if-else Statements
 * Java Frequently Asked Interview Question -4
 * Java program to check if a number is even or odd.
 */
public class EvenOddNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) 
			System.out.println(num + " is an even number.");
		else 
			System.out.println(num + " is a odd number.");
		
		scan.close();
	}
}
