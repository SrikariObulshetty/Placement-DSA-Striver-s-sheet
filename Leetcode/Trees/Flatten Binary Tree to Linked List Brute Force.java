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
    public void preorder(TreeNode root, List<TreeNode>temp){
        if(root==null){
            return;
        }
        temp.add(root);
        preorder(root.left, temp);
        preorder(root.right, temp);
    }
    public void flatten(TreeNode root) {
         //Brute Force.
         if(root==null){
            return;
         }

         List<TreeNode> temp = new ArrayList<>();
         preorder(root, temp);
         root = temp.get(0);
         TreeNode ptr = root; 
         for(int i=1;i<temp.size();i++){
            ptr.right = temp.get(i);
            ptr.left=null;
            ptr=ptr.right;
         } 
          
    }
}
