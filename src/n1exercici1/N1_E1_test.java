package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class N1_E1_test {
	
	Months m = new Months();
	
	@Test
	void monthsSizeTest() {
		assertEquals(12, m.months.length);
	}
	
	@Test
	void notNullTest() {
		assertNotNull(m.months);
	}
	
	@Test
	void augustTest() {
		assertEquals("Agost", m.months[7]);
	}

}
