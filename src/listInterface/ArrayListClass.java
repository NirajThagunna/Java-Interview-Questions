package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// To create a dynamic array we use ArrayList
// Supports only objects data type not primitive data type
// Supports wrapper class

public class ArrayListClass {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(20);
		list.add(30);
		list.add(40);
		
		// adding an element at the particular index
		list.add(1, 100);
		
		// Changing the value
		list.set(3, 500);
		
		// removing an element
//		list.remove(0);
		
		Iterator<Integer> itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// for loop
		for (int i = 0; i < list.size(); i++) {
			if (i == 3) {
				list.set(i, 300);
			}
		}
		
		for (Integer item: list) {
			System.out.println(item);
		}
	}
}
