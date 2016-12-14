import java.util.*;

public class WarmupMethods {
	
	public static final char[] VOWELS = {
		'A', 'E', 'I', 'O', 'U'
	};
	
	public static Boolean onlyVowels( String input )
	{
		
		char[] inputChars = input.toCharArray();
		int numVowels = 0;
		
		for(char inputChar: inputChars)
		{
			for(char vowel: WarmupMethods.VOWELS)
			{
				if(vowel == inputChar)
				{
					numVowels++;
				}
			}
		}
		
		return numVowels == input.length();
	}
	
	public static int numVowelStrings ( List<String> values )
	{	
		int numVowels = 0;
		
		for(String vowelString: values)
		{
			if( WarmupMethods.onlyVowels(vowelString) )
			{
				numVowels++;
			}
		}
		
		return numVowels;
	}
}
