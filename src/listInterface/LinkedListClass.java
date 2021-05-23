package listInterface;

import java.util.LinkedList;

// Linked List Class

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<Integer> lList = new LinkedList<>();
		
		// Adding an elements
		lList.add(20);
		lList.add(30);
		
		// adding an element at particular index
		lList.add(1, 200);
		
		// add first
		lList.addFirst(5);
		
		// add Last
		lList.addLast(500);
		
		// Changing an element
//		lList.set(0, 100);
		
		// removing an elements
//		lList.remove();
//		lList.remove(1);
		
		System.out.println(lList);
		
		for (Integer item: lList) {
			System.out.println(item);
		}
		
		System.out.println(lList.contains(5));
		// getting the element at the particular position index
		System.out.println(lList.get(1));
		
		lList.push(1000);
		lList.pop();
		System.out.println(lList);
		
		System.out.println(lList.toString());
		Object[] obj = lList.toArray();
		System.out.println(obj.toString());
	}
}
