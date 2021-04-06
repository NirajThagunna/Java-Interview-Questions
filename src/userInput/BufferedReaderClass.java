package userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Taking the input from the user
public class BufferedReaderClass {

	public static void main(String[] args) throws IOException {

		// Enter data using BufferedReader
		// BufferedReader -> Reads text from a character-input stream, buffering characters so as to provide for the 
		// efficient reading of characters, arrays, and lines. 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Reading the data using readLine() method
		System.out.print("Name : ");
		String name = reader.readLine();

		System.out.println(name);
		
		reader.close();
	}
}
