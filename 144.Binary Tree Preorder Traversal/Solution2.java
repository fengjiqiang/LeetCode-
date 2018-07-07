/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //递归
public class Solution2 {
    ArrayList<Integer> out =new ArrayList<Integer>();
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return out;
        }
        
        out.add(root.val);
        if(root.left!=null)
        preorderTraversal(root.left);
        if(root.right!=null)
        preorderTraversal(root.right);
        return out;
    }
}
