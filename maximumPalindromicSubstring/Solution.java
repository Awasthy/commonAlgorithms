public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len == 1 || (len == 2 && (s.charAt(0) == s.charAt(1)))) {
            return s;
        }
        String current = new String();
        String max = new String();
        for (int i = 1; i < len - 1; i++) {
            if (s.charAt(i - 1) == s.charAt(i + 1)) {
                current = maxPalindromicSubstring(i, i, s);
                if (max.length() < current.length()) {
                    max = current;
                }
            } 
            if (s.charAt(i) == s.charAt(i + 1)) {
                current = maxPalindromicSubstring(i, i + 1, s);
                if (max.length() < current.length()) {
                    max = current;
                }
            } 
            if (s.charAt(i) == s.charAt(i - 1)) {
                current = maxPalindromicSubstring(i - 1, i, s);
                if (max.length() < current.length()) {
                    max = current;
                }
            }
            
        }
        return max;
    }
    
    public static String maxPalindromicSubstring(int p, int q, String str) {
        while (str.charAt(p) == str.charAt(q)) {
            p--;
            q++;
            if (p < 0 || q >= str.length()) {
                break;
            }
        }
        String result = str.substring(++p, q);
        return result;
    }
}