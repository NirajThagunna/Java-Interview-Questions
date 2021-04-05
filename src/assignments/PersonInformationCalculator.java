package assignments;

// Implement a Person class. Each object of this class will represent a human being. Data members should include the
// person's name, year of birth, current year and year of death. Include a access functions to read and display values
// and calculate how many number of years the person lived.

class Person {
	
	public String name;
	private int yearOfBirth;
	private int currentYear;
	private int yearOfDeath;
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public int getCurrentYear() {
		return currentYear;
	}
	
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	
	public int getYearOfDeath() {
		return yearOfDeath;
	}
	
	public void setYearOfDeath(int yearOfDeath) {
		this.yearOfDeath = yearOfDeath;
	}
	
	// details of a person
	public void personInformation() {
		System.out.println("Name : " + name + "\nYear of Birth : " + getYearOfBirth() + "\nYear of Death : " + getYearOfDeath());
	}
	
	// year-alive calculator
	public int yearCalculate() {
		
		int yearAlive = 0;
		
		if (this.yearOfDeath > this.yearOfBirth) {
			yearAlive = this.yearOfDeath - this.yearOfBirth;
		}
		
		return yearAlive;
	}
}

public class PersonInformationCalculator {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.name = "Shyam";
		person.setYearOfBirth(1999);
		person.setCurrentYear(2021);
		person.setYearOfDeath(2017);
		
		person.personInformation();
		
		System.out.println("Number of year person lived is : " + person.yearCalculate());
		
		System.out.println();
		person.name = "Don";
		person.setYearOfBirth(1900);
		person.setCurrentYear(2021);
		person.setYearOfDeath(2018);
		
		person.personInformation();
		
		System.out.println("Number of year person lived is : " + person.yearCalculate());
	}
}
