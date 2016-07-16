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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        int current = 0;
        return traverse(root, sum, current, false);
    }
    
    private boolean traverse(TreeNode node, int sum, int current, boolean b) {
        current = current + node.val;
        if (node.left != null)
            b = b || traverse(node.left, sum, current, b);
        if (node.right != null)
            b = b || traverse(node.right, sum, current, b);
        if (node.left == null && node.right == null) {
            if (current == sum) {
                return true;
            } 
        }
        return b;
    }
}