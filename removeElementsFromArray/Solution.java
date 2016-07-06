public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        
        while (j != nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        nums = Arrays.copyOfRange(nums, 0, i);
        
        return nums.length;
    }
}