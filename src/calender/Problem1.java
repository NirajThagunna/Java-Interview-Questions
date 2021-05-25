package calender;

import java.util.Calendar;

public class Problem1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		// get method
		System.out.println(cal.get(Calendar.DATE));
		
		// getMaximum
		System.out.println(cal.getMaximum(Calendar.WEEK_OF_MONTH));
		
		// user defined date
		cal.add(Calendar.DATE, -15);
		System.out.println("15 days ago : " + cal.getTime());
	}
}
