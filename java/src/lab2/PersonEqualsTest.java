package lab2;

import nl.jqno.equalsverifier.*;
import org.junit.jupiter.api.Test;

class PersonEqualsTest {

	@Test
	void TestPersonEquals() {
		EqualsVerifier.forClass(Person.class).verify();
	}

}
