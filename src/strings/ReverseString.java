package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Program to reverse a string
public class ReverseString {
	
	public static String reverse(String str) {
		
		char[] stringArray = str.toCharArray(); // Convert a string to an character array
		
		for (int i = 0, j = (stringArray.length - 1); i <= j; i++, j--) {
			char temp = stringArray[i];
			stringArray[i] = stringArray[j];
			stringArray[j] = temp;
		}
		
		return String.valueOf(stringArray); // Convert an character array into a String
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter any String : ");
			String str = reader.readLine();
			
			System.out.println("Reversed String is : " + reverse(str));
		}
		catch (Exception ex) {
			System.out.println("Error : \n" + ex.getMessage());
		}
	}
}
