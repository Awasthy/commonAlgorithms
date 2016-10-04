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
    /*
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (!(root == null)) {
            if (isLeaf(root.left)) {
                sum = sum + root.left.val;
            } else 
                sum += sumOfLeftLeaves(root.left);
            sum += sumOfLeftLeaves(root.right);
        }
        
        return sum;
    }
    
    private boolean isLeaf (TreeNode node) {
        if (node == null) {
            return false;
        }
        
        if (node.left == null && node.right == null) {
            return true;
        }
        
        return false;
    }
    */
    
    public int sumOfLeftLeaves (TreeNode root) {
        if (root == null) {
            return 0;
        }
        return (leafSum(root.left, true, 0) + leafSum(root.right, false, 0));
    }
    
    private int leafSum (TreeNode node, boolean isLeft, int sum) {
        if (node == null) {
            return 0;
        }
        if (isLeft && node.left == null && node.right == null) {
            return sum + node.val;
        } else {
            return (leafSum(node.left, true, sum) + leafSum(node.right, false, sum));
        }
    }
}