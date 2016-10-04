public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<Character,Character>();
        HashMap<Character,Character> tMap = new HashMap<Character,Character>();
        
        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                if (sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            if (tMap.containsKey(t.charAt(i))) {
                if (tMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
            sMap.put(s.charAt(i), t.charAt(i));
            tMap.put(t.charAt(i), s.charAt(i));
        }
        boolean b = true;
        Iterator it = sMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if ((char)pair.getKey() != tMap.get((char)pair.getValue())) {
                b = false;
            }
        }
        return b;
    }
}