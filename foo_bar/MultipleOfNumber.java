package foo_bar;

/**
 * This class will check if the number is divisible with the given input and 
 * return string depending on the input number.
 * 
 * @author Fikre Aramde
 *
 */
public class MultipleOfNumber {
	public MultipleOfNumber() {}
	
	/**
	 * This Method will return the result of "foo," "bar," or "foobar" depending on the input.
	 * Return "foo" if the number is divisible by 3
	 * Return "bar" if the number is divisible by 5
	 * Return "foobar" if the number is divisible by 15
	 * Return the same number if no other requirement is met.
	 * 
	 * @param number 	input number.
	 * @return			the result of "foo," "bar," or "foobar" depending on the input.
	 */
	public String findMultipleOfNumber(int number) {
		if(number % 15 == 0) {
			return  "foobar";
		} else {
			if(number % 3 == 0) {
				return  "foo";
			}
			if(number % 5 == 0) {
				return  "bar";
			} 
		}
		return Integer.toString(number);
	}

}
