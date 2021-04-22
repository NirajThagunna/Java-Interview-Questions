package strings;

// Program for reversing a string by using a StringBuffer
public class StringBufferClass {
	
	public static void main(String[] args) {
		String str = "Niraj Thagunna";
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reversed String is : " + sb.reverse());
	}
}
