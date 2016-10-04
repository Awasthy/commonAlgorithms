public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m - 1;
        for (int i = nums1.length - 1; i > nums1.length - 1 - m; i--) {
            nums1[i] = nums1[mIndex];
            mIndex--;
        }
        
        int i = 0;
        int nIndex = 0;
        mIndex = nums1.length - m;
        while (i != m + n) {
            if (mIndex < nums1.length && nIndex < nums2.length) {
                if (nums1[mIndex] < nums2[nIndex]) {
                    nums1[i] = nums1[mIndex];
                    mIndex++;
                    i++;
                } else {
                    nums1[i] = nums2[nIndex];
                    nIndex++;
                    i++;    
                }
            } else if (mIndex >= nums1.length) {
                nums1[i] = nums2[nIndex];
                nIndex++;
                i++;
            } else if (nIndex >= nums2.length) {
                nums1[i] = nums1[mIndex];
                mIndex++;
                i++;
            }
        }
        for (; i < nums1.length; i++) {
            nums1[i] = 0;
        }
    }
}