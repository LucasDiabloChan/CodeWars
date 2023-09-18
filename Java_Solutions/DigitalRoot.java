public class DigitalRoot {
  public static int digital_root(int n) {
    n = Math.abs(n);
    
    if(n < 10)
      return n;
    
    String numStr = String.valueOf(n);
    int sum = 0;
    
    for(int i = 0; i < numStr.length(); i++){
      sum += Character.digit(numStr.charAt(i), 10);
    }
    
    return (sum < 9) ? sum : digital_root(sum);
  }
}
