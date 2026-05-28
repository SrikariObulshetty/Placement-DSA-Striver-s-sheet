// User function Template for Java

class Solution {
    
    public static void preorder(Node root, List<Node>temp){
        if(root==null){
            return;
        }
        temp.add(root);
        preorder(root.left, temp);
        preorder(root.right, temp);
    }
    public static void flatten(Node root) {
        // code here.....
        List<Node> temp = new ArrayList<>();
        preorder(root, temp);
        Node ptr=root;
        int l=temp.size();
        for(int i=1;i<l;i++){
            ptr.right=temp.get(i);
            ptr.left=null;
            ptr=ptr.right;
        } 
    }
}
