/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    public void traversal(ArrayList<Integer>ans, Node root){
        if(root==null){
            return;
        }
        ans.add(root.data);
        traversal(ans, root.left);
        traversal(ans, root.right);
    }
    public ArrayList<Integer> preOrder(Node root) {
        //code here.....
        ArrayList<Integer>ans = new ArrayList<>();
        traversal(ans, root);
        return ans;
    }
}
