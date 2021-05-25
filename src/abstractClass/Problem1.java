package abstractClass;

abstract class AbstractBaseClass1 {
	abstract void f1();
}

class DerivedClassA extends AbstractBaseClass1 {
	void f1() {
		System.out.println("I am from DerivedClassA.");
	}
}

//class DerivedClassB extends AbstractBaseClass1 {
//}
 
public class Problem1 {

	public static void main(String[] args) {
		AbstractBaseClass1 ref = new DerivedClassA();
		ref.f1();
//		ref = new DerivedClassB();
//		ref.f1();
	}
}
