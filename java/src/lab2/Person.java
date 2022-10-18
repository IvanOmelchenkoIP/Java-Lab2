package lab2;

import java.util.Objects;

public final class Person {
	
	private final String firstname;
	private final String lastname;
	private final String phonenumber;
	
	Person(String fname, String lname, String pnumber) {
		firstname = fname;
		lastname = lname;
		phonenumber = pnumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstname, lastname, phonenumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || (getClass() != obj.getClass())) return false;
		Person other = (Person) obj;
		return Objects.equals(firstname, other.firstname) 
				&& Objects.equals(lastname, other.lastname)
				&& Objects.equals(phonenumber, other.phonenumber);
	}	

}
