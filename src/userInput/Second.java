package userInput;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int a = scan.nextInt(); // When you enter the integer value and press the enter button/key then it will take \n
		// as the newLine and then
		
		System.out.println("Enter your name : ");
		String name = scan.nextLine(); // nextLine() -> will take the \n neLine() as input so it will not taking any input

		System.out.println("Number : " + a + "\nName : " + name);

		scan.close();
	}
}
