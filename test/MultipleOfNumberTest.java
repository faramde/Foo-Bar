package foo_bar;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class  to check the divisiblity of a number 
 * depending on the input number.
 * 
 * @author Fikre Aramde
 *
 */
public class MultipleOfNumberTest {

	@Test
	public void testFindMultipleOfNumber() {
		MultipleOfNumber multipleOfNumber = new MultipleOfNumber();
		
		// test return "foo" if the number is divisible by 3
		assertEquals("foo", multipleOfNumber.findMultipleOfNumber(3));

		// test return "bar" if the number is divisible by 5
		assertEquals("bar", multipleOfNumber.findMultipleOfNumber(5));

		// test return "foobar" if the number is divisible by 15
		assertEquals("foobar", multipleOfNumber.findMultipleOfNumber(15));

		// test return the same number if no other requirement is met.
		assertEquals("1", multipleOfNumber.findMultipleOfNumber(1));
	}

}
