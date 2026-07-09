// Last updated: 09/07/2026, 15:08:37
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (q.size() > 0) {
            int m = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                TreeNode curr = q.poll();
                temp.add(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            if (level % 2 == 1) {
                Collections.reverse(temp);
            }
            ans.add(temp);
            level++;
        }
        return ans;
    }
}