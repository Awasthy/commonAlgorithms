/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        Stack<Integer> stack = new Stack<Integer>();
        List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
        pathSum(root, stack, listOfList, sum, 0);
        return listOfList;
    }
    
    private void pathSum (TreeNode node, Stack<Integer> stack, List<List<Integer>> listOfList, int sum, int currentSum) {
        if (node == null) {
            return;
        }
        currentSum = currentSum + node.val;
        stack.push(node.val);
        if (node.left == null && node.right == null && currentSum == sum) {
            List<Integer> list = new ArrayList<Integer>();
            Iterator<Integer> it = stack.iterator();
            while (it.hasNext()) {
                list.add(it.next());
            }
            listOfList.add(list);
        }
        pathSum (node.left, stack, listOfList, sum, currentSum);
        pathSum (node.right, stack, listOfList, sum, currentSum);
        stack.pop();
    }
}