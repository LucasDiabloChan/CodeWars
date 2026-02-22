/**
- Solved at 22/02/2026
*/

public class Kata {

	public static int[][] matrixMultiplication(int[][] a, int[][] b) {

		int[][] c = new int[a.length][b[0].length];

		int resultLine = 0;
		int indexToSave = 0;

		for(int indexA = 0; indexA < a.length; indexA++) {
      for(int column = 0; column < b[0].length; column++){
        for(int indexB = 0; indexB < b[0].length; indexB++) {
    			int multiplierA = a[indexA][indexB];
    			int multiplierB = b[indexB][column];
          
          resultLine += multiplierA * multiplierB;
                    
    			// finished the new element
    			if(indexB == (b[0].length-1)){
    			  c[indexA][indexToSave] = resultLine;
    				indexToSave = (indexToSave + 1) % b[0].length;
    				resultLine = 0;
    			}
    		}
			}
		}

		return c;
	}
}
