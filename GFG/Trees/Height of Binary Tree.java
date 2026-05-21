/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here.....
        if(root==null){
            return 0;
        }
        if(root.left==null &&root.right==null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        return 1 + Math.max(l,r);
    }
}
