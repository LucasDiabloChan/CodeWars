/*
 * Description: Sum all 1's of a binary number
 * Author: Asher Ren (Lucas)
 * Created at: 01/07/2023
*/

public class BitCounting {
	public static int countBits(int n){

		// Get the binary value from the given integer
		final String valBinario = Integer.toBinaryString(n);
	    
		// Get the char array from the binary value
		char[] binario = valBinario.toCharArray();

		int soma = 0;

		// Sum every digit equals '1'
	    for(char digit : binario){
	      if(digit == '1')
	        soma++;
	    }
    
    	return soma;
	}
}
