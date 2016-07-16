public class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        permute(nums, low, high);
        return result;
    }
    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void permute(int[] arr, int low, int high) {
        if (low == high) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < arr.length; i++) {
                temp.add(arr[i]);
            }
            result.add(temp);
        } else {
            for (int i = low; i <= high; i++) {
                swap(arr, low, i);
                permute(arr, low + 1, high);
                swap(arr, low, i);
            }
        }
    }
}