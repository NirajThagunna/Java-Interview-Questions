package userInput;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = scan.nextLine();
		
		System.out.println("Name : " + name);
		
		scan.close();
	}
}
