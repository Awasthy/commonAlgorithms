public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        return findIndex(nums, low, high, target);
    }
    
    private int findIndex(int[] nums, int low, int high, int target) {
        if (nums[low] >= target) {
            return low;
        }
        if (nums[high] < target) {
            return high + 1;
        }
        if (nums[high] == target) {
            return high;
        }
        if (low == high) {
            if (target < nums[low]) {
                return low;
            } else {
                return (high + 1);
            }
        }
        int mid = low + ((high - low) / 2);
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return findIndex(nums, (mid + 1), (high), target);
        } else {
            return findIndex(nums, (low), (mid - 1), target);
        }
    }
}