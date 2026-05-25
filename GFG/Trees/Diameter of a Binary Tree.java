/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int maxi=0;
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        maxi=Math.max(maxi, lh + rh);
        return 1 + Math.max(lh, rh);
        
    }
    public int diameter(Node root) {
        // code here.....
        if(root==null){
            return 0;
        }
        height(root);
        return maxi;
    }
}
