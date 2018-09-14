package assignment01;

public class University {

	//private fields
	private String name;
	private String city;
	
	//constructor
	public University(String UName, String UCity) {
		name = UName;
		city = UCity;
	}

	//getters
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
}
