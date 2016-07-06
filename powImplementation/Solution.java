public class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE - 1; // odd even wala funda
            } else {
                n = - n;                
            }
        }
        
        if (n == 0) {
            return 1;
        } else {
            double temp = myPow(x, n/2);
            if (n % 2 == 0) {
                return (temp * temp);
            } else {
                return (x * temp * temp);
            }
        }
    }
}