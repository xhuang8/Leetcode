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
    public int minDepth(TreeNode root) {
        //one node has threee siutaton
        //empty
        //either left tree or right tree is empty, caluclus the depth of either left or right
        //both are empty, compare which one is smaller
        
        if(root == null){
            return 0;
        }
        
        //left tree and right tree both empty
        if(root.left == null && root.right == null){
            return 1;//root node
        }
        
        //left tree empty
        if(root.left == null){
            return minDepth(root.right) + 1;//calculus the depth of the right tree
        }
        
        //right tree empty
        if(root.right == null){
            return minDepth(root.left) + 1;//calculus the depth of the left tree
        }
        
        return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
    }
    
}