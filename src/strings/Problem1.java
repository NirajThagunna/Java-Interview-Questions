package strings;

/*
 * @Author: Niraj Thagunna
 * Program to compare two Strings
 */

public class Problem1 {
	
	public static void main(String[] args) {
		
		String course = "JavaCourse";
		String courseName = "JavaCourse";
		
		if (course == courseName) {
			System.out.println("Course and courseName are same...");
		}
		
		String myCourse = new String("JavaCourse");
		if (course == myCourse) {
			System.out.println("Course and myCourse are same...");
		}
		
		String myCourseNew = new String("JavaCourse");
		if (myCourse == myCourseNew) {
			System.out.println("myCourse and myCourseNew are same...");
		}
	}
}
