package switchStatements;

/*
 * @Author : Niraj Thagunna
 * Problems on the switch statements
 * Java Frequently Asked Interview Questions on Switch Statements -6
 */
public class Problem6 {

	public static void main(String[] args) {
		
		String dreamCompany = "Google";
		switch( dreamCompany ) {
		
//		case "Google":
//			System.out.println("Google is my dream company");
//			break;
			
		case "Amazon":
			System.out.println("Amazon is my dream company");
			break;
			
		case "Microsoft":
			System.out.println("Microsoft is my dream company");
			break;
			
		default:
			System.out.println("I am ready to work with any of these companies");
			break;
			
//		case "Google":
//			System.out.println("Google is my dream company");
//			break;
		}
	}
}

/*
 * Output : Compilation Error 
 * Duplicate case
 * 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
 * Duplicate case
 * Duplicate case
 */





