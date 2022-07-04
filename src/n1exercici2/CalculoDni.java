package n1exercici2;

public class CalculoDni {
	

	public char computeLetter(int numDni) {
		char letters[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};	
		
		return letters[numDni%23];
	}
	
	
}
