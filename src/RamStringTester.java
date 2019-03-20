/**
 * @author Mohammad Khan
 * @version 1.0
 * 
 * This class acts as a test class for the methods implemented in 
 * the RamString class. It is used to fix any programming issues
 * that may have been produced in the RamString class. JUnit would 
 * have worked in this case too, but a restriction on it's use was
 * given in this project.
 * 
 * Inputs used for each test case were strings, and the outputs gotten 
 * were boolean values except for the last two test cases, which 
 * instead output their specific exceptions.
 */
public class RamStringTester {
	// Prints a list of required information for graders of the assignment.
	private static void printHeading() {
		System.out.println("Mohammad Abdul Ahad Khan");
		System.out.println("Project 2");
		System.out.println("CMSC 256");
		System.out.println("Spring 2019");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		printHeading(); // Prints the required information.
		
//------- All tests below are for the setEvenCharacters method--------------------------------------------------------------------------------------------------------------------------		
		
		System.out.println("Tests for setWackyString: "); // Dictates the beginning of test cases for setWackyString.
		
		RamString ram = new RamString("khanma7@vcu.edu"); // Sets the RamString object as an email string.
		
		/** 
		 * 2) This test checks whether method setWackyString works 
         * correctly for email string, and returns it.
         */
		ram.setWackyString("khanma7@vcu.edu"); 
		boolean test = false;
		// String created from setWackyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method.
		if(ram.getWackyString().equals("khanma7@vcu.edu")) {
			test = true;
			System.out.println("1) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("1) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 2) This test checks whether method settWackyString works 
         * correctly for string of nothing, and returns nothing.
         */
		ram.setWackyString("");
 		test = false;
		// String created from setWackyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method. 
 		if(ram.getWackyString().equals("")) {
 			test = true;
 			System.out.println("2) " + test); // true is printed if the object matches what is expected.
 		}
 		else {
 			System.out.println("2) " + test); // false is printed if the object doesn't matches what is expected.
 		}
			
		/** 
		 * 3) This test checks whether method setWackyString works 
         * correctly for a string containing just letters, and returns 
         * them back.
         */
 		ram.setWackyString("abcdefghijklmnopqrstuvwxyz");
		test = false;
		// String created from setWackyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method.
		if(ram.getWackyString().equals("abcdefghijklmnopqrstuvwxyz")) {
			test = true;
			System.out.println("3) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("3) " + test); // false is printed if the object doesn't matches what is expected.
		}
			
		/** 
		 * 4) This test checks whether method setWackyString works 
         * correctly for a string containing just digits, and returns 
         * them back.
         */
		ram.setWackyString("1234567890");
		test = false;
		// String created from setWackyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method.
		if(ram.getWackyString().equals("1234567890")) {
			test = true;
			System.out.println("4) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("4) " + test); // false is printed if the object doesn't matches what is expected.
		}
			
		/** 
		 * 5) This test checks whether method setWackyString works 
         * correctly for a string containing letters and digits, and returns 
         * them back.
         */
		ram.setWackyString("a1b12c123d1234a0b1abc2abcd3");
		test = false;
		// String created from setWackyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method.
		if(ram.getWackyString().equals("a1b12c123d1234a0b1abc2abcd3")) {
			test = true;
			System.out.println("5) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("5) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
//------- All tests below are for the getWackyString method--------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("");
		System.out.println("Tests for getWackyString: "); // Dictates the beginning of test cases for getWackyString.
		
		/** 
		 * 1) This test checks whether method getWackyString works 
         * correctly for a string of an email address, and returns all 
         * characters in the string.
         */
		ram = new RamString("khanma7@vcu.edu"); // RamString object set to an email string.
		test = false;
		// Checks to see if the object matches what is to be expected. 
		if(ram.getWackyString().equals("khanma7@vcu.edu")) {
			test = true;
			System.out.println("1) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("1) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 2) This test checks whether method getWackyString works 
         * correctly for string of nothing, and returns nothing.
         */
		ram = new RamString(""); // RamString object set to an empty string.
 		test = false;
 		// Checks to see if the object matches what is to be expected. 
 		if(ram.getWackyString().equals("")) {
 			test = true;
 			System.out.println("2) " + test); // true is printed if the object matches what is expected.
 		}
 		else {
 			System.out.println("2) " + test); // false is printed if the object doesn't matches what is expected.
 		}
		
		/** 
		 * 3) This test checks whether method getWackyString works 
         * correctly for a string containing just letters, and returns 
         * them back.
         */
 		ram = new RamString("abcdefghijklmnopqrstuvwxyz"); // RamString object set to a string of just letters.
		test = false;
		// Checks to see if the object matches what is to be expected. 
		if(ram.getWackyString().equals("abcdefghijklmnopqrstuvwxyz")) {
			test = true;
			System.out.println("3) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("3) " + test); // false is printed if the object doesn't matches what is expected.
		}
			
		/** 
		 * 4) This test checks whether method getWackyString works 
         * correctly for a string containing just digits, and returns 
         * them back.
         */
		ram = new RamString("1234567890"); // RamString object set to a string of just digits.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getWackyString().equals("1234567890")) {
			test = true;
			System.out.println("4) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("4) " + test); // false is printed if the object doesn't matches what is expected.
		}
			
		/** 
		 * 5) This test checks whether method getWackyString works 
         * correctly for a string containing letters and digits, and returns 
         * them back.
         */
		ram = new RamString("a1b12c123d1234a0b1abc2abcd3"); // RamString object set to a string of letters and digits.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getWackyString().equals("a1b12c123d1234a0b1abc2abcd3")) {
			test = true;
			System.out.println("5) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("5) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
//------- All tests below are for the getEvenCharacters method--------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("");
		System.out.println("Tests for getEvenCharacters method: "); // Dictates the beginning of test cases for getEvenCharacters.
		
		/** 
		 * 1) This test checks whether method getEvenCharacters works 
         * correctly for string of an email address, and returns all 
         * even characters in the string.
         */
		ram = new RamString("khanma7@vcu.edu"); // RamString object set to an email string.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getEvenCharacters().equals("hna@c.d")) {
			test = true;
			System.out.println("1) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("1) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 2) This test checks whether method getEvenCharacters works 
         * correctly for an even numbered string, and returns all 
         * even characters in the string.
         */
		ram = new RamString("Mohammad"); // RamString object set to an even numbered string.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getEvenCharacters().equals("oamd")) {
			test = true;
			System.out.println("2) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("2) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 3) This test checks whether method getEvenCharacters works 
         * correctly for an odd numbered string, and returns all 
         * even characters in the string.
         */
		ram = new RamString("Mohamma"); // RamString object set to an odd numbered string.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getEvenCharacters().equals("oam")) {
			test = true;
			System.out.println("3) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("3) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 4) This test checks whether method getEvenCharacters works 
         * correctly for a single odd character, and as a result, returns 
         * nothing.
         */
		ram = new RamString("M"); // RamString object set to a string containing a single odd numbered character.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getEvenCharacters().equals("")) {
			test = true;
			System.out.println("4) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("4) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 5) This test checks whether method getEvenCharacters works 
         * correctly for a single even character, and returns it.
         */
		ram = new RamString(" M"); // RamString object set to a string containing a single even numbered character.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getEvenCharacters().equals("M")) {
			test = true;
			System.out.println("5) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("5) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 6) This test checks whether method getEvenCharacters works 
         * correctly for an empty string, and returns nothing.
         */
		ram = new RamString(""); // RamString object set to a string containing nothing.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getEvenCharacters().equals("")) {
			test = true;
			System.out.println("6) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("6) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
//------- All tests below are for the getOddCharacters method--------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("");
		System.out.println("Tests for getOddCharacters method: "); // Dictates the beginning of test cases for getOddCharacters.
		
		/** 
		 * 1) This test checks whether method getOddCharacters works 
         * correctly for string of an email address, and returns all 
         * odd characters in the string.
         */
		ram = new RamString("khanma7@vcu.edu"); // RamString object set to an email string.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getOddCharacters().equals("kam7vueu")) {
			test = true;
			System.out.println("1) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("1) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 2) This test checks whether method getOddCharacters works 
         * correctly for an even numbered string, and returns all 
         * odd characters in the string.
         */
		ram = new RamString("Mohammad"); // RamString object set to an even numbered string.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getOddCharacters().equals("Mhma")) {
			test = true;
			System.out.println("2) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("2) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 3) This test checks whether method getOddCharacters works 
         * correctly for an odd numbered string, and returns all 
         * odd characters in the string.
         */
		ram = new RamString("Mohamma"); // RamString object set to an odd numbered string.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getOddCharacters().equals("Mhma")) {
			test = true;
			System.out.println("3) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("3) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 4) This test checks whether method getOddCharacters works 
         * correctly for a single odd character, and as a result, returns 
         * that character.
         */
		ram = new RamString("M"); // RamString object set to a string containing an single odd character.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getOddCharacters().equals("M")) {
			test = true;
			System.out.println("4) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("4) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 5) This test checks whether method getOddCharacters works 
         * correctly for a single even character, and returns a space 
         * instead.
         */
		ram = new RamString(" M"); // RamString object set to a string containing an single even character.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getOddCharacters().equals(" ")) {
			test = true;
			System.out.println("5) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("5) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 6) This test checks whether method getOddCharacters works 
         * correctly for an empty string, and returns nothing.
         */
		ram = new RamString(""); // RamString object set to a string containing nothing.
		test = false;
		// Checks to see if the object matches what is to be expected.
		if(ram.getOddCharacters().equals("")) {
			test = true;
			System.out.println("6) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("6) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
//------- All tests below are for the countNonDigits method--------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("");
		System.out.println("Tests for countNonDigits method: "); // Dictates the beginning of test cases for countNonDigits.
		
		/** 
		 * 1) This test checks whether method countNonDigits works 
         * correctly for string of an email address, and returns
         * the number of characters in the string that aren't digits.
         */
		ram = new RamString("khanma7@vcu.edu"); // RamString object set to an email string.
		test = false;
		// Checks to see if the object matches the number of characters to be expected.
		if(ram.countNonDigits() == 14) {
			test = true;
			System.out.println("1) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("1) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 2) This test checks whether method countNonDigits works 
         * correctly for an empty string, and returns
         * a value of zero as a result.
         */
		ram = new RamString(""); // RamString object set to a string of nothing.
		test = false;
		// Checks to see if the object matches the number of characters to be expected.
		if(ram.countNonDigits() == 0) {
			test = true;
			System.out.println("2) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("2) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 3) This test checks whether method countNonDigits works 
         * correctly for string of all digits, and returns
         * a value of zero as a result.
         */
		ram = new RamString("1234567890"); // RamString object set to a string of digits.
		test = false;
		// Checks to see if the object matches the number of characters to be expected.
		if(ram.countNonDigits() == 0) {
			test = true;
			System.out.println("3) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("3) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 4) This test checks whether method countNonDigits works 
         * correctly for string of non-digits, and returns
         * the number of characters in the string total.
         */
		ram = new RamString("Mohammad"); // RamString object set to a string containing no digits.
		test = false;
		// Checks to see if the object matches the number of characters to be expected.
		if(ram.countNonDigits() == 8) {
			test = true;
			System.out.println("4) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("4) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 5) This test checks whether method countNonDigits works 
         * correctly for a complex string without digits, and returns
         * the number of characters in that string.
         */
		ram = new RamString("four.abc!@#$%^&*()" + "/*-+{}[]|:;/?><,."); // RamString object set to a complex string containing no digits.
		test = false;
		// Checks to see if the object matches the number of characters to be expected.
		if(ram.countNonDigits() == 35) {
			test = true;
			System.out.println("5) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("5) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 6) This test checks whether method countNonDigits works 
         * correctly on an alphanumeric string, and returns
         * the number of characters in the string that aren't digits.
         */
		ram = new RamString("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"); // RamString object set to an alphanumeric string.
		test = false;
		// Checks to see if the object matches the number of characters to be expected.
		if(ram.countNonDigits() == 52) {
			test = true;
			System.out.println("6) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("6) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/** 
		 * 7) This test checks whether method countNonDigits works 
         * correctly on a complex alphanumeric string, and returns
         * the number of characters in the string that aren't digits.
         */
		ram = new RamString("abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "1234567890"); // RamString object set to a complex alphanumeric string.
		test = false;
		// Checks to see if the object matches the number of characters to be expected.
		if(ram.countNonDigits() == 52) {
			test = true;
			System.out.println("7) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("7) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
//------- All tests below are for the isValidEmail method--------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("");
		System.out.println("Tests for isValidEmail method: "); // Dictates the beginning of test cases for isValidEmail.
		
		/**
		 * 1) This test checks whether isValidEmail works with a 
		 * regular email containing multiple characters before '@'
		 * and '.'.
		 */
		RamString ramEmail = new RamString("khanma7@vcu.edu"); // RamString object set to an email string with multiple characters before '@' and '.'.
		System.out.println("1) " + ramEmail.isValidEmail()); // Prints true if multiple characters are before '@' and '.'. Otherwise false.
		
		/**
		 * 2) This test checks whether isValidEmail works with an
		 * email containing at least one character before '@'
		 * and multiple before '.'.
		 */
		ramEmail = new RamString("k@vcu.edu"); // RamString object set to an email string with at least one character before '@' and multiple before '.'.
		System.out.println("2) " + ramEmail.isValidEmail()); // Prints true if at least one character is before '@' and multiple before '.'. Otherwise false.
		
		/**
		 * 3) This test checks whether isValidEmail works with a 
		 * regular email containing multiple characters before '@' 
		 * and at least one before '.'.
		 */
		ramEmail = new RamString("khanma7@v.edu"); // RamString object set to an email string with multiple characters before '@' and at least one before '.'.
		System.out.println("3) " + ramEmail.isValidEmail()); // Prints true if multiple characters are before '@' and at least one before '.'. Otherwise false.
		
		/**
		 * 4) This test checks whether isValidEmail works with a 
		 * regular email containing no characters before '@'
		 * and multiple before '.'. A value of false is the 
		 * correct answer in this test considering at least one 
		 * character should be before '@' for it to be true.
		 */
		ramEmail = new RamString("@vcu.edu"); // RamString object set to an email string with no characters before '@' and multiple before '.'.
		System.out.println("4) " + ramEmail.isValidEmail()); // Prints false if no characters are before '@' and multiple before '.'. Otherwise true.
		
		/**
		 * 5) This test checks whether isValidEmail works with a 
		 * regular email containing multiple characters before '@'
		 * and none before '.'. A value of false is the 
		 * correct answer in this test considering at least one 
		 * character should be before '.' for it to be true.
		 */
		ramEmail = new RamString(".edu"); // RamString object set to an email string with no characters before '.'.
		System.out.println("5) " + ramEmail.isValidEmail()); // Prints false if no characters are before '.'. Otherwise true.
		
		/**
		 * 6) This test checks whether isValidEmail works with a 
		 * regular email containing no characters before '@'
		 * and none before '.'. A value of false is the 
		 * correct answer in this test considering at least one 
		 * character should be before '.' and '@'.
		 */
		ramEmail = new RamString("@.edu"); // RamString object set to an email string with no characters before '@' and none before '.'.
		System.out.println("6) " + ramEmail.isValidEmail()); // Prints false if no characters are before '@' and none are before '.'. Otherwise true.
		
//------- All tests below are for the ramifyString method--------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("");
		System.out.println("Tests for ramifyString method: "); // Dictates the beginning of test cases for countNonDigits.
		
		/**
		 * 1) This test checks whether ramifyString works with an 
		 * email containing a single 0.
		 */
	    ram = new RamString("khanma0@vcu.edu"); // RamString object set to an email string containing a single 0.
	    ram.ramifyString();
		test = false;
		// String created from ramifyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaRams@vcu.edu")) {
			test = true;
			System.out.println("1) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("1) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 2) This test checks whether ramifyString works with an 
		 * email containing more than one 0.
		 */
	    ram = new RamString("kha0nma0@vcu.edu"); // RamString object set to an email string containing more than one 0.
	    ram.ramifyString();
		test = false;
		// String created from ramifyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method.
		if(ram.getWackyString().equals("khaRamsnmaRams@vcu.edu")) {
			test = true;
			System.out.println("2) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("2) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 3) This test checks whether ramifyString works with an 
		 * email containing a single 00.
		 */
	    ram = new RamString("khanma00@vcu.edu"); // RamString object set to an email string containing one 00.
	    ram.ramifyString();
		test = false;
		// String created from ramifyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaVCU@vcu.edu")) {
			test = true;
			System.out.println("3) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("3) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 4) This test checks whether ramifyString works with an 
		 * email containing more than one 00.
		 */
	    ram = new RamString("k00hanma00@vcu.edu"); // RamString object set to an email string containing more than one 00.
	    ram.ramifyString();
		test = false;
		// String created from ramifyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method.
		if(ram.getWackyString().equals("kVCUhanmaVCU@vcu.edu")) {
			test = true;
			System.out.println("4) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("4) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 5) This test checks whether ramifyString works with an 
		 * email containing a 000. The test should produce a 
		 * VCU followed by Rams (i.e. true should be produced)
		 */
	    ram = new RamString("khanma000@vcu.edu"); // RamString object set to an email string containing one 000.
	    ram.ramifyString();
		test = false;
		// String created from ramifyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaVCURams@vcu.edu")) {
			test = true;
			System.out.println("5) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("5) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 6) This test checks whether ramifyString works with an 
		 * email containing more one 0 and a separate 00.
		 */
	    ram = new RamString("k0hanma00@vcu.edu"); // RamString object set to an email string containing one 0 and one 00.
	    ram.ramifyString();
		test = false;
		// String created from ramifyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method.
		if(ram.getWackyString().equals("kRamshanmaVCU@vcu.edu")) {
			test = true;
			System.out.println("6) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("6) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 7) This test checks whether ramifyString works with an 
		 * email containing no 0 or 00.
		 */
	    ram = new RamString("khanma@vcu.edu"); // RamString object set to an email string containing no zeroes.
	    ram.ramifyString();
		test = false;
		// String created from ramifyString method is checked to see if it matches what's to be expected
		// by using the getWackyString method.
		if(ram.getWackyString().equals("khanma@vcu.edu")) {
			test = true;
			System.out.println("7) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("7) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
//------- All tests below are for the convertDigitsToRomanNumeralsInSubstring method--------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("");
		System.out.println("Tests for convertDigitsToRomanNumeralsInSubstring method: "); // Dictates the beginning of test cases for countNonDigits.
		
		/**
		 * 1) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing '1'.
		 */
		ram = new RamString("khanma1@vcu.edu"); // RamString object set to an email string containing '1'.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 15); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaI@vcu.edu")) {
			test = true;
			System.out.println("1) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("1) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 2) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing '2'.
		 */
		ram = new RamString("khanma2@vcu.edu"); // RamString object set to an email string containing '2'.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 15); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaII@vcu.edu")) {
			test = true;
			System.out.println("2) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("2) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 3) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing '3'.
		 */
		ram = new RamString("khanma3@vcu.edu"); // RamString object set to an email string containing '3'.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 15); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaIII@vcu.edu")) {
			test = true;
			System.out.println("3) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("3) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 4) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing '4'.
		 */
		ram = new RamString("khanma4@vcu.edu"); // RamString object set to an email string containing '4'.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 15); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaIV@vcu.edu")) {
			test = true;
			System.out.println("4) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("4) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 5) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing '5'.
		 */
		ram = new RamString("khanma5@vcu.edu"); // RamString object set to an email string containing '5'.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 15); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaV@vcu.edu")) {
			test = true;
			System.out.println("5) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("5) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 6) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing '6'.
		 */
		ram = new RamString("khanma6@vcu.edu"); // RamString object set to an email string containing '6'.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 15); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaVI@vcu.edu")) {
			test = true;
			System.out.println("6) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("6) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 7) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing '7'.
		 */
		ram = new RamString("khanma7@vcu.edu"); // RamString object set to an email string containing '7'.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 15); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaVII@vcu.edu")) {
			test = true;
			System.out.println("7) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("7) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 8) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing '8'.
		 */
		ram = new RamString("khanma8@vcu.edu"); // RamString object set to an email string containing '8'.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 15); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaVIII@vcu.edu")) {
			test = true;
			System.out.println("8) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("8) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 9) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing '9'.
		 */
		ram = new RamString("khanma9@vcu.edu"); // RamString object set to an email string containing '9'.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 15); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaIX@vcu.edu")) {
			test = true;
			System.out.println("9) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("9) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 10) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing multiple and separate digits.
		 */
		ram = new RamString("khan9ma4@vcu.edu"); // RamString object set to an email string containing '9' and '4' separately.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 16); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanIXmaIV@vcu.edu")) {
			test = true;
			System.out.println("10) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("10) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 11) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing two digits together.
		 */
		ram = new RamString("khanma14@vcu.edu"); // RamString object set to an email string containing '1' and '4' together.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 16); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaIIV@vcu.edu")) {
			test = true;
			System.out.println("11) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("11) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 12) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * works with an email containing two digits together.
		 */
		ram = new RamString("khanma@vcu.edu"); // RamString object set to an email string containing no digits.
		ram.convertDigitsToRomanNumeralsInSubstring(1, 14); // Sets the startPostion and endPosition for the string correctly.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanma@vcu.edu")) {
			test = true;
			System.out.println("12) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("12) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 13) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * can throw a IllegalArgumentException if startPosition
		 * is greater than endPosition.
		 */
		ram = new RamString("khanma4@vcu.edu"); // RamString object set to an email string containing '4'.
		ram.convertDigitsToRomanNumeralsInSubstring(15, 1); // Sets the startPostion greater than the endPosition in order to invoke an IllegalArgumentException.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaIV@vcu.edu")) {
			test = true;
			System.out.println("13) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("13) " + test); // false is printed if the object doesn't matches what is expected.
		}
		
		/**
		 * 14) This test checks whether convertDigitsToRomanNumeralsInSubstring 
		 * can throw a MyIndexOutOfBoundsException if startPosition
		 * and/or endPosition are out of range. NOTE: to perform this test case, 
		 * comment out the above test case (#13) for 
		 * convertDigitsToRomanNumeralsInSubstring method.
		 */
		ram = new RamString("khanma4@vcu.edu"); // RamString object set to an email string containing '4'.
		ram.convertDigitsToRomanNumeralsInSubstring(0, 15); // Sets the startPostion at 0 when it should be at 1, causing a MyIndexOutOfBoundsException.
		test = false;
		// String created from convertDigitsToRomanNumeralsInSubstring method is checked 
		// to see if it matches what's to be expected by using the getWackyString method.
		if(ram.getWackyString().equals("khanmaIV@vcu.edu")) {
			test = true;
			System.out.println("14) " + test); // true is printed if the object matches what is expected.
		}
		else {
			System.out.println("14) " + test); // false is printed if the object doesn't matches what is expected.
		}
	}
}