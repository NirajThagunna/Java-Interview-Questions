package polymorphism;

// Problem - 2

class Animal {
	public void eat() {
		System.out.println("Animal is eating!");
	}
}

class Deer extends Animal {
	public void eat() {
		System.out.println("Deer is eating!");
	}
}

class Fawn extends Deer {
	public void eat() {
		System.out.println("On Mother's feed!");
	}
}

public class Problem2 {

	public static void main(String[] args) {
		Animal animal = new Fawn();
		animal.eat();
		Deer deer = new Fawn();
		deer.eat();
	}
}
