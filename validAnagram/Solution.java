public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String sNew = new String(ch1);
        String tNew = new String(ch2);
        return sNew.equals(tNew);
    }
}