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
    int min = Integer.MAX_VALUE;
    
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        minDepthUtil(root, 1);
        return min;
    }
    
    private void minDepthUtil (TreeNode node, int current) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            min = Math.min(min, current);
        }
        minDepthUtil(node.left, current + 1);
        minDepthUtil(node.right, current + 1);
    }
}