package assignment01;

public class Driver {
	public static void main(String[] args) {

		//people
		Person person1 = new Person("Joe Adams", 07, 05, 1989);
		Person person2 = new Person("Kevin Smith", 12, 07, 1970);
		Person person3 = new Person("Chris White", 25, 11, 1974);
		Person person4 = new Person("Jane Doe", 03, 02, 1990);

		//high schools
		HighSchool highschool1 = new HighSchool("Stuyvesant");
		HighSchool highschool2 = new HighSchool("Bk Tech");
		HighSchool highschool3 = new HighSchool("SI Tech");

		//high school students
		HighSchoolStudent hsstudent1 = new 				HighSchoolStudent(person1, highschool1);
		HighSchoolStudent hsstudent2 = new 				HighSchoolStudent(person2, highschool2);
		HighSchoolStudent hsstudent3 = new 				HighSchoolStudent(person3, highschool3);

		//universities
		University univ1 = new University("SUNY Binghamton", "Binghamton, NY");
		University univ2 = new University("MIT", "Cambridge, Massachusetts");

		//go to university
		UniversityStudent uniStudent1 = hsstudent1.goToUniversity(univ1);
		UniversityStudent uniStudent2 = hsstudent2.goToUniversity(univ2);

		//company
		Company company1 = new Company("Google", "Mountain View, CA");

		//get a job
		Employee employee1 = uniStudent1.getAJob(company1, 100000);
	
	System.out.println("----------------------------------");
	person1.printHistory();
	System.out.println("----------------------------------");
	person2.printHistory();
	System.out.println("----------------------------------");
	person3.printHistory();
	System.out.println("----------------------------------");
	person4.printHistory();
	System.out.println("----------------------------------");
	}
}
