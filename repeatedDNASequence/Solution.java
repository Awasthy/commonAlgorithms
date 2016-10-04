public class Solution {
    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    List<String> list = new ArrayList<String>();
    public List<String> findRepeatedDnaSequences(String s) {
        for (int i = 0; i <= s.length() - 10; i++) {
            String substr = s.substring(i, i+ 10);
            if (hm.containsKey(substr)) {
                int count = hm.get(substr);
                count++;
                hm.put(substr, count);
            } else {
                hm.put(substr, 1);
            }
        }
        
        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if ((int)pair.getValue() > 1)
                list.add((String)pair.getKey());
        }
        return list;
    }
}