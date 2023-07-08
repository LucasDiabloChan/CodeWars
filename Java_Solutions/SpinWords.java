/*
 * Description: Spin a word if she is greater than 5 digits;
 * Author: LucasDiabloChan
 * Created at: 08/07/2023
*/

public class SpinWords {
  public String spinWords(String sentence) {
        
    String words[] = sentence.split(" ");
    String phrase = "";
    
    for(int i = 0; i < words.length; i++){
      if(words[i].length() > 4){
        words[i] = String.valueOf(new StringBuilder(words[i]).reverse());
      }
      
      // If it's the last word don't add a blank space
      if(i == words.length - 1)
        phrase += words[i];
      else
        phrase += words[i] + " ";
    }
    
    return phrase;
  }
}
