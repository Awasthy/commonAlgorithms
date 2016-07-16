public class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public String convertToTitle(int n) {
        while (n > 0) {
            n--;
            list.add(n % 26);
            n = n / 26;
        }
        StringBuilder sb = new StringBuilder();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            int p = (int)iterator.next();
            int q = p + 65;
            char ch = (char)q;
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}