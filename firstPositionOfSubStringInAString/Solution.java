public class Solution {
    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();
        
        if (hl < nl) {
            return -1;
        }
        
        if (haystack.equals(needle)  || (hl != 0 && nl == 0)) {
            return 0;
        }
        
        for (int i = 0; i <= hl - nl; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean b = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        b = false;
                    }
                }
                if (b) {
                    return i;
                }
            }
        }
        return -1;
    }
}