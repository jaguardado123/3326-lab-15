import static org.junit.Assert.*;
import org.junit.Test;

public class RecursiveTest {
	
	@Test
	public void testing_pow() {
		// 2^3 should equal 8
		assertEquals(8, Recursive.pow(2,3));
		// 3^4 should equal 81
		assertEquals(81, Recursive.pow(3,4));
		// 5^4 should equal 625
		assertEquals(625, Recursive.pow(5,4));
	}

	@Test
	public void testing_sumN() {
		// sum of 1 to 3 should equal 6
		assertEquals(6, Recursive.sumN(3));
		// sum of 1 to 5 should equal 15
		assertEquals(15, Recursive.sumN(5));
		// sum of 1 to 7 should equal 28
		assertEquals(28, Recursive.sumN(7));
	}

	@Test
	public void testing_search() {
		// searching for "Howdy" should return false
		String[] words = {"hello", "hey", "sup", "oi"};
		assertEquals(false, Recursive.search(words, "Howdy", 0));
		// searching for "grapes" should return true
		String[] foods = {"apple", "orange", "grapes", "bananas"};
		assertEquals(true, Recursive.search(foods, "grapes", 0));
		// searching for "hi" should return false
		String[] empty = {};
		assertEquals(false, Recursive.search(empty, "hi", 0));
	}
}
