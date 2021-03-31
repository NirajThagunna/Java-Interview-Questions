package switchStatements;

/*
 * @Author : Niraj Thagunna
 * Problems on the switch statements
 * Java Frequently Asked Interview Questions on Switch Statements -8
 */
public class Problem8 {

	public static void main(String[] args) {
		
		String dreamCompany = "Apple";
		switch( dreamCompany ) {
		
		case "Google":
			System.out.println("Google is my dream company");
			break;
			
		case "Amazon":
			System.out.println("Amazon is my dream company");
			break;
			
		default:
			System.out.println("I am ready to work for any of the these");
			
		case "Microsoft":
			System.out.println("Microsoft is my dream company");
			break;
		}
	}
}

/*
 * Output :
 * I am ready to work for any of the these
 * Microsoft is my dream company
 */




