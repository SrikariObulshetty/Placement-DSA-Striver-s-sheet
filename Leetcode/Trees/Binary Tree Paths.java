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

    public void binaryTreePaths(TreeNode root, List<String>ans,StringBuilder sb){
        if(root==null){
            ans.add(sb.toString());
            return;
        } 
        if(sb.length()==0){
            sb.append(root.val+"");
        }
        else{
            sb.append("->");
            sb.append(root.val+"");
        }
        int l = sb.length();
        if(root.left!=null){ 
            binaryTreePaths(root.left, ans, sb);
        }
        sb.setLength(l);
        if(root.right!=null){
            binaryTreePaths(root.right, ans, sb);
        }
        sb.setLength(l);
        //both are null.
        if(root.left==null && root.right==null){
            binaryTreePaths(root.left, ans, sb);
        }
        

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans = new ArrayList<>();
        binaryTreePaths(root,ans,new StringBuilder()); 
        return ans;
        
    }
}
