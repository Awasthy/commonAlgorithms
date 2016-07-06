public class Solution {
    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int low = 0;
        int high = height.length - 1;
        int current = 0;
        int max = 0;
        while (low < high) {
            current = (high - low) * Math.min(height[high], height[low]);
            max = Math.max(max, current);
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}