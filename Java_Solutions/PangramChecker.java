// This algorithm is based on opened chests controll (from RPGs games)

public class PangramChecker {
  public boolean check(String sentence){
    StringBuffer alphabetBoolean = new StringBuffer("00000000000000000000000000");
    
    for(int i = 0; i < sentence.length(); i++){
      switch(sentence.toLowerCase().charAt(i)){
          case 'a' -> alphabetBoolean.setCharAt(0, '1');
          case 'b' -> alphabetBoolean.setCharAt(1, '1');
          case 'c' -> alphabetBoolean.setCharAt(2, '1');
          case 'd' -> alphabetBoolean.setCharAt(3, '1');
          case 'e' -> alphabetBoolean.setCharAt(4, '1');
          case 'f' -> alphabetBoolean.setCharAt(5, '1');
          case 'g' -> alphabetBoolean.setCharAt(6, '1');
          case 'h' -> alphabetBoolean.setCharAt(7, '1');
          case 'i' -> alphabetBoolean.setCharAt(8, '1');
          case 'j' -> alphabetBoolean.setCharAt(9, '1');
          case 'k' -> alphabetBoolean.setCharAt(10, '1');
          case 'l' -> alphabetBoolean.setCharAt(11, '1');
          case 'm' -> alphabetBoolean.setCharAt(12, '1');
          case 'n' -> alphabetBoolean.setCharAt(13, '1');
          case 'o' -> alphabetBoolean.setCharAt(14, '1');
          case 'p' -> alphabetBoolean.setCharAt(15, '1');
          case 'q' -> alphabetBoolean.setCharAt(16, '1');
          case 'r' -> alphabetBoolean.setCharAt(17, '1');
          case 's' -> alphabetBoolean.setCharAt(18, '1');
          case 't' -> alphabetBoolean.setCharAt(19, '1');
          case 'u' -> alphabetBoolean.setCharAt(20, '1');
          case 'v' -> alphabetBoolean.setCharAt(21, '1');
          case 'w' -> alphabetBoolean.setCharAt(22, '1');
          case 'x' -> alphabetBoolean.setCharAt(23, '1');
          case 'y' -> alphabetBoolean.setCharAt(24, '1');
          case 'z' -> alphabetBoolean.setCharAt(25, '1');
      }
    }
    
    return (alphabetBoolean.indexOf("0") == -1);
  }
}
