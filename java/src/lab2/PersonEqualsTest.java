package lab2;

import org.junit.jupiter.api.*;
import nl.jqno.equalsverifier.*;

public class PersonEqualsTest {

	@Test
	public void TestPersonEquals() {
		EqualsVerifier.forClass(Person.class).usingGetClass().verify();
	}

}
