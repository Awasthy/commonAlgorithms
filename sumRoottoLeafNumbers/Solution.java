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
    public int sumNumbers(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traverse(root, 0, list);
        return sum(list);
    }
    
    private int sum (List<Integer> list) {
        int sum = 0;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            sum += it.next();
        }
        return sum;
    }
    
    private void traverse (TreeNode node, int currentNum, List<Integer> list) {
        if (node == null) {
            return;
        }
        currentNum = (currentNum * 10) + node.val;
        if (node.left == null && node.right == null) {
            list.add(currentNum);
        }
        if (node.left != null)
            traverse(node.left, currentNum, list);
        if (node.right != null)    
            traverse(node.right, currentNum, list);
    }
}