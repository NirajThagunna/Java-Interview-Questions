package dateandtime;

import java.util.Date;

public class Problem1 {
	
	public static void main(String[] args) {
		
		// Creating date object
		Date date = new Date(2000, 03, 26);
		Date date1 = new Date();
		System.out.println(date.after(date1));
	}
}
