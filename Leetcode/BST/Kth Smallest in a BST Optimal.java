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
    public int temp=0;
    public int ans=-1;
    public void inorder(TreeNode root,int k){
        if(root==null){
            return;
        }
        inorder(root.left,k);
        temp=temp+1;
        if(temp==k){ 
            ans=root.val; 
            return;
        }
        inorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }
} 

