package polymorphism;

// Problem-1

class Vehicle {
	public void info() {
		System.out.println("I'm Vehicle!");
	}
}

class Car extends Vehicle {
	public void info() {
		System.out.println("I'm Car!");
	}
}

public class Problem1 {

	public static void main(String[] args) {
//		Car c = new Vehicle(); Cannot convert from vehicle to car // Compilation error -> Type mismatch
//		c.info();
	}
}
