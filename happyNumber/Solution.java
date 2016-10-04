public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int sqSum = n;
        while (!hs.contains(sqSum)) {
            hs.add(sqSum);
            sqSum = findSqSum(sqSum);
            if (sqSum == 1) {
                return true;
            }
        }
        return false;
    }
    
    private int findSqSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit);
            num = num / 10;
        }
        return sum;
    }
}