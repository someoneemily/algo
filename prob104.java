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
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root==null){
            return 0;
        }
        if(root.left!=null){
            depth = Math.max(depth, maxDepth(root.left));
        }
        if(root.right!=null){
            depth = Math.max(depth, maxDepth(root.right));
        }
        return depth+1;
    }
}
