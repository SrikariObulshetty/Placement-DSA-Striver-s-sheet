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


//But in worst case this will take O(N^2) time because of while(temp.right!=null) loop, Space is O(H) - using recursion.
class Solution { 

    public TreeNode func(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode ryt = root.right;
        if(root.left==null){
            func(root.right); 
            return root;
        }
        else{
            root.right=func(root.left);
            root.left=null;
            TreeNode temp = root.right;
            while(temp.right!=null){ 
               temp.left=null;
               temp=temp.right;
            }
            temp.right = ryt;
            func(ryt);
        } 
        return root;
    }
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        func(root); 
    }
}
