/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int cnt=0;
    int ans=-1;
    public void inorder(Node root, int k){
        if(root==null){
            return;
        }
        inorder(root.left, k);
        cnt++;
        if(cnt == k){
            ans = root.data;
            return;
        }
        inorder(root.right, k);
    }
    public int kthSmallest(Node root, int k) {
        // code here.....
        inorder(root, k);
        return ans;
        
        
    }
}
