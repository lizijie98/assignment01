package assignment01;

public class UniversityStudent {
	
	//private fields
	private University university;
	private Person person;

	//constructor
	public UniversityStudent(Person person, University university) {
		this.person = person;
		this.university = university;
		person.getHistory()[1] = this;
	}

	//getter
	public Person getUniversityStudent() {
		return person;
	}
	public University getUniversity() {
		return university;
	}

	//get a job
	public Employee getAJob(Company comp, double startingSalary) {
		return new Employee(person, startingSalary, comp);
	}
}
