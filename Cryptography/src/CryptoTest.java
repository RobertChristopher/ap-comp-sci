import static org.junit.Assert.*;
import org.junit.Test;


public class CryptoTest {

	@Test
	public void testShorten() {
		assertEquals("THECOWANDTHECLOCKTOWER", 
				Crypto.shorten("the cow and the clock tower"));
	}
	
	@Test
	public void testShortenSymbols() {
		assertEquals("THECOWANDTHECLOCKTOWER",
				Crypto.shorten("THE COW AND THE CLOCK TOWER"));
	}
	
	@Test
	public void testToMorseCode() {
		System.out.println(Crypto.toMorseCode("Hey"));
	}

	@Test
	public void testFromMorseCode() {
		System.out.println(Crypto.reverse("--. . -..- "));
	}
	
	@Test
	public void testToNumeric() {
		System.out.println(Crypto.toNumeric("hey"));
	}
	
	@Test
	public void testCaesarShift() {
		System.out.println(Crypto.caesarShift("hey", 1));
	}
	
	@Test
	public void testSingleFrequencyCount() {
		char target = 'h';
		
		System.out.println(Crypto.singleFrequencyCount("hey", target));
	}
}
