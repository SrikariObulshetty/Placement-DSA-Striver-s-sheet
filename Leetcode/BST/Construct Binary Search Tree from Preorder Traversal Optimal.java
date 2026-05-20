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
    public TreeNode construct(int[] preorder, int min, int max){
        if(preidx==preorder.length){
            return null;
        }
        if(preorder[preidx]<min || preorder[preidx]>max){
            return null;
        }
        TreeNode node = new TreeNode(preorder[preidx++]);
        node.left=construct(preorder, min, node.val);
        node.right=construct(preorder, node.val, max);
        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
