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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> mainTree = new LinkedList<List<Integer>>();
        if (root == null){
            return mainTree;
        }
        
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        
        while (!queue.isEmpty()){
            List<Integer> subTree = new LinkedList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                subTree.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            mainTree.add(0, subTree);
        }
        return mainTree;
    }
}