/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // 递归
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return 1;
        else{
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return leftDepth>rightDepth ? leftDepth+1 : rightDepth+1;
        }
    }
}
