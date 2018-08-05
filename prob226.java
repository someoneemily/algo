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
    public TreeNode invertTree(TreeNode root) {
        //go through in order, add elements to array, reverse array, put back into binary tree
        //go from root and recursively go down the children, swapping as you go down each child
        if(root!=null){
            if(root.left==null && root.right == null){
                return root;
            }
            invert(root);
        }
        return root;
    }

    public void invert(TreeNode root){
        if(root.left!=null || root.right!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        if(root.left != null && (root.left.left!=null || root.left.right!=null )){
           invert(root.left);
        }
        if (root.right !=null && (root.right.left!=null ||root.right.right!=null)){
            invert(root.right);
        }
    }
}
