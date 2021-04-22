package oops;

class BaseReference {
	
	void show() {
		System.out.println("Show of A");
	}
}

class DerivedReference extends BaseReference {
	
	void display() {
		System.out.println("Display of B");
	}
}

public class ReferencedObject {
	
	public static void main(String[] args) {
		
		BaseReference baseRef = new BaseReference();
		DerivedReference derivedRef = new DerivedReference();
		
		baseRef = derivedRef;
		// derivedRef = baseRef; // Type mismatch: cannot convert from BaseReference to DerivedReference
		// We cannot assign a reference of base class to an object of derived class.
		
		// why we cannot assign a base class reference to a derived class whereas vice versa is possible?
		// when we create a child class object,
		// the base class object is auto initiated so base class reference variable can point to child class object. 
		// but not vice versa because a child class reference variable can not point to base class object because no child 
		// class object is created.
	}
}




