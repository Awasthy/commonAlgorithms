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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        preOrder(list, root, "");
        return list;
    }
    
    private void preOrder (List<String> list, TreeNode node, String str) {
        if (node == null) {
            return;
        }
        str = str + node.val;
        if (node.left == null && node.right == null) {
            list.add(str);
            return;
        }
        preOrder(list, node.left, str + "->");
        preOrder(list, node.right, str + "->");
    }
}