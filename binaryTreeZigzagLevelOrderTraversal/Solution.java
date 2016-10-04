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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        Stack<Integer> innerStack = new Stack<Integer>();
        Queue<Integer> innerQueue = new LinkedList<Integer>();
        boolean flag = true;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.remove();
                if (flag) {
                    innerQueue.add(temp.val);
                } else {
                    innerStack.push(temp.val);
                }
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            List<Integer> innerList = new ArrayList<Integer>();
            if (flag) {
                while (innerQueue.size() > 0) {
                    innerList.add(innerQueue.remove());
                }
            } else {
                while (innerStack.size() > 0) {
                    innerList.add(innerStack.pop());
                }
            }
            result.add(innerList);
            flag = !flag;
        }
        return result;
    }
}