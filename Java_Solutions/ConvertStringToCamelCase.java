/*
 * Description: This Kata is about to receive a string and parse her to camelCase
 * Author: LucDev
 * Created at: 18/07/2023
 */

public class ConvertStringToCamelCase{
	public static void main(String[] args) {
		System.out.println(toCamelCase("the-Stealth-Warrior"));
	}
	
	static String toCamelCase(String s){
	
		String  words[]     = s.split("[_-]"); // Make an array with every word
		String  finalString = "";    // String to be returned
		boolean isFirstWord = true; // Variable to ignore the first word
		
		// = = = = = = = = = = = = = //
		// Create a camelCase String //
		for(String word : words){
		
			// Ignore the first word
			if(isFirstWord){
				isFirstWord = false;
				finalString += word;
				continue;
			}
		
			// Get the last index of a letter
			int indexOfLastLetter = word.length();
			
			// String with the word in camelCase
			String modifiedWord = "";
			
			// = = = = = = = = = = = = = = = = = = = = = = = = = //
			// Create a word with the first letter in upper case //
			for(int i = 0; i < indexOfLastLetter; i++){
				if(i == 0)
					modifiedWord += String.valueOf(word.charAt(i)).toUpperCase();
				else
					modifiedWord += word.charAt(i);
			}
			// = = = = = = = = = = = = = = = = = = = = = = = = = //
			
			// Concatenate the new word
			finalString += modifiedWord;
		}
		// = = = = = = = = = = = = = //
		
		// Return the final phrase
		return finalString;
	}
}
