package methods;

/*
 * @Author : Niraj Thagunna
 * Interview Questions - Methods - 4
 */

class Course {
	int courseNumber;
}

public class Problem4 {
	
	public static void RBR_course2(int number_people_watching, Course courseNo) {
		courseNo.courseNumber = courseNo.courseNumber + 1;
		number_people_watching = number_people_watching + 200;
	}
	
	public static void RBR_course1() {
		int number_people_watching = 1000;
		Course course = new Course();
		course.courseNumber = 1;
		RBR_course2(number_people_watching, course);
		System.out.println("number_people_watching = " + number_people_watching + " RBR_course = " + course.courseNumber);
	}
	
	public static void main(String[] args) {
		RBR_course1();
	}
}
