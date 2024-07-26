import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
	
	@Test
	public void testing_2_pow_3() {
		assertEquals(8, Main.pow(2,3));
	}

	@Test
	public void testing_3_pow_4() {
		assertEquals(81, Main.pow(3,4));
	}

	@Test
	public void testing_5_pow_4() {
		assertEquals(625, Main.pow(5,4));
	}
}