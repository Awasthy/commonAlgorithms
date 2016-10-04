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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> values;
        List<List<Integer>> levelNodes = new ArrayList<List<Integer>>();
        if (root == null) {
            return levelNodes;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while (queue.size() != 0) {
            int size = queue.size();
            values = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.remove();
                values.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            levelNodes.add(values);
        }
        return levelNodes;
    }
}