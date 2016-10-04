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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        traverse(root, 1, k, list);
        return list.get(k - 1);
    }
    
    private void traverse (TreeNode node, int i, int k, List<Integer> list) {
        if (node == null) {
            return;
        }
        traverse(node.left, i, k, list);
        list.add(node.val);
        if (list.size() == k) {
            return;
        }
        traverse(node.right, i, k, list);
    }
}