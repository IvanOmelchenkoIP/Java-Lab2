package lab2;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Name", "Surname", "+0123456789");
		
		Gson gson = new Gson();
		String json = gson.toJson(person1);
		Person person2 = gson.fromJson(json, Person.class);
		
		System.out.printf("Serialized person1 object: %s\n", json);
		System.out.printf("Serialized person2 object: %s\n", gson.toJson(person2));
		System.out.printf("Person 1 and Person 2 are equal: %b\n", person1.equals(person2));		
	}

}
