/*
 - Author: Asher_ren
 - Kata: Pyramid Array
*/

import java.util.Arrays;

public class PyramidArray {
    private static int fillWith = 1;
    
    public static int[][] pyramid(int n){
        if(n < 1)
            return new int[0][0];
      
        int[][] m = new int [n][];

        do{
            final int[] line = new int[n];
            Arrays.fill(line, Kata.fillWith);
            m[--n] = line;
        }while(n > 0);

        return m;
    }
}
