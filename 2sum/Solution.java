public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                ans[1] = i;
                ans[0] = hm.get(target - nums[i]);
                return ans;
            } else {
                hm.put(nums[i], i);
            }
        }
        return ans;
    }
}