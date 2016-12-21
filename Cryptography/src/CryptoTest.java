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
		assertEquals(".... . -.-- ", Crypto.toMorseCode("Hey"));
	}

	@Test
	public void testFromMorseCode() {
		assertEquals("GEX", Crypto.reverse("--. . -..- "));
	}
	
	@Test
	public void testToNumeric() {
		assertEquals("104101121", Crypto.toNumeric("hey"));
	}
	
	@Test
	public void testCaesarShift() {
		assertEquals("ifz", Crypto.caesarShift("hey", 1));
	}
	
	@Test
	public void testSingleFrequencyCount() {
		char target = 'h';
		
		assertEquals(1, Crypto.singleFrequencyCount("hey", target));
	}
	
	@Test
	public void testfullFrequencyCount()
	{
		assertEquals(1, Crypto.fullFrequencyCount("a")[0]);
	}
	
	@Test
	public void testSubstitution()
	{	
		String[] morse =  { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
				 "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
				 "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		assertEquals(Crypto.substitution("yo", morse), "-.-- --- ");
	}
}
