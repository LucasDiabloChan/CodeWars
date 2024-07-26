  /*
   - Author: Asher_Ren
   - Code Wars Kata: longest_palindrome? (available in: https://www.codewars.com/kata/54bb6f887e5a80180900046b)
   - Description: check various substrings combinations from a string and then return the longest palindrome size found
   - Date: 26/07/2024
  */

public class Palindromes {
   public static int longestPalindrome(final String s) {
        if(s.length() < 1)
            return 0;
     
        if(s.length() == 1)
            return 1;
      
        StringBuilder sb = new StringBuilder();
        int greaterSequence = 0;
      
        for(int i = 0; i <= s.length(); i++){            
            int k = i;  
            
            do{
                String str = s.substring(i, k);
                                
                if(isPalindrome(str))
                    greaterSequence = (greaterSequence < str.length()) ? str.length() : greaterSequence;
                
                k++;
            }while(k <= s.length());
        }
      
        return greaterSequence;
    }
  
    private static boolean isPalindrome(final String str){
        StringBuilder sb = new StringBuilder(str);
        return (str.equals(sb.reverse().toString()));
    }
}
