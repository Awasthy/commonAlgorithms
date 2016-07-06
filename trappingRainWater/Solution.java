public class Solution {
    public int trap(int[] height) {
        int data[] = tallestIndexAndValue(height);
        int index = data[0];
        int value = data[1];
        
        int p = 0;
        int q = height.length - 1;
        
        int total = 0;
        int max = 0;

        while (p < index) {
            if (height[p] > max) {
                max = height[p];
            } else {
                total = total + (max - height[p]);
            }
            p++;
        }
        
        max = 0;
        
        while (q > index) {
            if (height[q] > max) {
                max = height[q];
            } else {
                total = total + (max - height[q]);
            }
            q--;
        }
        
        return total;
    }
    
    private int [] tallestIndexAndValue(int [] height) {
        int index = 0;
        int value = 0;
        
        for (int i = 0; i < height.length; i++) {
            if (height[i] > value) {
                value = height[i];
                index = i;
            }
        }
        int result[] = {index, value};
        return result;
    }
}