public class Solution {
    public int getSum(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        if (min >= 0) {
            for (; min > 0; min--)
                max++;
        } else {
            for (; min < 0; min++)
                max--;
        }
        return max;
    }
}