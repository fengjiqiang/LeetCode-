/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//递归
import java.util.ArrayList;
public class Solution2 {
    ArrayList<Integer> out =new ArrayList<Integer>();
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return out;
        }
        
        out.add(root.val);
        if(root.left!=null)
        postorderTraversal(root.left);
        if(root.right!=null)
        postorderTraversal(root.right);
        return out;
    }
}
