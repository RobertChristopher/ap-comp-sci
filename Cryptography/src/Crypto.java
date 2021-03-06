import java.lang.reflect.Array;
import java.util.Arrays;

public class Crypto {
	
	private static final String[] MORSE =  {
		".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
		"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
		"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

	private static final int SINGLE_FREQUENCY_INCREMENT = 1;
	private static final int ALPHABET_START_INDEX = 65;
	private static final int ALPHABET_STOP_INDEX = 90;
	
	public static String shorten(String sequence) {
		
		if(sequence == null) {
			return "";
		}
		
		sequence = sequence.toUpperCase();
		sequence = sequence.replaceAll("[^A-Z]", "");
		
		return sequence;
	}
	
	
	public static String toMorseCode(String sequence) {
		sequence = shorten(sequence);
		String finalAnswer = "";
		
		for(int i = 0; i < sequence.length(); i++) {
			char currentChar = sequence.charAt(i);
			int morseLetter = sequence.charAt(i);
			morseLetter -= 'A';
					
			finalAnswer += MORSE[morseLetter];
			finalAnswer += " ";
		}
		
		return finalAnswer;
	}
	
	
	private int getNumericRepresentation(char token) {
		return (int)(token);
	}
	
	
	public static String reverse(String sequence) {
		sequence = sequence.toUpperCase();
		String[] tokens = sequence.split(" ");
		String finalAnswer = "";
		
		for(int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			int morseIndex = Arrays.asList(MORSE).indexOf(token);
			char decodedLetter = (char) ('A' + morseIndex);
			
			finalAnswer += decodedLetter;
		}
		
		return finalAnswer;
	}
	
	
	public static String toNumeric(String sequence) {
		String numericSequence = "";
		
		for(int i = 0; i < sequence.length(); i++) {
			int currentChar = sequence.charAt(i);
			numericSequence += currentChar;
		}
		
		return numericSequence;
	}
	
	
	public static String caesarShift(String sequence, int shift) {
		String shiftedSequence = "";
		
		for(int i = 0; i < sequence.length(); i++) {
			int currentChar = sequence.charAt(i);
			currentChar += shift;
			
			shiftedSequence += (char)(currentChar);
		}
		
		return shiftedSequence;
	}
	
	public static int singleFrequencyCount(String sequence, char target) {
		int targetCount = 0;
		
		for(int i = 0; i < sequence.length(); i++)
		{
			char currentChar = sequence.charAt(i);
			if(currentChar == target) {
				targetCount += SINGLE_FREQUENCY_INCREMENT;
			}
		}
		
		return targetCount;
		
	}
	
	public static int[] fullFrequencyCount(String sequence) {
		int[] frequencyValues = new int[Crypto.MORSE.length];
		sequence = sequence.toUpperCase();
		String[] tokens = sequence.split(" ");
		
		for(int i = 0; i < Crypto.MORSE.length; i++)
		{	
			int occurences = 0;
			String code = Crypto.MORSE[i];
			for(String token: tokens)
			{	
				String reversed = Crypto.reverse(code);
				if(token.compareTo(reversed) == 0)
				{	
					occurences++;
				}
			}
			
			frequencyValues[i] = occurences;
		}

		return frequencyValues;
	}
	
	public static String substitution(String sequence, String[] alphabet) {
		sequence = shorten(sequence);
		String finalAnswer = "";
		
		for(int i = 0; i < sequence.length(); i++) {
			char currentChar = sequence.charAt(i);
			int morseLetter = sequence.charAt(i);
			morseLetter -= 'A';
					
			finalAnswer += alphabet[morseLetter];
			finalAnswer += " ";
		}
		
		return finalAnswer;
	}
		
}
