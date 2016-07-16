public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int low = 0;
        int high = s.length() - 1;
        while (low <= high) {
            int valueLow = (int)s.charAt(low);
            int valueHigh = (int)s.charAt(high);
            if (!((valueLow >= 97 && valueLow <= 122) || (valueLow >= 48 && valueLow <= 57))) {
                low++;
                continue;
            }
            if (!((valueHigh >= 97 && valueHigh <= 122) || (valueHigh >= 48 && valueHigh <= 57))) {
                high--;
                continue;
            }
            if (valueLow != valueHigh) {
                return false;
            } else {
                low++;
                high--;
            }
        }
        return true;
    }
}