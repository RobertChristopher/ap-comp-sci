import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import java.lang.*;

public class WarmupMethodsTest {
	
	@Test
	public void testOnlyVowels() {
		assert(WarmupMethods.onlyVowels("AEIOU")).equals(true);
		assert(WarmupMethods.onlyVowels("akEIdoU")).equals(false);
	}
	
	@Test
	public void numVowelStrings()
	{
		List<String> input = new ArrayList<String>();
		input.add("rob");
		input.add("AEOIU");
		
		assert(WarmupMethods.numVowelStrings(input) == 1);
	}
}
