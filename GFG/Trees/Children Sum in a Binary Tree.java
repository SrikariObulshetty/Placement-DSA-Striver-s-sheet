/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) {
        //  code here.....
        if(root==null){
            return true;
        }
        else if(root.left==null && root.right==null){ //leaf nodes
            return true;
        } 
        int sum = 0;
        sum+= root.left==null?0:root.left.data;
        sum+= root.right==null?0:root.right.data;
        if(sum!=root.data){ 
            return false;
        }
        return isSumProperty(root.left) && isSumProperty(root.right); 
        
    }
}
