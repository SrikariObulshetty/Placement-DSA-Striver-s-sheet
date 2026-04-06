/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    
    public void postorder(Node root, ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        postorder(root.left, ans);
        postorder(root.right, ans);
        ans.add(root.data);
    }
    
    public ArrayList<Integer> postOrder(Node root) {
        // code here..
        ArrayList<Integer>al= new ArrayList<>();
        postorder(root, al);
        return al;
    }
}
