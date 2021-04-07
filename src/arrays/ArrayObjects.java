package arrays;

// Arrays of objects
class Student {
	
	public String name;
	private int rollNo;
	
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	// Display
	public void display() {
		System.out.println("Student Name : " + name + "\nRoll Number : " + rollNo);
	}
}

public class ArrayObjects {
	
	public static void main(String[] args) {
		
		// Creating an array of Student type that holds array of objects
		Student[] student = new Student[3]; // It holds three objects as an array
		
		// Creating an object of the Student class
		student[0] = new Student("Niraj Thagunna", 6317080);
		student[1] = new Student("Shalu", 67);
		student[2] = new Student("Niru", 88);
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("For " + i + "\nStudent Name : " + student[i].name + "\nRoll Number : " + student[i].getRollNo());
		}
	}
}
