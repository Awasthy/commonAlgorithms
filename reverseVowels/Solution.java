public class Solution {
    public String reverseVowels(String s) {
        int j = s.length();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < j; i++) {
            if (s.charAt(i) == 'a' ||
                s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' ||
                s.charAt(i) == 'u' ||
                s.charAt(i) == 'A' ||
                s.charAt(i) == 'E' ||
                s.charAt(i) == 'I' ||
                s.charAt(i) == 'O' ||
                s.charAt(i) == 'U') {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < j; i++) {
            if (s.charAt(i) == 'a' ||
                s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' ||
                s.charAt(i) == 'u' ||
                s.charAt(i) == 'A' ||
                s.charAt(i) == 'E' ||
                s.charAt(i) == 'I' ||
                s.charAt(i) == 'O' ||
                s.charAt(i) == 'U') {
                    sb.append(st.pop());
                } else {
                    sb.append(s.charAt(i));
                }
        }
        return sb.toString();
    }
}