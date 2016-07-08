public class Solution {
    public String reverseString(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
}