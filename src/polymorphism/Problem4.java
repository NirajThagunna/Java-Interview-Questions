package polymorphism;

class BaseClass {
	void fun() {
		System.out.println("Base class method!");
	}
}

class DerivedClass extends BaseClass {
	void fun() {
		System.out.println("Derived class method!");
	}
}

public class Problem4 {

	public static void main(String[] args) {
		// Cannot create an object of a base class from a derived class
		
//		DerivedClass obj = new BaseClass();
//		obj.fun();
	}
}
