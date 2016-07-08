public class Solution {
    public boolean isPowerOfFour(int num) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int p = 1;
        while (p > 0) {
            hs.add(p);
            p = p << 2;
        }
        if (hs.contains(num))
            return true;
        else
            return false;
    }
}