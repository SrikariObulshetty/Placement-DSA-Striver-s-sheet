/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node insert(Node root, int key) {
        // code here.....
        if(root==null){
            return new Node(key);
        }
        else if(root.data < key){ // this keynode should be on the right of this node
           root.right = insert(root.right, key);
        }
        else{
            root.left = insert(root.left, key);
        }
        return root;
    }
}
