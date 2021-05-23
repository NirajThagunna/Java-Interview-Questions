package listInterface;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

public class AbstractListClass {

	public static void main(String[] args) {
		AbstractList<String> aList = new ArrayList<>();
		
		aList.add("Niraj");
		aList.add("Thagunna");
		
		System.out.println(aList);
		
		AbstractList<Integer> list = new LinkedList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
	}
}
