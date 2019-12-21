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
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != null;
    }
    
    public Integer maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        
        //calculas the max depth for BST left node and right node
        Integer left = maxDepth(root.left);
        Integer right = maxDepth(root.right);
        
        //discuss two situation if the BST is not balanced
        if(left == null || right == null){
            return null;
        }
        if(Math.abs(left - right) > 1){
            return null;
        }
        
        
        return Math.max(left, right) + 1;
    }
}