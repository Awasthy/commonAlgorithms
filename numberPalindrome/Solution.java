public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = reverse(x);
        
        if (rev == x) {
            return true;
        }
        return false;
    }
    
    public int reverse(int x) {
        if (x % 10 == x) {
            return x;
        }
        int deg = 0;
        int num = x;
        while (num != 0) {
            num = num / 10;
            deg++;
        }
        
        long output = 0;
        for (int i = deg - 1; i >= 0; i--) {
            output = output + (long)(Math.pow(10, i)) * (x % 10);
            x = x / 10;
        }
        
        if (output > Integer.MAX_VALUE || output < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int)output;
        }
    }
}