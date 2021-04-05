package methods;

/*
 * @Author : Niraj Thagunna
 * Interview Questions - Methods - 8
 */

class Person {
	
	private void who() {
		System.out.println("Private");
	}
	
	public static void whoAmI() {
		System.out.println("Public and Static");
	}
	
	public void whoAreYou() {
		who();
		System.out.println("Simple Me");
	}
}

public class Problem8 {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.whoAmI();
		person.whoAreYou();
	}
}
