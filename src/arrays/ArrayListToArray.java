package arrays;

import java.util.ArrayList;
import java.util.List;

// Java program to convert an ArrayList into an Array
// Object[] toArray()

public class ArrayListToArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Object[] objects = list.toArray();
		
		// Printing array of objects
		for (Object object: objects) {
			System.out.println(object);
		}
	}
}
