public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        rotate(nums, 0, len - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, len - 1);
    }
    private void rotate(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}