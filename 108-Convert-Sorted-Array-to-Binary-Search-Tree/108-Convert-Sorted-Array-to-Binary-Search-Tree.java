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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedTree(nums, 0, nums.length - 1);
    }
    
    //binary search
    public TreeNode sortedTree(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        
        //pick the middle node as mid node
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedTree(nums, start, mid - 1);
        node.right = sortedTree(nums, mid + 1, end);
        return node;
    }
}