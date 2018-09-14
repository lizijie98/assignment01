package assignment01;

public class HighSchoolStudent {
	
	//private fields
	private HighSchool highschool;
	private Person person;

	//constructor
	public HighSchoolStudent(Person person, HighSchool highschool) {
		this.person = person;
		this.highschool = highschool;
		person.getHistory()[0] = this;
	}

	//getter
	public Person getHighSchoolStudent() {
		return person;
	}
	public HighSchool getHighSchool() {
		return highschool;
	}

	//go to college
	public UniversityStudent goToUniversity(University univ) {
		return new UniversityStudent(person, univ);
	}
}
