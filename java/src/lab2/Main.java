package lab2;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Name", "Surname", "+0123456789");
		String json = person1.serialize();
		Person person2 = Person.deserialize(json);
		
		System.out.printf("Serialized person1 object: %s\n", json);
		System.out.printf("Serialized person2 object: %s\n", person2.serialize());
		System.out.printf("Person 1 and Person 2 are equal: %b\n", person1.equals(person2));
	}

}
