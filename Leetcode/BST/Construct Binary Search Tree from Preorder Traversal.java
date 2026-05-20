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
    int preidx=0;
    public TreeNode constructBST(int[] pre, int[] inorder, int start, int end){
        if(start>end){
            return null;
        }
        int idx=start;
        while(idx<inorder.length && inorder[idx]!=pre[preidx]){  
            idx++;
        }
        TreeNode node = new TreeNode(pre[preidx++]);
        node.left= constructBST(pre, inorder, start, idx-1);
        node.right=constructBST(pre, inorder, idx+1, end); 
        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] pre = preorder.clone();
        Arrays.sort(preorder);
        int [] inorder = preorder;
        TreeNode node = constructBST(pre, inorder, 0, pre.length-1);
        return node;
    }
}
