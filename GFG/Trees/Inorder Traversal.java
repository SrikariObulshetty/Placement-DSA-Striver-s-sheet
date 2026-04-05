/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    
    public void inorder(ArrayList<Integer>ans, Node root){
        if(root==null){
            return;
        }
        inorder(ans, root.left);
        ans.add(root.data);
        inorder(ans, root.right);
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here...
        ArrayList<Integer>ans = new ArrayList<>();
        inorder(ans, root);
        return ans;
    }
}
