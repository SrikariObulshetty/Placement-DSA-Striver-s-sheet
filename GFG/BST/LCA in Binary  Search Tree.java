/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
}*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        // code here...
        if(root==null){
            return null; 
        }
        if(n1>n2){
            return lca(root,n2,n1);
        }
        else if(n1<=root.data  && root.data<=n2){
            return root;
        }
        else if(n1<root.data){
            return lca(root.left, n1, n2);
        }
        else{
            return lca(root.right, n1, n2);
        }
        
    }
}
