public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        
        int i = 0;
        int j = 1;
        
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[i + 1] = nums[j];
                i++;
                j++;
            }
        }
        nums = Arrays.copyOfRange(nums, 0, i + 1);
        return nums.length;
    }
}