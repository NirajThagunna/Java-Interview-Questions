package listInterface;

import java.util.Vector;

// Synchronized 
// Thread Safe
public class VectorClass {

	public static void main(String[] args) {
		// Generic class
		Vector<Integer> v = new Vector<>();
		
		v.add(10);
		v.add(1, 200);
		
		System.out.println(v);
		
//		// default vector class
//		Vector v1 = new Vector();
//		v1.add(1);
//		v1.add("niraj Thagunna");
//		System.out.println(v1);
	}
}
