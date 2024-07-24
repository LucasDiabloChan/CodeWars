public class PascalsTriangle {
    public static long[] generate(int level) {
      if(level < 1)     
          return new long[0];
      
      if(level == 1)
          return new long[] {1L};
      
      int elementos = 0;
      
      for(int i = level; i > 0; i--)
          elementos += i;
      
      long pascalTriangle[elementos] ;
      
      
      
      int contador = 0;
      while(contador < elementos){
          contador--;
          // to finish
      }
      
      
      
    }
}
