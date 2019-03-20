/**
 * @author Mohammad Khan
 * @version 1.0
 * 
 * This is a class the extends the RuntimeException class.
 * It is utilized in the convertDigitsToRomanNumeralsInSubstring method 
 * (in the RamString class) in order to show when the startPosition 
 * and/or endPosition in a string are out of range.
 */
public class MyIndexOutOfBoundsException extends RuntimeException {

	/**
	 * Constructs the the class's exception.
	 * @param message A parameter for a string message to be given when the exception is thrown.
	 */
	public MyIndexOutOfBoundsException(String message) {
		super(message);
	}

	/**
	 * A second constructor for the class's exception.
	 */
	public MyIndexOutOfBoundsException() {
		super();
	}
}