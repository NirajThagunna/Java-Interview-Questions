package arrays;

class Student1 {
	
	private int id;
	private String name;
	
	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}


public class ArrayOfClassObjects {
	
	public static void main(String[] args) {
		
		// Creating an array
		Student1[] student = new Student1[3];
		
		student[0] = new Student1(80, "Niraj Thagunna");
		student[1] = new Student1(70, "Niru");
		student[2] = new Student1(88, "Anu");
		
		
		for (Student1 std : student) {
			System.out.println(std.toString());
		}
	}
}





