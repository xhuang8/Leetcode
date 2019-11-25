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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //p and q equal to null or one of the p and a equal to null
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        
        //if p and is not equal to null, then compare the value
        if(p.val != q.val){
            return false;
        }
        
        //node comparision
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
       
    }
}