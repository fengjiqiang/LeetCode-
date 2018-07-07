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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> out=new ArrayList<Integer>();
        Stack<TreeNode> s=new Stack<TreeNode>();
        Stack<Integer> s2=new Stack<Integer>();
        if(root==null){
            return out;
        }
        s.push(root);
        while(!s.isEmpty()){
            TreeNode temp=s.pop();
            if(temp.left!=null){
                s.push(temp.left);
            }
             
            if(temp.right!=null){
                s.push(temp.right);
            }
            s2.push(temp.val);
        }
        while(!s2.isEmpty()){
            out.add(s2.pop());
        }
        return out;
    }
}
