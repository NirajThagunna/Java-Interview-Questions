package strings;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		s = s.trim();
		String[] arrOfStr = s.split("A-Za-z !,?._'@+");

		if (s.length() <= 0 || s.length() > 400000) {
			System.out.println(0);
		}
		else {
			System.out.println(arrOfStr.length);
		} 

		for (String item : arrOfStr) {
			System.out.println(item);
		}
		scan.close();
	}
}
