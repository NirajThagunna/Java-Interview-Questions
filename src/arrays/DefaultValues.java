package arrays;

// If you haven't assign a value in the array then it will assign a default value to the compiler - JVM
public class DefaultValues {
	
	public static void main(String[] args) {
		int[] arr = new int[3];
		
		for (int item : arr) {
			System.out.print(item + " ");
		}
	}

}
