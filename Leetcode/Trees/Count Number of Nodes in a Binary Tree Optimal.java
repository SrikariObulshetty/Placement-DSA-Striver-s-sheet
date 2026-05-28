// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        // Code here.....
        if(root==null){
            return 0;
        }
        int lh = getLeftHeight(root);
        int rh = getRightHeight(root);
        if(lh==rh){ //below tree is a complete binary tree,no need to visit them, no.of nodes will be 2^h -1;
            return (1<<lh)-1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    
    public static int getLeftHeight(Node root){
        int h=0;
        while(root!=null){
            h++;
            root=root.left;
        }
        return h;
    }
    
    public static int getRightHeight(Node root){
        int h=0;
        while(root!=null){
            h++;
            root=root.right;
        }
        return h;
    }
}
