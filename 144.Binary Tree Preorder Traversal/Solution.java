/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //迭代
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> out=new ArrayList<Integer>();
        Stack<TreeNode> s=new Stack<TreeNode>();
        if(root==null){
            return out;
        }
        s.push(root);
        while(!s.isEmpty()){
            TreeNode temp=s.pop();
            out.add(temp.val);
            if(temp.right!=null){
                s.push(temp.right);
            }
            if(temp.left!=null){
                s.push(temp.left);
            }
        }
        return out;
    }
}
