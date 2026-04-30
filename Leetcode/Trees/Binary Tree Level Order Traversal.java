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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>q = new LinkedList<>();
        List<List<Integer>>ans = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
           int l = q.size();
           List<Integer>sub = new ArrayList<>();
           while(l>0){
              TreeNode node=q.poll();
              if(node!=null){
                sub.add(node.val);
                q.add(node.left);
                q.add(node.right);
              }
              l--;
           }
           if(sub.size() > 0){
            ans.add(sub);
           }
           //ans.add(sub);

        }
        return ans;



    }
}
