package dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocaledateClass {
	
	public static void main(String[] args) {
		
		// LocaleDate
//		LocalDate localDate = LocalDate.now();
//		System.out.println(localDate);
		
		// LocalDateTime
		LocalDateTime dateTime = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYYY");
		
		// format the given date
		System.out.println(formatter.format(dateTime));
	}
}
