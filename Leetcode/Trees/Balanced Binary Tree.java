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
    boolean temp=true;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = height(root.left);
        // to immediately stop recursion,if subtree is imbalanced.
        if(l==-1){
            return -1;
        }
        int r = height(root.right);
        if(r==-1){
            return -1;
        }
        if(l-r>1 || l-r<-1){
            temp=false;
            return -1;
        }
        return 1 + Math.max(l,r);
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        height(root);
        return temp;
    }
}
