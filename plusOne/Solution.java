public class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int carry = 1;
        StringBuilder sb = new StringBuilder();
        for (; i >= 0; i--) {
            int p = digits[i] + carry;
            carry = p / 10;
            p = p % 10;
            sb.append(p);
        }
        if (carry != 0) {
            sb.append(carry);
        }
        char ch[] = sb.reverse().toString().toCharArray();
        int p[] = new int[ch.length];
        
        for (int j = 0; j < ch.length; j++) {
            p[j] = ch[j] - 48;
        }
        
        return p;
    }
}