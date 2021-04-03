package oops;

class Student {
	
	protected String name;
	
}

class Teacher extends Student {
	
	private String teacher;
}

public class Problem1 extends Student {
	
	public static void main(String[] args) {
		
		Teacher obj = new Teacher();
		obj.name = "Niraj";
	}
}
