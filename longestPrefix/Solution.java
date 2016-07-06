public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0 || strs == null) {
            return "";
        }
        if (len == 1) {
            return strs[0];
        }
        
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        if (minLen == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str0 = strs[0];
        int count = Integer.MAX_VALUE;
        for (int i = 1; i < len; i++) {
            int current = 0;
            for (int j = 0; j < minLen; j++) {
                if (strs[i].charAt(j) == str0.charAt(j)) {
                    current++;
                } else {
                    break;
                }
            }
            count = Math.min(count, current);
        }
        if (count == str0.length()) {
            return str0;
        }
        return str0.substring(0, count);
    }
}