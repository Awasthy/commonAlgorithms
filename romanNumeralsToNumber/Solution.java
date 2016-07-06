public class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('M', 1000);
        hm.put('D', 500);
        hm.put('C', 100);
        hm.put('L', 50);
        hm.put('X', 10);
        hm.put('V', 5);
        hm.put('I', 1);
        int count = hm.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if ((int)hm.get(s.charAt(i)) < (int)hm.get(s.charAt(i + 1))) {
                count = count - (int)hm.get(s.charAt(i));
            } else {
                count = count + (int)hm.get(s.charAt(i));
            }
        }
        return count;
    }
}