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
    public boolean isBalanced(TreeNode node) {
        if (node == null) {
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int diff = Math.abs(leftHeight - rightHeight);
        return (diff < 2 && isBalanced(node.right) && isBalanced(node.left));
    }
    
    private int height (TreeNode node) {
        if (node == null) {
            return 0;
        }
        return (Math.max(height(node.left), height(node.right)) + 1);
    }
}