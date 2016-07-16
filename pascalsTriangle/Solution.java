public class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();    
    public List<List<Integer>> generate(int numRows) {
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<Integer>();
            if (i == 0) {
                list.add(1);
                result.add(list);
            } else {
                List<Integer> previousList = result.get(i - 1);
                list.add(previousList.get(0));
                for (int j = 1; j < previousList.size(); j++) {
                    list.add(previousList.get(j - 1) + previousList.get(j));
                }
                list.add(previousList.get(previousList.size() - 1));
                result.add(list);
            }
        }
        return result;
    }
}