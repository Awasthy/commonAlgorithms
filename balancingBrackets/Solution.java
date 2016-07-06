//In simple words:  if opening braces:  push in stack
//                  if closing braces:  if stack empty: return false
//                                      if stack not empty: if top element: corresponding opening braces:   pop the opening braces
//                                                                          not corresponding braces:       push the closing braces
//                  if stack empty: return true
//                  if not: return false
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            }
            if (s.charAt(i) == ')') {
                if (st.isEmpty()) {
                    return false;
                }
                if (st.peek() == '(')
                    st.pop();
                else st.push(s.charAt(i));
            }
            if (s.charAt(i) == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                if (st.peek() == '[')
                    st.pop();
                else st.push(s.charAt(i));
            }
            if (s.charAt(i) == '}') {
                if (st.isEmpty()) {
                    return false;
                }
                if (st.peek() == '{')
                    st.pop();
                else st.push(s.charAt(i));
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }
}