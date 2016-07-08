public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }
        HashSet<Integer> al = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (hs.contains(nums2[i])) {
                al.add(nums2[i]);
            }
        }
        int arr[] = new int[al.size()];
        int p = 0;
        Iterator it = al.iterator();
        while(it.hasNext()) {
            arr[p] = (int)it.next();
            p++;
        }
        return arr;
    }
}