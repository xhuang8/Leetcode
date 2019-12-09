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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return symmetric(root.left, root.right);
    }
    
    public boolean symmetric(TreeNode leftL, TreeNode rightR){
        if(leftL == null || rightR == null){
            return leftL == rightR;
        }
        if(leftL.val != rightR.val){
            return false;
        }
        
        return symmetric(leftL.left, rightR.right) && symmetric(leftL.right, rightR.left);
    }
    
}