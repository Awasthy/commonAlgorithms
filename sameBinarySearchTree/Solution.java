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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuilder sbp = new StringBuilder();
        StringBuilder sbq = new StringBuilder();
        preOrder(p, sbp);
        preOrder(q, sbq);
        return sbp.toString().equals(sbq.toString());

    }
    private void preOrder(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append('e');
            return;
        }
        sb.append(node.val);
        preOrder(node.left, sb);
        preOrder(node.right, sb);
    }
}