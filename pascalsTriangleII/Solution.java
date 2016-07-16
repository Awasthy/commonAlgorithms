public class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();    
    public List<Integer> getRow(int rowIndex) {
        for (int i = 0; i <= rowIndex; i++) {
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
        List<Integer> answer = result.get(result.size() - 1);
        return answer;
    }
}
