/**
 * @author Mohammad Khan
 * @version 1.0
 * 
 * This class implements all of the methods in the 
 * WackyStringInterface class, which are methods that 
 * will be used in the test class called RamStringTester.
 */
public class RamString implements WackyStringInterface {
	private String current; // An instance variable representing the current 
	                        // string to be used (such as an email address for example).

	/**
	 * Constructs a generalization of a 
	 * current string of characters. 
	 * @param string The current string of the characters.
	 */
	public RamString(String string) {
		current = string;
	}
	
	/**
	 * Sets the current string of characters.
	 * @Override
	 * @param string The current string of characters to be registered.
	 */
	public void setWackyString(String string) {
		current = string;
	}

	/**
	 * Retrieves the current string of characters. 
	 * @Override
	 * @return the current string of characters.
	 */
	public String getWackyString() {
		return current;
	}

	/**
	 * Takes in the current string of characters and provides
	 * the even numbered portions back. The very first character in the 
	 * string is noted as 1. 
	 * @Override
	 * @return The even numbered portions of the current string of characters.
	 */
	public String getEvenCharacters() {
		String even = ""; // Assigns the variable an empty string.
		// Loops until each charcter in the current string is checked.
		for (int i = 0; i < current.length(); i++) {
			// Checks for even numbered characters and 
			// concatenates them together to form a string.
			if (i % 2 != 0) {
				even += current.charAt(i);
			} else {
			
			}
		}
		return even; // Returns the concatenated even numbered string.
	}
	
	/**
	 * Takes in the current string of characters and provides
	 * the odd numbered portions back. The very first character in the 
	 * string is noted as 1. 
	 * @Override
	 * @return The even numbered portions of the current string of characters.
	 */
	public String getOddCharacters() {
		String odd = ""; // Assigns the variable an empty string.
		// Loops until each charcter in the current string is checked.
		for (int i = 0; i < current.length(); i++) {
			// Checks for odd numbered characters and 
			// concatenates them together to form a string.
			if (i % 2 == 0) {
				odd += current.charAt(i);
			} else {
				// im gonna leave this blank so each string gets concatenated.
			}

		}
		return odd; // Returns the concatenated even numbered string.
	}

	/**
	 * Takes in the current string of characters and counts the amount of
	 * non-digits in the string.
	 * @Override
	 * @return The integer number of non-digit characters in the string.
	 */
	public int countNonDigits() {
		int nonDigits = 0;
		char letterCheck;
		// Loops until each charcter in the current string is checked.
		for(int i = 0; i < current.length(); i++) {
			letterCheck = current.charAt(i); // Sets the char variable to the current character being checked in the loop.
			
			// Checks each character to see if it's a digit or not.
			if(!(Character.isDigit(letterCheck))) {
				nonDigits++; // Every character that is checked and not a digit adds to this vaiable.
			}
		}
		return nonDigits; // Returns the value of non-digit characters in the current string.
	}
	
	/**
	 * Checks to see if at least one character is before and after "@", and at least
	 * one character is before and after ".".
	 * @Override
	 * @return True if at least one character is before and after "@" and ".". False is returned otherwise.
	 */
	public boolean isValidEmail() {
		boolean validEmail = false; // Sets the boolean varaible to false initially.
		char emailCheck;
		
		// Loops until each character in the current string is checked.
		for (int i = 0; i < current.length(); i++) {
			emailCheck = current.charAt(i); // Sets the char variable to the current character being checked in the loop.
			
			// Sets the boolean variable to false if there isn't at least
			// one character before '@' in the email.
			if (emailCheck == '@' && i < 1) {
				validEmail = false;
				return validEmail;
			} 
			// Sets the boolean variable to false if there isn't at least
			// one character before '.'
			else if (emailCheck == '.' && i < 1) {
				validEmail = false;
				return validEmail;
			}
			// Sets the boolean variable to false if there isn't a character that
			// comes before '.'
			else if (emailCheck == '.' && !(Character.isLetter(i - 1))) {
				validEmail = false;
				return validEmail;
			}
			// Sets the boolean variable to true if both '@' and '.' have at 
			// least one character before them.
			else if ((emailCheck == '@' && i >= 1) || (emailCheck == '.' && (Character.isLetter(i - 1)))) {  // && (emailCheck - 1 != '@')
				validEmail = true;
				return validEmail;
			}
		}
		return validEmail; // Returns the boolean value.
	}

	/**
	 * Replaces any single zeros (0) with Rams, and any double zeroes (00) 
	 * with VCU in the current string.
	 * @Override
	 */
	public void ramifyString() {
		current = current.replaceAll("00","VCU"); // Replaces all instances of 00 in the current string with "VCU".
		current = current.replaceAll("0", "Rams"); // Replaces all instances of 0 in the current string with "Rams".
	}

	/**
	 * Replaces individual digits between startPositon (position 1) and endPostion 
	 * with Roman numeral symbols. Also throws two exceptions if certain criteria 
	 * have been met.  
	 * @Override
	 * @param startPosition Position of the first character.
	 * @param endPosition Position of the last character.
	 * @throws MyIndexOutOfBoundsException If startPosition and/or endPosition are out of bounds, this is thrown.
	 * @throws IllegalArgumentException If startPosition becomes greater than endPosition, this is thrown.
	 */
	public void convertDigitsToRomanNumeralsInSubstring(int startPosition, int endPosition) 
			throws MyIndexOutOfBoundsException, IllegalArgumentException {
		// Throws the MyIndexOutOfBoundsException is startPosition is either less than 
		// 1, or greater than the length of the current string. Also throws it if
		// endPosition is less than 1, or greater than the length of the current string.
		if(startPosition < 1 || startPosition > current.length() || endPosition < 1 ||
				endPosition > current.length()) {
			throw new MyIndexOutOfBoundsException("An index or a multiple of them are out of range.");
		}
		// Throws the IllegalArgumentException if startPosition is greater than endPosition.
		else if(startPosition > endPosition) {
			throw new IllegalArgumentException("The startPosition is not less than or equal to endPosition.");
		}
		String start;
		String end;
		current = current.substring(startPosition - 1, endPosition); // Sets the startPositon and endPosition.
		
		// Loops until each character in the current string is checked.
		for(int i = 0; i < current.length(); i++) {
			// Replaces '1' in the current string with 'I'.
			if(current.charAt(i) == '1') {
				start = current.substring(0, i);
				end = current.substring(i + 1, current.length());
				current = start + "I" + end;
			}
			// Replaces '2' in the current string with 'II'.
			if(current.charAt(i) == '2') {
				start = current.substring(0, i);
				end = current.substring(i + 1, current.length());
				current = start + "II" + end;			
			}
			// Replaces '3' in the current string with 'III'.
			if(current.charAt(i) == '3') {
				start = current.substring(0, i);
				end = current.substring(i + 1, current.length());
				current = start + "III" + end;			
			}
			// Replaces '4' in the current string with 'IV'.
			if(current.charAt(i) == '4') {
				start = current.substring(0, i);
				end = current.substring(i + 1, current.length());
				current = start + "IV" + end;			
			}
			// Replaces '5' in the current string with 'V'.
			if(current.charAt(i) == '5') {
				start = current.substring(0, i);
				end = current.substring(i + 1, current.length());
				current = start + "V" + end;			
			}
			// Replaces '6' in the current string with 'VI'.
			if(current.charAt(i) == '6') {
				start = current.substring(0, i);
				end = current.substring(i + 1, current.length());
				current = start + "VI" + end;			
			}
			// Replaces '7' in the current string with 'VII'.
			if(current.charAt(i) == '7') {
				start = current.substring(0, i);
				end = current.substring(i + 1, current.length());
				current = start + "VII" + end;			
			}
			// Replaces '8' in the current string with 'VIII'.
			if(current.charAt(i) == '8') {
				start = current.substring(0, i);
				end = current.substring(i + 1, current.length());
				current = start + "VIII" + end;					
			}
			// Replaces '9' in the current string with 'IX'.
			if(current.charAt(i) == '9') {
				start = current.substring(0, i);
				end = current.substring(i + 1, current.length());
				current = start + "IX" + end;			
			}
		}	
	}
}