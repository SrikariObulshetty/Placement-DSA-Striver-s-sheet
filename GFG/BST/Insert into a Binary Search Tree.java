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
    public TreeNode insertIntoBST(TreeNode root, int val) {
         if(root==null){
            TreeNode node = new TreeNode(val,null,null);
            return node;
         }
         else if(root.val < val){ // this val should be on the right side
               root.right = insertIntoBST(root.right, val);
         }
         else{
            root.left=insertIntoBST(root.left, val);
         }
         return root;   
    }
}
