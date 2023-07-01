// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = //
/*
 * Description: Concatenate the square of every digit in a integer value
 * Author: Asher Ren (Lucas)
 * Created at: 01/07/2023
 */
// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = //

public class SquareDigit{
  	public int squareDigits(int n) {
		// Make a String of N value
		final String stringOfN = String.valueOf(n);

		// The final result to be parsed in an integer value
	  	String finalResult = "";

		// Square every digit
		for(int i = 0; i < stringOfN.length(); i++){
			char number = stringOfN.charAt(i);
			
			int numberOfDigit = Character.digit(number, 10);
			
			int square = numberOfDigit * numberOfDigit;
			finalResult += square;
		}

		//Return the integer value of the result
      	return Integer.parseInt(finalResult);
  	}
}
