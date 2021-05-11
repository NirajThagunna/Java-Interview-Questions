package arrays;

import java.util.Arrays;

/*
 * @Author: Niraj Thagunna
 * An array class in the Java is a part of the collection framework that contains in the package java.util package.
 * Array class extends the Class objects
 * Array class provides all the static methods so we don't need to create an instance of an array
 */

// Methods of an Array Class

public class ArraysClass {
	
	public static void main(String[] args) {
		
		// Creating an array
		// Array literal
		int[] arr = {1, 2, 3, 4, 5};
		
		// 1. Arrays.asList(arr)
		
		// It will converts the array elements into the List
		// Convert an array into the List
		System.out.println("Integer Array as List : " + Arrays.asList(arr));
		
		// 2. Arrays.binarySearch(int[] arr, int element)
		// It uses the Binary Searching Algorithm.
		// It only works in the sorted array only.
		System.out.println(Arrays.binarySearch(arr, 4));
		
		// 3. binarySearch(int[] arr, int fromIndex, int toIndex, int key)
		// It searches an element in the particular range of the array
		System.out.println(Arrays.binarySearch(arr, 1, 3, 5));
		
		int[] arr1 = {1, 2, 3};
		
		// 4. compare(array1, array2)
		// return 0 - If all the elements of both the arrays are equal
		// else returns number of the elements that don't match 
		System.out.println("Comparing : " + Arrays.compare(arr, arr1));
		
		// 5. toString(arr)
		// returns a string representation of the contents of the specified array.
		System.out.println("Array is : " + Arrays.toString(arr));
		
		// 6. copyOf(original Array, newLength)
		int[] newArray = Arrays.copyOf(arr, 7);
		System.out.println("New Array : " + Arrays.toString(newArray));
		
		// 7. copyOfRange(arr, from, end)
		// It will return a new array by copying all the elements of the original array into the new array in the specified range
		System.out.println("Range array : " + Arrays.toString(Arrays.copyOfRange(arr, 1, 3)));
		
		// 8. equals(arr1, arr2)
		System.out.println("Equality : " + Arrays.equals(arr, arr1));
		
		// 9. deepEquals(arr1, arr2)
		// Get the Arrays
        int intArr[][] = { { 10, 20, 15, 22, 35 } };
  
        // Get the second Arrays
        int intArr1[][] = { { 10, 15, 22 } };
  
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.deepEquals(intArr, intArr1));
        
        // 10. hashCode(arr)
        // Returns a hash code based on the contents of the specified array
        System.out.println("HashCode: " + Arrays.hashCode(arr));
        
        // deepEquals(Object[] a1, Object[] a2)
        // Returns true if the two specified arrays are deeply equal to one another.
        
        // static int	deepHashCode(Object[] a)
        // Returns a hash code based on the "deep contents" of the specified array.
        
        // static String	deepToString(Object[] a)
        // Returns a string representation of the "deep contents" of the specified array.
        
        // 11. fill(arr, value)
        // This method assigns this fillValue to each index of this Arrays.
        Arrays.fill(arr, 13);
        System.out.println("Fill value to entire array : " + Arrays.toString(arr));
		
        
        // 12. fill(arr, from, to, fillValue)
        // fill the numbers in the range
        Arrays.fill(arr, 1, 3, 12);
        System.out.println("Range fill : " + Arrays.toString(arr));
        
        // 13. sort(arr)
        // It will sorts all the elements of an array in the ascending order
        int[] array = {76, 4, 100, 0, 5, 2};
//        Arrays.sort(array);
        Arrays.sort(array, 1, 4); // sorts all the elements in the particular range
        System.out.println("Sorted array is : " + Arrays.toString(array));
	}
}





