package assignment01;
import java.time.LocalDate;

public class Person {
	
	//private fields
	private String name;
	private LocalDate birthdate;
	Object[] history = new Object[3];

	//constructor
	public Person(String aName, int day, int month, int years) {
		name = aName;
		birthdate = LocalDate.of(years, month, day);
	}

	//getters
	public String getName() {
		return name;
	}
	public LocalDate getBirthdate( ) {
		return birthdate;
	}
	public Object[] getHistory() {
		return history;
	}

	public void printHistory() {
		System.out.println("History of " + name);
		if (history[0] != null) {
			HighSchoolStudent hss = (HighSchoolStudent)history[0];
			System.out.println("\tHigh school: " + hss.getHighSchool().getName());
		}
		if (history[1] != null) {
			UniversityStudent us = (UniversityStudent)history[1];
			System.out.println("\tUniversity: " + us.getUniversity().getName() + " in " + us.getUniversity().getCity());
		}
		if (history[2] != null) {
			Employee e = (Employee)history[2];
			System.out.format("\tJob at %s in %s, with a salary of %.2f\n",
				e.getCompany().getName(), e.getCompany().getCity(), e.getSalary());
		}
	}
}
