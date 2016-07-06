public class Solution {
    public void sortColors(int[] nums) {
        int z = 0;
        int o = 0;
        int t = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == 0) {
                z++;
            }
            if (nums[i] == 1) {
                o++;
            }
            if (nums[i] == 2) {
                t++;
            }
        }
        for (i = 0; i < z; i++) {
            nums[i] = 0;
        }
        for (; i < z + o; i++) {
            nums[i] = 1;
        }
        for (; i < z + o + t; i++) {
            nums[i] = 2;
        }
    }
}