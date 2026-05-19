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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
          if(p.val>q.val){
            return lowestCommonAncestor(root, q, p);
          }
          int val=root.val;
          if(p.val<=val && val<=q.val){
            return root;
          }
          else if(p.val<val){ //go left
              return lowestCommonAncestor(root.left, p, q);
          }
          else{
            return lowestCommonAncestor(root.right, p, q);
          }
    }
}
