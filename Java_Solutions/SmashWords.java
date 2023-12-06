import java.util.Arrays;

public class SmashWords {
	public static String smash(String... words) {
        
    if(!(words.length > 1))
      return (words.length == 0) ? "" : words[0];
    
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < words.length; i++){
      if(i != 0)
        sb.append(" ".concat(words[i]));
      else
        sb.append(words[i]);
    }
    
    return sb.toString();
  }
}
