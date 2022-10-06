package lab2;

public class Person {
	private String firstname;
	private String lastname;
	private String phonenumber;
	
	Person(String fname, String lname, String pnumber) {
		firstname = fname;
		lastname = lname;
		phonenumber = pnumber;
	}
	
	public boolean equals() {
		return true;
	}
	
	public void serialize() {}
	
	public void deserialize() {}
}
