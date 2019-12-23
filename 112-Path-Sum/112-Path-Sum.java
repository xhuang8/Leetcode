/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*If the node is empty: False.
If the node is a leaf node: determine whether the current weight sum is equal to the target value.
If the node is not a leaf node: recursively process its left and right subtrees.*/

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
       //if the root is null, return false
        if(root == null){
            return false;
        }
        
        //if value of root is equal to the sum, if it is and no child, return true
        if(root.val == sum){
            if(root.left == null && root.right == null){
                return true;
            }
        }
        
        //all is not equal, then start to recursive to judge the left or right tree equal to sum-val
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}