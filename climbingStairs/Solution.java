public class Solution {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        hm.put(n - 1, 1);
        hm.put(n - 2, 2);
        
        for (int i = n - 1; i >= 0; i--) {
            jumpFrom(i);
        }
        return hm.get(0);
    }
    
    private int jumpFrom(int i) {
        if (hm.containsKey(i)) {
            return hm.get(i);
        } else {
            int p = jumpFrom(i + 1);
            int q = jumpFrom(i + 2);
            hm.put(i, p + q);
            return p + q;
        }
    }
}