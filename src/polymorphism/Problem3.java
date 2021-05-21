package polymorphism;

// Data members cannot be overridden.
// Only methods can overridden.
class BaseClassTest {
	int x = 10;
}

class DerivedClassTest extends BaseClassTest {
	int x = 20;
}

public class Problem3 {
	
	public static void main(String[] args) {
		BaseClassTest ref = new DerivedClassTest();
		System.out.println(ref.x);
	}
}
