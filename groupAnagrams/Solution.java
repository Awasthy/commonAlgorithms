public class Solution {
    List<List<String>> result = new ArrayList<List<String>>();
    HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
    
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<String> l = new ArrayList<String>();
        // return p;
        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String tempStr = new String(temp);
            if (!hm.containsKey(tempStr)) {
                List<String> list = new ArrayList<String>();
                list.add(strs[i]);
                hm.put(tempStr, list);
            } else {
                List<String> list = hm.get(tempStr);
                list.add(strs[i]);
                hm.put(tempStr, list);
            }
        }
        
        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            result.add((List<String>)pair.getValue());
        }
        return result;
    }
}