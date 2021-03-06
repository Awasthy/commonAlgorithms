/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return guessNum(n, 0, n);
    }
    
    private int guessNum(int num, int low, int high) {
        int mid = low + ((high - low) / 2);
        if (guess(mid) == 0) {
            return mid;
        } else if (guess(mid) == -1) {
            return guessNum(num, low, mid - 1);
        } else {
            return guessNum(num, mid + 1, high);
        }
    }
}