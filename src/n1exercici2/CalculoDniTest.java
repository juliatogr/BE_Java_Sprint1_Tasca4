package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

class CalculoDniTest {

	CalculoDni calcDni = new CalculoDni();
	
	static Stream<Arguments> arguments = Stream.of(
	  Arguments.of(47331864,'A'),
	  Arguments.of(30194029, 'C'),
	  Arguments.of(48205738, 'S'),
	  Arguments.of(43859275, 'T'),
	  Arguments.of(42947593, 'S'),
	  Arguments.of(59902758, 'V'),
	  Arguments.of(39574938, 'B'),
	  Arguments.of(37059475, 'N'),
	  Arguments.of(41048924, 'L'),
	  Arguments.of(38049359, 'E')

	);
	
	@ParameterizedTest
	@VariableSource("arguments")
	void computeLetterTest(int numDni, char expectedLetter) {
		char actualLetter = calcDni.computeLetter(numDni);
		assertEquals(expectedLetter, actualLetter);
	}

}
