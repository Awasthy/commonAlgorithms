public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        String s = new String();
        dfs(s, list, n, n);
        return list;
    }
    
    private void dfs (String s, List<String> list, int left, int right) {
        if (left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            list.add(s);
            return;
        }
        if (left > 0) {
            dfs(s + '(', list, left - 1, right);
        }
        if (right > 0) {
            dfs(s + ')', list, left, right - 1);
        }
    }
}