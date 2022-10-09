package lab2;

import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
import nl.jqno.equalsverifier.*;

public class PersonEqualsTest {

	@Test
	public void TestPersonEquals() {
		EqualsVerifier.forClass(Person.class).usingGetClass().verify();
	}
	
	@Test
	void TestSerialization() {
		String expected = "{\"firstname\":\"Name\",\"lastname\":\"Surname\",\"phonenumber\":\"123456789\"}";
		Person person = new Person("Name", "Surname", "123456789");
		String json = person.serialize();
		assertEquals(expected, json);
	}
	
	@Test
	void TestDeserialization() {
		Person expected = new Person("Name", "Surname", "123456789");
		String json = "{\"firstname\":\"Name\",\"lastname\":\"Surname\",\"phonenumber\":\"123456789\"}";
		Person person = Person.deserialize(json);
		assertTrue(expected.equals(person));
	}
	
	@Test
	void TestDeserializationException() {
		String expected = "JSON format must be the same as class Person fields.";
		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Person.deserialize(""));
		assertEquals(expected, exception.getMessage());
	}
	
}
