/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean inorder(TreeNode root, int val, int flag){
        if(root==null){
            return true;
        }
        if(flag==0){ // left
            if(root.val >= val){
                return false;
            }
        }
        else{
            if(root.val <= val){
                return false;
            }
        }
        return inorder(root.left, val, flag) && inorder(root.right, val, flag);
    }
    public boolean isValidBST(TreeNode root) {
         if(root==null){
            return true;
         }
         else if(root.left!=null && root.left.val >= root.val){
            return false;
         }
         else if(root.right!=null && root.right.val <= root.val){
            return false;
         }
         else{
            return isValidBST(root.left) && isValidBST(root.right) &&
            inorder(root.left, root.val, 0) && inorder(root.right, root.val, 1);
         }
         

    }
}
