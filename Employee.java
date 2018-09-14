package assignment01;

public class Employee {
	
	//private fields
	private Company company;
	private double salary;
	private Person person;

	//constructor
	public Employee(Person person, double startingSalary, Company company) {
		this.person = person;
		this.salary = startingSalary;
		this.company = company;
		person.getHistory()[2] = this;
	}

	//getter
	public Company getCompany(){
		return company;
	}
	public Person getPerson(){
		return person;
	}
	public double getSalary(){
		return salary;
	}

	//setter
	public void setSalary (double salary) {
		this.salary = salary;
	}
}
