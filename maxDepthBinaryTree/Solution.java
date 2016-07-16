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
    public int maxDepth(TreeNode root) {
        return findMaxDepth(root, 0);
    }
    
    private int findMaxDepth(TreeNode node, int max) {
        if (node == null) {
            return max;
        }
        max = max + 1;
        int p = findMaxDepth(node.left, max);
        int q = findMaxDepth(node.right, max);
        return Math.max(p,q);
    }
}