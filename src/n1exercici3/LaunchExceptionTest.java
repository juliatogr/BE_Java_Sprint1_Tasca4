package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LaunchExceptionTest {
	LaunchException le = new LaunchException();
	
	@Test
	public void throwsArrayIndexException() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> le.launchException());
	}
	
}
